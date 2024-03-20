// generated by codegen/codegen.py
/**
 * This module provides the generated definition of `FloatLiteralExpr`.
 * INTERNAL: Do not import directly.
 */

private import codeql.swift.generated.Synth
private import codeql.swift.generated.Raw
import codeql.swift.elements.expr.NumberLiteralExpr

/**
 * INTERNAL: This module contains the fully generated definition of `FloatLiteralExpr` and should not
 * be referenced directly.
 */
module Generated {
  /**
   * INTERNAL: Do not reference the `Generated::FloatLiteralExpr` class directly.
   * Use the subclass `FloatLiteralExpr`, where the following predicates are available.
   */
  class FloatLiteralExpr extends Synth::TFloatLiteralExpr, NumberLiteralExpr {
    override string getAPrimaryQlClass() { result = "FloatLiteralExpr" }

    /**
     * Gets the string value of this float literal expression.
     */
    string getStringValue() {
      result = Synth::convertFloatLiteralExprToRaw(this).(Raw::FloatLiteralExpr).getStringValue()
    }
  }
}
