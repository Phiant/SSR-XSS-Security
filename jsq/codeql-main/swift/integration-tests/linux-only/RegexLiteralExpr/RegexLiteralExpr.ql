// generated by codegen/codegen.py
import codeql.swift.elements

from RegexLiteralExpr x, Type getType, string getPattern, int getVersion
where
  x.getLocation().getFile().getName().matches("%/regex.swift") and
  getType = x.getType() and
  getPattern = x.getPattern() and
  getVersion = x.getVersion()
select x, "getType:", getType, "getPattern:", getPattern, "getVersion:", getVersion