import javascript
import semmle.javascript.dataflow.DataFlow

from DataFlow::MethodCallNode sanitize, Variable var, JsxElement elem
where sanitize.getMethodName() = "sanitize" //Finds instances of .sanitize
and var.getAnAssignedExpr() = sanitize.asExpr() //If a variable is assigned to  the instance of .sanitize
and elem.getAttributeByName("dangerouslySetInnerHTML").getAChildExpr().getAChild().getAChild().toString().regexpMatch(".*"+var.getName()+".*") //If the innermost child of a dangerouslySetInnerHtml element contains the variable


select elem, var.getName(), "If sanitazation of " + var.getName() + " is not correct this is an XSS vulnerability"