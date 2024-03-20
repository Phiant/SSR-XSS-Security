package generatedtest;

import android.content.ContentProvider;
import android.content.ContentProviderClient;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

// Test case generated by GenerateFlowTestCase.ql
public class Test {

	Object getMapKeyDefault(Object container) {
		return null;
	}

	Object getMapValueDefault(Object container) {
		return null;
	}

	Object newWithMapKeyDefault(Object element) {
		return null;
	}

	Object newWithMapValueDefault(Object element) {
		return null;
	}

	Object source() {
		return null;
	}

	void sink(Object o) {}

	public void test() throws Exception {

		{
			// "android.content;ContentProviderClient;true;applyBatch;;;Argument[this];ReturnValue;taint;manual"
			ContentProviderResult[] out = null;
			ContentProviderClient in = (ContentProviderClient) source();
			out = in.applyBatch(null);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderClient;true;applyBatch;;;Argument[this];ReturnValue;taint;manual"
			ContentProviderResult[] out = null;
			ContentProviderClient in = (ContentProviderClient) source();
			out = in.applyBatch(null, null);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderClient;true;call;;;Argument[this];ReturnValue;taint;manual"
			Bundle out = null;
			ContentProviderClient in = (ContentProviderClient) source();
			out = in.call(null, null, null);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderClient;true;call;;;Argument[this];ReturnValue;taint;manual"
			Bundle out = null;
			ContentProviderClient in = (ContentProviderClient) source();
			out = in.call(null, null, null, null);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderClient;true;canonicalize;;;Argument[this];ReturnValue;taint;manual"
			Uri out = null;
			ContentProviderClient in = (ContentProviderClient) source();
			out = in.canonicalize(null);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderClient;true;getLocalContentProvider;;;Argument[this];ReturnValue;taint;manual"
			ContentProvider out = null;
			ContentProviderClient in = (ContentProviderClient) source();
			out = in.getLocalContentProvider();
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderClient;true;getStreamTypes;;;Argument[this];ReturnValue;taint;manual"
			String[] out = null;
			ContentProviderClient in = (ContentProviderClient) source();
			out = in.getStreamTypes(null, null);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderClient;true;insert;;;Argument[this];ReturnValue;taint;manual"
			Uri out = null;
			ContentProviderClient in = (ContentProviderClient) source();
			out = in.insert(null, null);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderClient;true;insert;;;Argument[this];ReturnValue;taint;manual"
			Uri out = null;
			ContentProviderClient in = (ContentProviderClient) source();
			out = in.insert(null, null, null);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderClient;true;query;;;Argument[this];ReturnValue;taint;manual"
			Cursor out = null;
			ContentProviderClient in = (ContentProviderClient) source();
			out = in.query(null, null, null, null);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderClient;true;query;;;Argument[this];ReturnValue;taint;manual"
			Cursor out = null;
			ContentProviderClient in = (ContentProviderClient) source();
			out = in.query(null, null, null, null, null);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderClient;true;query;;;Argument[this];ReturnValue;taint;manual"
			Cursor out = null;
			ContentProviderClient in = (ContentProviderClient) source();
			out = in.query(null, null, null, null, null, null);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderClient;true;uncanonicalize;;;Argument[this];ReturnValue;taint;manual"
			Uri out = null;
			ContentProviderClient in = (ContentProviderClient) source();
			out = in.uncanonicalize(null);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderOperation$Builder;false;build;;;Argument[this];ReturnValue;taint;manual"
			ContentProviderOperation out = null;
			ContentProviderOperation.Builder in = (ContentProviderOperation.Builder) source();
			out = in.build();
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderOperation$Builder;false;withExceptionAllowed;;;Argument[this];ReturnValue;value;manual"
			ContentProviderOperation.Builder out = null;
			ContentProviderOperation.Builder in = (ContentProviderOperation.Builder) source();
			out = in.withExceptionAllowed(false);
			sink(out); // $ hasValueFlow
		}
		{
			// "android.content;ContentProviderOperation$Builder;false;withExpectedCount;;;Argument[this];ReturnValue;value;manual"
			ContentProviderOperation.Builder out = null;
			ContentProviderOperation.Builder in = (ContentProviderOperation.Builder) source();
			out = in.withExpectedCount(0);
			sink(out); // $ hasValueFlow
		}
		{
			// "android.content;ContentProviderOperation$Builder;false;withExtra;;;Argument[this];ReturnValue;value;manual"
			ContentProviderOperation.Builder out = null;
			ContentProviderOperation.Builder in = (ContentProviderOperation.Builder) source();
			out = in.withExtra(null, null);
			sink(out); // $ hasValueFlow
		}
		{
			// "android.content;ContentProviderOperation$Builder;false;withExtraBackReference;;;Argument[this];ReturnValue;value;manual"
			ContentProviderOperation.Builder out = null;
			ContentProviderOperation.Builder in = (ContentProviderOperation.Builder) source();
			out = in.withExtraBackReference(null, 0);
			sink(out); // $ hasValueFlow
		}
		{
			// "android.content;ContentProviderOperation$Builder;false;withExtraBackReference;;;Argument[this];ReturnValue;value;manual"
			ContentProviderOperation.Builder out = null;
			ContentProviderOperation.Builder in = (ContentProviderOperation.Builder) source();
			out = in.withExtraBackReference(null, 0, null);
			sink(out); // $ hasValueFlow
		}
		{
			// "android.content;ContentProviderOperation$Builder;false;withExtras;;;Argument[this];ReturnValue;value;manual"
			ContentProviderOperation.Builder out = null;
			ContentProviderOperation.Builder in = (ContentProviderOperation.Builder) source();
			out = in.withExtras(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "android.content;ContentProviderOperation$Builder;false;withSelection;;;Argument[this];ReturnValue;value;manual"
			ContentProviderOperation.Builder out = null;
			ContentProviderOperation.Builder in = (ContentProviderOperation.Builder) source();
			out = in.withSelection(null, null);
			sink(out); // $ hasValueFlow
		}
		{
			// "android.content;ContentProviderOperation$Builder;false;withSelectionBackReference;;;Argument[this];ReturnValue;value;manual"
			ContentProviderOperation.Builder out = null;
			ContentProviderOperation.Builder in = (ContentProviderOperation.Builder) source();
			out = in.withSelectionBackReference(0, 0);
			sink(out); // $ hasValueFlow
		}
		{
			// "android.content;ContentProviderOperation$Builder;false;withSelectionBackReference;;;Argument[this];ReturnValue;value;manual"
			ContentProviderOperation.Builder out = null;
			ContentProviderOperation.Builder in = (ContentProviderOperation.Builder) source();
			out = in.withSelectionBackReference(0, 0, null);
			sink(out); // $ hasValueFlow
		}
		{
			// "android.content;ContentProviderOperation$Builder;false;withValue;;;Argument[this];ReturnValue;value;manual"
			ContentProviderOperation.Builder out = null;
			ContentProviderOperation.Builder in = (ContentProviderOperation.Builder) source();
			out = in.withValue(null, null);
			sink(out); // $ hasValueFlow
		}
		{
			// "android.content;ContentProviderOperation$Builder;false;withValueBackReference;;;Argument[this];ReturnValue;value;manual"
			ContentProviderOperation.Builder out = null;
			ContentProviderOperation.Builder in = (ContentProviderOperation.Builder) source();
			out = in.withValueBackReference(null, 0);
			sink(out); // $ hasValueFlow
		}
		{
			// "android.content;ContentProviderOperation$Builder;false;withValueBackReference;;;Argument[this];ReturnValue;value;manual"
			ContentProviderOperation.Builder out = null;
			ContentProviderOperation.Builder in = (ContentProviderOperation.Builder) source();
			out = in.withValueBackReference(null, 0, null);
			sink(out); // $ hasValueFlow
		}
		{
			// "android.content;ContentProviderOperation$Builder;false;withValues;;;Argument[this];ReturnValue;value;manual"
			ContentProviderOperation.Builder out = null;
			ContentProviderOperation.Builder in = (ContentProviderOperation.Builder) source();
			out = in.withValues(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "android.content;ContentProviderOperation$Builder;false;withYieldAllowed;;;Argument[this];ReturnValue;value;manual"
			ContentProviderOperation.Builder out = null;
			ContentProviderOperation.Builder in = (ContentProviderOperation.Builder) source();
			out = in.withYieldAllowed(false);
			sink(out); // $ hasValueFlow
		}
		{
			// "android.content;ContentProviderOperation;false;apply;;;Argument[this];ReturnValue;taint;manual"
			ContentProviderResult out = null;
			ContentProviderOperation in = (ContentProviderOperation) source();
			out = in.apply(null, null, 0);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderOperation;false;apply;;;Argument[0];ReturnValue;taint;manual"
			ContentProviderResult out = null;
			ContentProvider in = (ContentProvider) source();
			ContentProviderOperation instance = null;
			out = instance.apply(in, null, 0);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderOperation;false;getUri;;;Argument[this];ReturnValue;taint;manual"
			Uri out = null;
			ContentProviderOperation in = (ContentProviderOperation) source();
			out = in.getUri();
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderOperation;false;newAssertQuery;;;Argument[0];ReturnValue;taint;manual"
			ContentProviderOperation.Builder out = null;
			Uri in = (Uri) source();
			out = ContentProviderOperation.newAssertQuery(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderOperation;false;newCall;;;Argument[0];ReturnValue;taint;manual"
			ContentProviderOperation.Builder out = null;
			Uri in = (Uri) source();
			out = ContentProviderOperation.newCall(in, null, null);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderOperation;false;newDelete;;;Argument[0];ReturnValue;taint;manual"
			ContentProviderOperation.Builder out = null;
			Uri in = (Uri) source();
			out = ContentProviderOperation.newDelete(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderOperation;false;newInsert;;;Argument[0];ReturnValue;taint;manual"
			ContentProviderOperation.Builder out = null;
			Uri in = (Uri) source();
			out = ContentProviderOperation.newInsert(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderOperation;false;newUpdate;;;Argument[0];ReturnValue;taint;manual"
			ContentProviderOperation.Builder out = null;
			Uri in = (Uri) source();
			out = ContentProviderOperation.newUpdate(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderOperation;false;resolveExtrasBackReferences;;;Argument[0];ReturnValue;taint;manual"
			Bundle out = null;
			ContentProviderResult[] in = (ContentProviderResult[]) source();
			ContentProviderOperation instance = null;
			out = instance.resolveExtrasBackReferences(in, 0);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderOperation;false;resolveSelectionArgsBackReferences;;;Argument[0];ReturnValue;taint;manual"
			String[] out = null;
			ContentProviderResult[] in = (ContentProviderResult[]) source();
			ContentProviderOperation instance = null;
			out = instance.resolveSelectionArgsBackReferences(in, 0);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderOperation;false;resolveValueBackReferences;;;Argument[0];ReturnValue;taint;manual"
			ContentValues out = null;
			ContentProviderResult[] in = (ContentProviderResult[]) source();
			ContentProviderOperation instance = null;
			out = instance.resolveValueBackReferences(in, 0);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderResult;false;ContentProviderResult;(Bundle);;Argument[0];Argument[this].Field[android.content.ContentProviderResult.extras];value;manual"
			ContentProviderResult out = null;
			Bundle in = (Bundle) source();
			out = new ContentProviderResult(in);
			sink(out.extras); // $ hasValueFlow
		}
		{
			// "android.content;ContentProviderResult;false;ContentProviderResult;(Parcel);;Argument[0];Argument[this];taint;manual"
			ContentProviderResult out = null;
			Parcel in = (Parcel) source();
			out = new ContentProviderResult(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentProviderResult;false;ContentProviderResult;(Throwable);;Argument[0];Argument[this].Field[android.content.ContentProviderResult.exception];value;manual"
			ContentProviderResult out = null;
			Throwable in = (Throwable) source();
			out = new ContentProviderResult(in);
			sink(out.exception); // $ hasValueFlow
		}
		{
			// "android.content;ContentProviderResult;false;ContentProviderResult;(Uri);;Argument[0];Argument[this].Field[android.content.ContentProviderResult.uri];value;manual"
			ContentProviderResult out = null;
			Uri in = (Uri) source();
			out = new ContentProviderResult(in);
			sink(out.uri); // $ hasValueFlow
		}
		{
			// "android.content;ContentResolver;true;acquireContentProviderClient;;;Argument[0];ReturnValue;taint;manual"
			ContentProviderClient out = null;
			String in = (String) source();
			ContentResolver instance = null;
			out = instance.acquireContentProviderClient(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentResolver;true;acquireContentProviderClient;;;Argument[0];ReturnValue;taint;manual"
			ContentProviderClient out = null;
			Uri in = (Uri) source();
			ContentResolver instance = null;
			out = instance.acquireContentProviderClient(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentResolver;true;acquireUnstableContentProviderClient;;;Argument[0];ReturnValue;taint;manual"
			ContentProviderClient out = null;
			String in = (String) source();
			ContentResolver instance = null;
			out = instance.acquireUnstableContentProviderClient(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentResolver;true;acquireUnstableContentProviderClient;;;Argument[0];ReturnValue;taint;manual"
			ContentProviderClient out = null;
			Uri in = (Uri) source();
			ContentResolver instance = null;
			out = instance.acquireUnstableContentProviderClient(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentResolver;true;applyBatch;;;Argument[1];ReturnValue;taint;manual"
			ContentProviderResult[] out = null;
			ArrayList in = (ArrayList) source();
			ContentResolver instance = null;
			out = instance.applyBatch(null, in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentResolver;true;call;;;Argument[0];ReturnValue;taint;manual"
			Bundle out = null;
			String in = (String) source();
			ContentResolver instance = null;
			out = instance.call(in, (String) null, (String) null, (Bundle) null);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentResolver;true;call;;;Argument[0];ReturnValue;taint;manual"
			Bundle out = null;
			Uri in = (Uri) source();
			ContentResolver instance = null;
			out = instance.call(in, (String) null, (String) null, (Bundle) null);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentResolver;true;canonicalize;;;Argument[0];ReturnValue;taint;manual"
			Uri out = null;
			Uri in = (Uri) source();
			ContentResolver instance = null;
			out = instance.canonicalize(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentResolver;true;getStreamTypes;;;Argument[0];ReturnValue;taint;manual"
			String[] out = null;
			Uri in = (Uri) source();
			ContentResolver instance = null;
			out = instance.getStreamTypes(in, null);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentResolver;true;getType;;;Argument[0];ReturnValue;taint;manual"
			String out = null;
			Uri in = (Uri) source();
			ContentResolver instance = null;
			out = instance.getType(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentResolver;true;insert;;;Argument[0];ReturnValue;taint;manual"
			Uri out = null;
			Uri in = (Uri) source();
			ContentResolver instance = null;
			out = instance.insert(in, null);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentResolver;true;insert;;;Argument[0];ReturnValue;taint;manual"
			Uri out = null;
			Uri in = (Uri) source();
			ContentResolver instance = null;
			out = instance.insert(in, null, null);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentResolver;true;query;;;Argument[0];ReturnValue;taint;manual"
			Cursor out = null;
			Uri in = (Uri) source();
			ContentResolver instance = null;
			out = instance.query(in, null, null, null);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentResolver;true;query;;;Argument[0];ReturnValue;taint;manual"
			Cursor out = null;
			Uri in = (Uri) source();
			ContentResolver instance = null;
			out = instance.query(in, null, null, null, null);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentResolver;true;query;;;Argument[0];ReturnValue;taint;manual"
			Cursor out = null;
			Uri in = (Uri) source();
			ContentResolver instance = null;
			out = instance.query(in, null, null, null, null, null);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentResolver;true;uncanonicalize;;;Argument[0];ReturnValue;taint;manual"
			Uri out = null;
			Uri in = (Uri) source();
			ContentResolver instance = null;
			out = instance.uncanonicalize(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentResolver;true;wrap;;;Argument[0];ReturnValue;taint;manual"
			ContentResolver out = null;
			ContentProvider in = (ContentProvider) source();
			out = ContentResolver.wrap(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentResolver;true;wrap;;;Argument[0];ReturnValue;taint;manual"
			ContentResolver out = null;
			ContentProviderClient in = (ContentProviderClient) source();
			out = ContentResolver.wrap(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.content;ContentValues;false;put;;;Argument[0];Argument[this].MapKey;value;manual"
			ContentValues out = null;
			String in = (String) source();
			out.put(in, (Boolean) null);
			sink(getMapKeyDefault(out)); // $ hasValueFlow
		}
		{
			// "android.content;ContentValues;false;put;;;Argument[0];Argument[this].MapKey;value;manual"
			ContentValues out = null;
			String in = (String) source();
			out.put(in, (Byte) null);
			sink(getMapKeyDefault(out)); // $ hasValueFlow
		}
		{
			// "android.content;ContentValues;false;put;;;Argument[0];Argument[this].MapKey;value;manual"
			ContentValues out = null;
			String in = (String) source();
			out.put(in, (Double) null);
			sink(getMapKeyDefault(out)); // $ hasValueFlow
		}
		{
			// "android.content;ContentValues;false;put;;;Argument[0];Argument[this].MapKey;value;manual"
			ContentValues out = null;
			String in = (String) source();
			out.put(in, (Float) null);
			sink(getMapKeyDefault(out)); // $ hasValueFlow
		}
		{
			// "android.content;ContentValues;false;put;;;Argument[0];Argument[this].MapKey;value;manual"
			ContentValues out = null;
			String in = (String) source();
			out.put(in, (Integer) null);
			sink(getMapKeyDefault(out)); // $ hasValueFlow
		}
		{
			// "android.content;ContentValues;false;put;;;Argument[0];Argument[this].MapKey;value;manual"
			ContentValues out = null;
			String in = (String) source();
			out.put(in, (Long) null);
			sink(getMapKeyDefault(out)); // $ hasValueFlow
		}
		{
			// "android.content;ContentValues;false;put;;;Argument[0];Argument[this].MapKey;value;manual"
			ContentValues out = null;
			String in = (String) source();
			out.put(in, (Short) null);
			sink(getMapKeyDefault(out)); // $ hasValueFlow
		}
		{
			// "android.content;ContentValues;false;put;;;Argument[0];Argument[this].MapKey;value;manual"
			ContentValues out = null;
			String in = (String) source();
			out.put(in, (String) null);
			sink(getMapKeyDefault(out)); // $ hasValueFlow
		}
		{
			// "android.content;ContentValues;false;put;;;Argument[0];Argument[this].MapKey;value;manual"
			ContentValues out = null;
			String in = (String) source();
			out.put(in, (byte[]) null);
			sink(getMapKeyDefault(out)); // $ hasValueFlow
		}
		{
			// "android.content;ContentValues;false;put;;;Argument[1];Argument[this].MapValue;value;manual"
			ContentValues out = null;
			Boolean in = (Boolean) source();
			out.put((String) null, in);
			sink(getMapValueDefault(out)); // $ hasValueFlow
		}
		{
			// "android.content;ContentValues;false;put;;;Argument[1];Argument[this].MapValue;value;manual"
			ContentValues out = null;
			Byte in = (Byte) source();
			out.put((String) null, in);
			sink(getMapValueDefault(out)); // $ hasValueFlow
		}
		{
			// "android.content;ContentValues;false;put;;;Argument[1];Argument[this].MapValue;value;manual"
			ContentValues out = null;
			Double in = (Double) source();
			out.put((String) null, in);
			sink(getMapValueDefault(out)); // $ hasValueFlow
		}
		{
			// "android.content;ContentValues;false;put;;;Argument[1];Argument[this].MapValue;value;manual"
			ContentValues out = null;
			Float in = (Float) source();
			out.put((String) null, in);
			sink(getMapValueDefault(out)); // $ hasValueFlow
		}
		{
			// "android.content;ContentValues;false;put;;;Argument[1];Argument[this].MapValue;value;manual"
			ContentValues out = null;
			Integer in = (Integer) source();
			out.put((String) null, in);
			sink(getMapValueDefault(out)); // $ hasValueFlow
		}
		{
			// "android.content;ContentValues;false;put;;;Argument[1];Argument[this].MapValue;value;manual"
			ContentValues out = null;
			Long in = (Long) source();
			out.put((String) null, in);
			sink(getMapValueDefault(out)); // $ hasValueFlow
		}
		{
			// "android.content;ContentValues;false;put;;;Argument[1];Argument[this].MapValue;value;manual"
			ContentValues out = null;
			Short in = (Short) source();
			out.put((String) null, in);
			sink(getMapValueDefault(out)); // $ hasValueFlow
		}
		{
			// "android.content;ContentValues;false;put;;;Argument[1];Argument[this].MapValue;value;manual"
			ContentValues out = null;
			String in = (String) source();
			out.put((String) null, in);
			sink(getMapValueDefault(out)); // $ hasValueFlow
		}
		{
			// "android.content;ContentValues;false;put;;;Argument[1];Argument[this].MapValue;value;manual"
			ContentValues out = null;
			byte[] in = (byte[]) source();
			out.put((String) null, in);
			sink(getMapValueDefault(out)); // $ hasValueFlow
		}
		{
			// "android.content;ContentValues;false;putAll;;;Argument[0].MapKey;Argument[this].MapKey;value;manual"
			ContentValues out = null;
			ContentValues in = (ContentValues) newWithMapKeyDefault(source());
			out.putAll(in);
			sink(getMapKeyDefault(out)); // $ hasValueFlow
		}
		{
			// "android.content;ContentValues;false;putAll;;;Argument[0].MapValue;Argument[this].MapValue;value;manual"
			ContentValues out = null;
			ContentValues in = (ContentValues) newWithMapValueDefault(source());
			out.putAll(in);
			sink(getMapValueDefault(out)); // $ hasValueFlow
		}
		{
			// "android.database;Cursor;true;copyStringToBuffer;;;Argument[this];Argument[1];taint;manual"
			CharArrayBuffer out = null;
			Cursor in = (Cursor) source();
			in.copyStringToBuffer(0, out);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.database;Cursor;true;getBlob;;;Argument[this];ReturnValue;taint;manual"
			byte[] out = null;
			Cursor in = (Cursor) source();
			out = in.getBlob(0);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.database;Cursor;true;getColumnName;;;Argument[this];ReturnValue;taint;manual"
			String out = null;
			Cursor in = (Cursor) source();
			out = in.getColumnName(0);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.database;Cursor;true;getColumnNames;;;Argument[this];ReturnValue;taint;manual"
			String[] out = null;
			Cursor in = (Cursor) source();
			out = in.getColumnNames();
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.database;Cursor;true;getExtras;;;Argument[this];ReturnValue;taint;manual"
			Bundle out = null;
			Cursor in = (Cursor) source();
			out = in.getExtras();
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.database;Cursor;true;getNotificationUri;;;Argument[this];ReturnValue;taint;manual"
			Uri out = null;
			Cursor in = (Cursor) source();
			out = in.getNotificationUri();
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.database;Cursor;true;getNotificationUris;;;Argument[this];ReturnValue;taint;manual"
			List out = null;
			Cursor in = (Cursor) source();
			out = in.getNotificationUris();
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.database;Cursor;true;getString;;;Argument[this];ReturnValue;taint;manual"
			String out = null;
			Cursor in = (Cursor) source();
			out = in.getString(0);
			sink(out); // $ hasTaintFlow
		}
		{
			// "android.database;Cursor;true;respond;;;Argument[this];ReturnValue;taint;manual"
			Bundle out = null;
			Cursor in = (Cursor) source();
			out = in.respond(null);
			sink(out); // $ hasTaintFlow
		}

	}

}
