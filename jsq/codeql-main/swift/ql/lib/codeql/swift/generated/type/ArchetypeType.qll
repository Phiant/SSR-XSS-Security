// generated by codegen/codegen.py
/**
 * This module provides the generated definition of `ArchetypeType`.
 * INTERNAL: Do not import directly.
 */

private import codeql.swift.generated.Synth
private import codeql.swift.generated.Raw
import codeql.swift.elements.decl.ProtocolDecl
import codeql.swift.elements.type.SubstitutableType
import codeql.swift.elements.type.Type

/**
 * INTERNAL: This module contains the fully generated definition of `ArchetypeType` and should not
 * be referenced directly.
 */
module Generated {
  /**
   * INTERNAL: Do not reference the `Generated::ArchetypeType` class directly.
   * Use the subclass `ArchetypeType`, where the following predicates are available.
   */
  class ArchetypeType extends Synth::TArchetypeType, SubstitutableType {
    /**
     * Gets the interface type of this archetype type.
     *
     * This includes nodes from the "hidden" AST. It can be overridden in subclasses to change the
     * behavior of both the `Immediate` and non-`Immediate` versions.
     */
    Type getImmediateInterfaceType() {
      result =
        Synth::convertTypeFromRaw(Synth::convertArchetypeTypeToRaw(this)
              .(Raw::ArchetypeType)
              .getInterfaceType())
    }

    /**
     * Gets the interface type of this archetype type.
     */
    final Type getInterfaceType() {
      exists(Type immediate |
        immediate = this.getImmediateInterfaceType() and
        if exists(this.getResolveStep()) then result = immediate else result = immediate.resolve()
      )
    }

    /**
     * Gets the superclass of this archetype type, if it exists.
     *
     * This includes nodes from the "hidden" AST. It can be overridden in subclasses to change the
     * behavior of both the `Immediate` and non-`Immediate` versions.
     */
    Type getImmediateSuperclass() {
      result =
        Synth::convertTypeFromRaw(Synth::convertArchetypeTypeToRaw(this)
              .(Raw::ArchetypeType)
              .getSuperclass())
    }

    /**
     * Gets the superclass of this archetype type, if it exists.
     */
    final Type getSuperclass() {
      exists(Type immediate |
        immediate = this.getImmediateSuperclass() and
        if exists(this.getResolveStep()) then result = immediate else result = immediate.resolve()
      )
    }

    /**
     * Holds if `getSuperclass()` exists.
     */
    final predicate hasSuperclass() { exists(this.getSuperclass()) }

    /**
     * Gets the `index`th protocol of this archetype type (0-based).
     */
    ProtocolDecl getProtocol(int index) {
      result =
        Synth::convertProtocolDeclFromRaw(Synth::convertArchetypeTypeToRaw(this)
              .(Raw::ArchetypeType)
              .getProtocol(index))
    }

    /**
     * Gets any of the protocols of this archetype type.
     */
    final ProtocolDecl getAProtocol() { result = this.getProtocol(_) }

    /**
     * Gets the number of protocols of this archetype type.
     */
    final int getNumberOfProtocols() { result = count(int i | exists(this.getProtocol(i))) }
  }
}
