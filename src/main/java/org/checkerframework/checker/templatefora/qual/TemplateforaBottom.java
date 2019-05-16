package org.checkerframework.checker.templatefora.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.ImplicitFor;
import org.checkerframework.framework.qual.LiteralKind;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.TargetLocations;
import org.checkerframework.framework.qual.TypeUseLocation;

/**
 * The bottom type for the TemplateFora Checker's type system.
 *
 * Bottom types are the default for null and for the java.lang.Void class
 * for most type systems. The @ImplicitFor annotation below declaratively
 * tells the typechecker to make this annotation the default for those
 * values.
 *
 * When adding your own qualifiers, you should change this class' @SubtypeOf
 * annotation to indicate which qualifiers are at the bottom of your lattice.
 */
@SubtypeOf({TemplateforaUnknown.class})
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@TargetLocations({TypeUseLocation.EXPLICIT_LOWER_BOUND, TypeUseLocation.EXPLICIT_UPPER_BOUND})
@ImplicitFor(literals = LiteralKind.NULL, typeNames = java.lang.Void.class)
public @interface TemplateforaBottom {}
