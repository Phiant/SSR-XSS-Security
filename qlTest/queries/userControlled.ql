import javascript
import semmle.javascript.JSX

from JsxElement element, JsxElement source
where source.getName() = "input" and element.getName() = "a" and //source is input and is an a tag
  (source.getAnAttribute().getAChildExpr().toString() =
  element.getAttributeByName("href").getAChild().getAChildExpr().toString())
  //compares if input sets a variable and if a variable with the same name
  //then is used to set the href attribute of an a tag
select source, element, "<a> tag potentially controlled by user input."
//print input and a tag location