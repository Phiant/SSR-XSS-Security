import javascript
import semmle.javascript.security.dataflow.DomBasedXssQuery
import semmle.javascript.JSX

from JsxElement element, JsxElement source, DataFlow::Configuration cfg
where element.getName() = "a" and source.getName() = "input"
  and exists(JsxAttribute attr | 
    attr = element.getAttributeByName("href")
    and cfg.hasFlow(source.flow(), element.flow())
    )
select element, source, "This <a href> tag's href attribute may be set by user input."
/*where element.getName() = "a"

    and exists(JsxAttribute attr | 
    attr = element.getAttribute("href") and 
    cfg.hasFlow(source, attr.getInit())
  )
select element, source, "This <a href> tag's href attribute may be set by user input."*/