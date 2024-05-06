import javascript
import semmle.javascript.dataflow.DataFlow

from DataFlow::PropWrite write
where write.getPropertyName() = "dangerouslySetInnerHTML"
select write

