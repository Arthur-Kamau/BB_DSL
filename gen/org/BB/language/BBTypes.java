// This is a generated file. Not intended for manual editing.
package org.BB.language;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.BB.language.psi.impl.*;

public interface BBTypes {

  IElementType APP_CLASS_DEFINITION = new IElementType("APP_CLASS_DEFINITION", null);
  IElementType APP_FUNCTION_DEFINITION = new IElementType("APP_FUNCTION_DEFINITION", null);
  IElementType ASSIGNMENT_STATEMENT = new IElementType("ASSIGNMENT_STATEMENT", null);
  IElementType CLASS_DEFINITION = new IElementType("CLASS_DEFINITION", null);
  IElementType FUNCTION_BODY = new IElementType("FUNCTION_BODY", null);
  IElementType FUNCTION_DEFINITION = new IElementType("FUNCTION_DEFINITION", null);
  IElementType FUNCTION_INVOCATION = new IElementType("FUNCTION_INVOCATION", null);
  IElementType IMPORT_DECLARATIONS = new IElementType("IMPORT_DECLARATIONS", null);
  IElementType IMPORT_STATEMENT = new IElementType("IMPORT_STATEMENT", null);
  IElementType PACKAGE_DEFINITION = new IElementType("PACKAGE_DEFINITION", null);
  IElementType SEPARATOR = new IElementType("SEPARATOR", null);
  IElementType STATEMENT = new IElementType("STATEMENT", null);
  IElementType TYPE = new IElementType("TYPE", null);
  IElementType VARIABLE_DEFINITION = new IElementType("VARIABLE_DEFINITION", null);

  IElementType ADD = new IElementType("+", null);
  IElementType ALIAS = new IElementType("alias", null);
  IElementType AND = new IElementType("&", null);
  IElementType ARROW = new IElementType("->", null);
  IElementType ASSERT = new IElementType("assert", null);
  IElementType ASSIGN = new IElementType("=", null);
  IElementType ASYNC = new IElementType("async", null);
  IElementType AT = new IElementType("@", null);
  IElementType AWAIT = new IElementType("await", null);
  IElementType BREAK = new IElementType("break", null);
  IElementType CASE = new IElementType("case", null);
  IElementType CATCH = new IElementType("catch", null);
  IElementType CHAR = new IElementType("char", null);
  IElementType CLASS = new IElementType("class", null);
  IElementType CLOSE_BRACE = new IElementType(")", null);
  IElementType CLOSE_BRACKETS = new IElementType("}", null);
  IElementType CLOSE_QUOTE = new IElementType("\"", null);
  IElementType COLON = new IElementType(":", null);
  IElementType COLONCOLON = new IElementType("::", null);
  IElementType COMMA = new IElementType(",", null);
  IElementType COMMENT = new IElementType("comment", null);
  IElementType CONST = new IElementType("const", null);
  IElementType CONTINUE = new IElementType("continue", null);
  IElementType DEFAULT = new IElementType("default", null);
  IElementType DIVIDE = new IElementType("/", null);
  IElementType DO = new IElementType("do", null);
  IElementType DOLLAR = new IElementType("$", null);
  IElementType DOT = new IElementType(".", null);
  IElementType DOT_DOT = new IElementType("..", null);
  IElementType DOT_DOT_DOT = new IElementType("...", null);
  IElementType DOT_DOT_DOT_QUEST = new IElementType("...?", null);
  IElementType DOUBLE = new IElementType("double", null);
  IElementType ELSE = new IElementType("else", null);
  IElementType ENUM = new IElementType("enum", null);
  IElementType EQUAL = new IElementType("==", null);
  IElementType EXTENDS = new IElementType("extends", null);
  IElementType FALSE = new IElementType("false", null);
  IElementType FINAL = new IElementType("final", null);
  IElementType FINALLY = new IElementType("finally", null);
  IElementType FOR = new IElementType("for", null);
  IElementType FUNCTION = new IElementType("function", null);
  IElementType GREATER_THAN = new IElementType(">", null);
  IElementType HIDE = new IElementType("hide", null);
  IElementType IDENTIFIER = new IElementType("IDENTIFIER", null);
  IElementType IF = new IElementType("if", null);
  IElementType IMPLEMENTS = new IElementType("implements", null);
  IElementType IMPORT = new IElementType("import", null);
  IElementType IN = new IElementType("in", null);
  IElementType INT = new IElementType("int", null);
  IElementType INTEGER_LITERAL = new IElementType("INTEGER_LITERAL", null);
  IElementType IS = new IElementType("is", null);
  IElementType KEY = new IElementType("key", null);
  IElementType LATE = new IElementType("late", null);
  IElementType LESS_THAN = new IElementType("<", null);
  IElementType LET = new IElementType("let", null);
  IElementType LIBRARY = new IElementType("library", null);
  IElementType LONG_LITERAL = new IElementType("LONG_LITERAL", null);
  IElementType LOOP = new IElementType("loop", null);
  IElementType LSQUAREBRACKET = new IElementType("[", null);
  IElementType MINUS = new IElementType("-", null);
  IElementType MINUS_EQ = new IElementType("-=", null);
  IElementType MINUS_MINUS = new IElementType("--", null);
  IElementType MIXIN = new IElementType("mixin", null);
  IElementType MULTIPLY = new IElementType("*", null);
  IElementType MUTABLE = new IElementType("mut", null);
  IElementType NATIVE = new IElementType("native", null);
  IElementType NEQ = new IElementType("!=", null);
  IElementType NEW = new IElementType("new", null);
  IElementType NEW_LINE = new IElementType("NEW_LINE", null);
  IElementType NOT = new IElementType("!", null);
  IElementType NULL = new IElementType("null", null);
  IElementType OF = new IElementType("of", null);
  IElementType ON = new IElementType("on", null);
  IElementType OPEN_BRACE = new IElementType("(", null);
  IElementType OPEN_BRACKETS = new IElementType("{", null);
  IElementType OPERATOR = new IElementType("operator", null);
  IElementType OVERRIDE = new IElementType("overide", null);
  IElementType PACKAGE = new IElementType("package", null);
  IElementType PART = new IElementType("part", null);
  IElementType PLUS_EQ = new IElementType("+=", null);
  IElementType PLUS_PLUS = new IElementType("++", null);
  IElementType QUEST_DOT_DOT = new IElementType("?..", null);
  IElementType REQUIRED = new IElementType("required", null);
  IElementType RETHROW = new IElementType("rethrow", null);
  IElementType RETURN = new IElementType("return", null);
  IElementType RETURNS = new IElementType("returns", null);
  IElementType RSQUAREBRACKET = new IElementType("]", null);
  IElementType SEMI_COLON = new IElementType(";", null);
  IElementType SET = new IElementType("set", null);
  IElementType SHOW = new IElementType("show", null);
  IElementType STATIC = new IElementType("static", null);
  IElementType STRING = new IElementType("string", null);
  IElementType STRUCT = new IElementType("struct", null);
  IElementType SUPER = new IElementType("super", null);
  IElementType SWITCH = new IElementType("switch", null);
  IElementType SYNC = new IElementType("sync", null);
  IElementType THIS = new IElementType("this", null);
  IElementType THROW = new IElementType("throw", null);
  IElementType TRUE = new IElementType("true", null);
  IElementType TRY = new IElementType("try", null);
  IElementType TYPEDEF = new IElementType("typedef", null);
  IElementType TYPE_KW = new IElementType("type", null);
  IElementType UNDERSCORE = new IElementType("_", null);
  IElementType USE = new IElementType("use", null);
  IElementType VALUE = new IElementType("value", null);
  IElementType VARIABLE = new IElementType("var", null);
  IElementType WHEN = new IElementType("when", null);
  IElementType WHERE = new IElementType("where", null);
  IElementType WHITE_SPACE = new IElementType("WHITE_SPACE", null);
  IElementType YIELD = new IElementType("yield", null);

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == APP_CLASS_DEFINITION) {
        return new BBAppClassDefinitionImpl(node);
      }
      else if (type == APP_FUNCTION_DEFINITION) {
        return new BBAppFunctionDefinitionImpl(node);
      }
      else if (type == ASSIGNMENT_STATEMENT) {
        return new BBAssignmentStatementImpl(node);
      }
      else if (type == CLASS_DEFINITION) {
        return new BBClassDefinitionImpl(node);
      }
      else if (type == FUNCTION_BODY) {
        return new BBFunctionBodyImpl(node);
      }
      else if (type == FUNCTION_DEFINITION) {
        return new BBFunctionDefinitionImpl(node);
      }
      else if (type == FUNCTION_INVOCATION) {
        return new BBFunctionInvocationImpl(node);
      }
      else if (type == IMPORT_DECLARATIONS) {
        return new BBImportDeclarationsImpl(node);
      }
      else if (type == IMPORT_STATEMENT) {
        return new BBImportStatementImpl(node);
      }
      else if (type == PACKAGE_DEFINITION) {
        return new BBPackageDefinitionImpl(node);
      }
      else if (type == SEPARATOR) {
        return new BBSeparatorImpl(node);
      }
      else if (type == STATEMENT) {
        return new BBStatementImpl(node);
      }
      else if (type == TYPE) {
        return new BBTypeImpl(node);
      }
      else if (type == VARIABLE_DEFINITION) {
        return new BBVariableDefinitionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
