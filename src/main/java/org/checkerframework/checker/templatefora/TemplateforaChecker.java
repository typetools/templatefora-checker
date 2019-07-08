package org.checkerframework.checker.templatefora;

import org.checkerframework.common.basetype.BaseTypeChecker;
import org.checkerframework.framework.source.SuppressWarningsKeys;

/**
 * Empty Checker is the entry point for pluggable type-checking.
 *
 * <p>This one does nothing. The Checker Framework manual tells you how to make it do something:
 * https://checkerframework.org/manual/#creating-a-checker
 */
@SuppressWarningsKeys({"templatefora"})
public class TemplateforaChecker extends BaseTypeChecker {}
