////////////////////////////////////////////////////////////////////////////////
// 🛑 Nothing in here has anything to do with Remix, it's just a fake database
////////////////////////////////////////////////////////////////////////////////

import { matchSorter } from "match-sorter";
// @ts-expect-error - no types, but it's a tiny function
import sortBy from "sort-by";
import invariant from "tiny-invariant";

export type CommentMutation = {
  id?: string;
  fullName?: string;
  email?: string;
  comment?: string;
  
};

export type CommentRecord = CommentMutation & {
  id: string;
  createdAt: string;
};

////////////////////////////////////////////////////////////////////////////////
// This is just a fake DB table. In a real app you'd be talking to a real db or
// fetching from an existing API.
const fakeComments = {
  records: {} as Record<string, CommentRecord>,

  async getAll(): Promise<CommentRecord[]> {
    return Object.keys(fakeComments.records)
      .map((key) => fakeComments.records[key])
      .sort(sortBy("-createdAt", "last"));
  },

  async get(id: string): Promise<CommentRecord | null> {
    return fakeComments.records[id] || null;
  },

  async create(values: CommentMutation): Promise<CommentRecord> {
    const id = values.id || Math.random().toString(36).substring(2, 9);
    const createdAt = new Date().toISOString();
    const newComment = { id, createdAt, ...values };
    fakeComments.records[id] = newComment;
    return newComment;
  },

  async set(id: string, values: CommentMutation): Promise<CommentRecord> {
    const comment = await fakeComments.get(id);
    invariant(comment, `No comment found for ${id}`);
    const updatedComment = { ...comment, ...values };
    fakeComments.records[id] = updatedComment;
    return updatedComment;
  },

  destroy(id: string): null {
    delete fakeComments.records[id];
    return null;
  },
};

////////////////////////////////////////////////////////////////////////////////
// Handful of helper functions to be called from route loaders and actions
export async function getComments(query?: string | null) {
  await new Promise((resolve) => setTimeout(resolve, 500));
  let comments = await fakeComments.getAll();
  if (query) {
    comments = matchSorter(comments, query, {
      keys: ["first", "last"],
    });
  }
  return comments.sort(sortBy("last", "createdAt"));
}

export async function createEmptyComment() {
  const comment = await fakeComments.create({});
  return comment;
}

export async function getComment(id: string) {
  return fakeComments.get(id);
}

export async function updateComment(id: string, updates: CommentMutation) {
  const comment = await fakeComments.get(id);
  if (!comment) {
    throw new Error(`No comment found for ${id}`);
  }
  await fakeComments.set(id, { ...comment, ...updates });
  console.log("new Comment");
  return comment;
}

export async function deleteComment(id: string) {
  fakeComments.destroy(id);
}

[
  {
    email:
      "user.email@yahoo.com",
    fullName: "Shruti Kapoor",
    comment: "I like my new shorts",
  },
  {
    email:
      "david.accounting@company.com",
    fullName: "David Eriksson",
    comment: "Who bought shorts with the company credit card?!",
  },
].forEach((comment) => {
  fakeComments.create({
    ...comment,
    id: `${comment.fullName.toLowerCase()}-${comment.comment.toLocaleLowerCase()}`,
  });
});
