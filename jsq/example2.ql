/**
 * This is an automatically generated file
 * @name Hello world
 * @kind problem
 * @problem.severity warning
 * @id javascript/example/hello-world
 */

import javascript

from File f
where f.getExtension()="tsx"
select f, f.getBaseName()