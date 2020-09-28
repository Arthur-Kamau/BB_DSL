// This is a generated file. Not intended for manual editing.
package org.BB.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.BB.language.BBElementType;
import org.BB.language.BBTokenType;
import org.BB.language.psi.impl.*;

public interface BBTypes {

  IElementType ASSIGNMENT_STATEMENT = new BBElementType("ASSIGNMENT_STATEMENT");
  IElementType DEFINITION = new BBElementType("DEFINITION");
  IElementType FUNCTION_BODY = new BBElementType("FUNCTION_BODY");
  IElementType FUNCTION_DEFINITION = new BBElementType("FUNCTION_DEFINITION");
  IElementType FUNCTION_INVOCATION = new BBElementType("FUNCTION_INVOCATION");
  IElementType STATEMENT = new BBElementType("STATEMENT");
  IElementType TYPE = new BBElementType("TYPE");
  IElementType VARIABLE_DEFINITION = new BBElementType("VARIABLE_DEFINITION");

  IElementType ADD = new BBTokenType("+");
  IElementType ALIAS = new BBTokenType("alias");
  IElementType AND = new BBTokenType("&");
  IElementType ARROW = new BBTokenType("->");
  IElementType ASSERT = new BBTokenType("assert");
  IElementType ASSIGN = new BBTokenType("=");
  IElementType ASYNC = new BBTokenType("async");
  IElementType AT = new BBTokenType("@");
  IElementType AWAIT = new BBTokenType("await");
  IElementType BREAK = new BBTokenType("break");
  IElementType CASE = new BBTokenType("case");
  IElementType CATCH = new BBTokenType("catch");
  IElementType CHAR = new BBTokenType("char");
  IElementType CLASS = new BBTokenType("class");
  IElementType CLOSE_BRACE = new BBTokenType(")");
  IElementType CLOSE_BRACKETS = new BBTokenType("}");
  IElementType CLOSE_QUOTE = new BBTokenType("\"");
  IElementType COLON = new BBTokenType(":");
  IElementType COLONCOLON = new BBTokenType("::");
  IElementType COMMA = new BBTokenType(",");
  IElementType COMMENT = new BBTokenType("comment");
  IElementType CONST = new BBTokenType("const");
  IElementType CONTINUE = new BBTokenType("continue");
  IElementType DEFAULT = new BBTokenType("default");
  IElementType DIVIDE = new BBTokenType("/");
  IElementType DO = new BBTokenType("do");
  IElementType DOLLAR = new BBTokenType("$");
  IElementType DOT = new BBTokenType(".");
  IElementType DOT_DOT = new BBTokenType("..");
  IElementType DOT_DOT_DOT = new BBTokenType("...");
  IElementType DOT_DOT_DOT_QUEST = new BBTokenType("...?");
  IElementType DOUBLE = new BBTokenType("double");
  IElementType ELSE = new BBTokenType("else");
  IElementType ENUM = new BBTokenType("enum");
  IElementType EQUAL = new BBTokenType("==");
  IElementType EXTENDS = new BBTokenType("extends");
  IElementType FALSE = new BBTokenType("false");
  IElementType FINAL = new BBTokenType("final");
  IElementType FINALLY = new BBTokenType("finally");
  IElementType FOR = new BBTokenType("for");
  IElementType FUNCTION = new BBTokenType("function");
  IElementType GREATER_THAN = new BBTokenType(">");
  IElementType HIDE = new BBTokenType("hide");
  IElementType IDENTIFIER = new BBTokenType("IDENTIFIER");
  IElementType IF = new BBTokenType("if");
  IElementType IMPLEMENTS = new BBTokenType("implements");
  IElementType IMPORT = new BBTokenType("import");
  IElementType IN = new BBTokenType("in");
  IElementType INT = new BBTokenType("int");
  IElementType INTEGER_LITERAL = new BBTokenType("INTEGER_LITERAL");
  IElementType IS = new BBTokenType("is");
  IElementType KEY = new BBTokenType("key");
  IElementType LATE = new BBTokenType("late");
  IElementType LESS_THAN = new BBTokenType("<");
  IElementType LET = new BBTokenType("let");
  IElementType LIBRARY = new BBTokenType("library");
  IElementType LONG_LITERAL = new BBTokenType("LONG_LITERAL");
  IElementType LOOP = new BBTokenType("loop");
  IElementType LSQUAREBRACKET = new BBTokenType("[");
  IElementType MINUS = new BBTokenType("-");
  IElementType MINUS_EQ = new BBTokenType("-=");
  IElementType MINUS_MINUS = new BBTokenType("--");
  IElementType MIXIN = new BBTokenType("mixin");
  IElementType MULTIPLY = new BBTokenType("*");
  IElementType MUTABLE = new BBTokenType("mut");
  IElementType NATIVE = new BBTokenType("native");
  IElementType NEQ = new BBTokenType("!=");
  IElementType NEW = new BBTokenType("new");
  IElementType NOT = new BBTokenType("!");
  IElementType NULL = new BBTokenType("null");
  IElementType OF = new BBTokenType("of");
  IElementType ON = new BBTokenType("on");
  IElementType OPEN_BRACE = new BBTokenType("(");
  IElementType OPEN_BRACKETS = new BBTokenType("{");
  IElementType OPERATOR = new BBTokenType("operator");
  IElementType OVERRIDE = new BBTokenType("overide");
  IElementType PACKAGE = new BBTokenType("package");
  IElementType PART = new BBTokenType("part");
  IElementType PLUS_EQ = new BBTokenType("+=");
  IElementType PLUS_PLUS = new BBTokenType("++");
  IElementType QUEST_DOT_DOT = new BBTokenType("?..");
  IElementType REQUIRED = new BBTokenType("required");
  IElementType RETHROW = new BBTokenType("rethrow");
  IElementType RETURN = new BBTokenType("return");
  IElementType RETURNS = new BBTokenType("returns");
  IElementType RSQUAREBRACKET = new BBTokenType("]");
  IElementType SEMI_COLON = new BBTokenType(";");
  IElementType SET = new BBTokenType("set");
  IElementType SHOW = new BBTokenType("show");
  IElementType STATIC = new BBTokenType("static");
  IElementType STRING = new BBTokenType("string");
  IElementType STRUCT = new BBTokenType("struct");
  IElementType SUPER = new BBTokenType("super");
  IElementType SWITCH = new BBTokenType("switch");
  IElementType SYNC = new BBTokenType("sync");
  IElementType THIS = new BBTokenType("this");
  IElementType THROW = new BBTokenType("throw");
  IElementType TRUE = new BBTokenType("true");
  IElementType TRY = new BBTokenType("try");
  IElementType TYPEDEF = new BBTokenType("typedef");
  IElementType TYPE_KW = new BBTokenType("type");
  IElementType UNDERSCORE = new BBTokenType("_");
  IElementType USE = new BBTokenType("use");
  IElementType VALUE = new BBTokenType("value");
  IElementType VARIABLE = new BBTokenType("var");
  IElementType WHEN = new BBTokenType("when");
  IElementType WHERE = new BBTokenType("where");
  IElementType YIELD = new BBTokenType("yield");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ASSIGNMENT_STATEMENT) {
        return new BBAssignmentStatementImpl(node);
      }
      else if (type == DEFINITION) {
        return new BBDefinitionImpl(node);
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
