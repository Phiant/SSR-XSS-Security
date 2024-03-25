// generated by codegen/codegen.py
/**
 * This module provides the generated definition of `SuperRefExpr`.
 * INTERNAL: Do not import directly.
 */

private import codeql.swift.generated.Synth
private import codeql.swift.generated.Raw
import codeql.swift.elements.expr.Expr
import codeql.swift.elements.decl.VarDecl

/**
 * INTERNAL: This module contains the fully generated definition of `SuperRefExpr` and should not
 * be referenced directly.
 */
module Generated {
  /**
   * INTERNAL: Do not reference the `Generated::SuperRefExpr` class directly.
   * Use the subclass `SuperRefExpr`, where the following predicates are available.
   */
  class SuperRefExpr extends Synth::TSuperRefExpr, Expr {
    override string getAPrimaryQlClass() { result = "SuperRefExpr" }

    /**
     * Gets the self of this super reference expression.
     */
    VarDecl getSelf() {
      result =
        Synth::convertVarDeclFromRaw(Synth::convertSuperRefExprToRaw(this)
              .(Raw::SuperRefExpr)
              .getSelf())
    }
  }
}