var data = 'lorem <b>ipsum</b>';
import type {ActionFunctionArgs, LoaderFunctionArgs } from "@remix-run/node";
import type {CommentRecord} from "../dataComments"
import invariant from "tiny-invariant";
import { json,redirect } from "@remix-run/node";

import {  createEmptyComment, getComments, updateComment, CommentMutation } from "../dataComments";

import { Form, useLoaderData, LiveReload } from "@remix-run/react";


export const loader = async ({
  request,
}: LoaderFunctionArgs) => {
  const url = new URL(request.url);
  const q = url.searchParams.get("q");
  const comments = await getComments(q);
  return json({ comments, q });
};

export const action = async ({
  params,
  request,
}: ActionFunctionArgs) => {
  const comment = await createEmptyComment();
  invariant(comment.id, "Missing commentId param");
  const formData = await request.formData();
  const updates = Object.fromEntries(formData);
  await updateComment(comment.id, updates);
  return redirect(`/`);
};


export default function Index() {
    const { comments, q } = useLoaderData<typeof loader>();
    return (
      <div>
      <p id="index-page">
       
      </p>

      
      {/* <form method="get" action="/search"> 
        <label>Search <input name="term" type="text" /></label>
        <button type="submit">Search</button>
    </form>*/}
    

      {/*
      <form id="myForm">
        Full name: <input id="userName" type="text" name="fname"/>
        <br></br>
        Email : <input id="userEmail" type="text" name="email"/>
        <br></br>
        <textarea id ="userComment" rows="4" cols="50" name="comment">
          Enter comment here...
        </textarea>
        <br></br>
        <button type="submit">Add</button>
      </form>
      <input type="button" onClick={newComment} value="Submit"/>
      <h5>Comments :</h5>
      <p id="data"></p>
  */}
  <Form key={"test"} id="comment-form" method="post">
      {/*<p>
        <span>Full Name</span>
        <input
          aria-label="First name"
          name="fullName"
          type="text"
          placeholder="full name"
        />
 
      </p>
      <label>
        <span>Email</span>
        <input
          name="email"
          placeholder="email"
          type="text"
        />
      </label>*/}
      <label>
        <span>Comment:</span>
        <br></br>
        <textarea
          aria-label="The comment"
          name="comment"
          placeholder="enter comment here"
        />
      </label>

      <p>
        <button type="submit">Save</button>
        
      </p>
    </Form>


      {comments.length ? (
        <ul>
          {comments.map((comment) => (
            <li key={comment.id}>

                { comment.comment ? (
                  <>
                    {comment.comment}
                  </>
                ) : (
                  <i>No Comments</i>
                )}{" "}

            </li>
          ))}
        </ul>
      ): (
        <i>No Name</i>
      )}{" "}

      </div>

    );
  }
{/*
export async function newComment(){

  const comment = await createEmptyComment();
  console.log("-----");
  console.log(comment);
  console.log("-----");
  
  comment.fullName = document.getElementById("userName").value;
  comment.email = document.getElementById("userEmail").value;
  comment.comment = document.getElementById("userComment").value;

  const updated: Record<CommentMutation, string | undefined> = {
    fullName: comment.fullName as string,
    email: comment.email as string, 
    comment: comment.comment as string, 
    id:comment.id};
  const tmp = await updateComment(comment.id, updated);      
  console.log("test3")
  console.log(tmp);
  
}*/}

  