// generated by codegen/codegen.py
import codeql.swift.elements
import TestUtils

from VariadicSequenceType x, string getName, Type getCanonicalType, Type getBaseType
where
  toBeTested(x) and
  not x.isUnknown() and
  getName = x.getName() and
  getCanonicalType = x.getCanonicalType() and
  getBaseType = x.getBaseType()
select x, "getName:", getName, "getCanonicalType:", getCanonicalType, "getBaseType:", getBaseType
