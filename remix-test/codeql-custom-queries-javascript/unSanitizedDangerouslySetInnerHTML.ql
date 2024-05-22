import javascript
import semmle.javascript.dataflow.DataFlow

from DataFlow::MethodCallNode sanitize, Variable var, JsxElement safeUse, JsxElement unsafeUse
where sanitize.getMethodName() = "sanitize" //Finds instances of .sanitize
and var.getAnAssignedExpr() = sanitize.asExpr()//If a variable is assigned to  the instance of .sanitize
and safeUse.getAttributeByName("dangerouslySetInnerHTML").getAChildExpr().getAChild().getAChild().toString().regexpMatch(".*"+var.getName()+".*")//If the innermost child of a dangerouslySetInnerHtml element contains the variable
and unsafeUse.getAttributeByName("dangerouslySetInnerHTML") != safeUse.getAttributeByName("dangerouslySetInnerHTML") //All other instances of dangerouslySetInnerHtml

select unsafeUse, "Unsanitized input, vulnerable to XSS"