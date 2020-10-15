// This is a generated file. Not intended for manual editing.
package org.BB.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.BB.language.BBTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class BBParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return BBFile(b, l + 1);
  }

  /* ********************************************************** */
  // ClassDefinition
  public static boolean AppClassDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AppClassDefinition")) return false;
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ClassDefinition(b, l + 1);
    exit_section_(b, m, APP_CLASS_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // FunctionDefinition
  public static boolean AppFunctionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AppFunctionDefinition")) return false;
    if (!nextTokenIs(b, FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionDefinition(b, l + 1);
    exit_section_(b, m, APP_FUNCTION_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER '=' FunctionInvocation
  public static boolean AssignmentStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignmentStatement")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, ASSIGN);
    r = r && FunctionInvocation(b, l + 1);
    exit_section_(b, m, ASSIGNMENT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // PackageDefinition | (ImportStatement)? |  AppFunctionDefinition*
  static boolean BBFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BBFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PackageDefinition(b, l + 1);
    if (!r) r = BBFile_1(b, l + 1);
    if (!r) r = BBFile_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ImportStatement)?
  private static boolean BBFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BBFile_1")) return false;
    BBFile_1_0(b, l + 1);
    return true;
  }

  // (ImportStatement)
  private static boolean BBFile_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BBFile_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImportStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AppFunctionDefinition*
  private static boolean BBFile_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BBFile_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!AppFunctionDefinition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BBFile_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // class Separator IDENTIFIER  ('(' ')')? '{' (FunctionBody | FunctionDefinition*)?  '}'
  public static boolean ClassDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDefinition")) return false;
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLASS);
    r = r && Separator(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && ClassDefinition_3(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACKETS);
    r = r && ClassDefinition_5(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKETS);
    exit_section_(b, m, CLASS_DEFINITION, r);
    return r;
  }

  // ('(' ')')?
  private static boolean ClassDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDefinition_3")) return false;
    ClassDefinition_3_0(b, l + 1);
    return true;
  }

  // '(' ')'
  private static boolean ClassDefinition_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDefinition_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_BRACE, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (FunctionBody | FunctionDefinition*)?
  private static boolean ClassDefinition_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDefinition_5")) return false;
    ClassDefinition_5_0(b, l + 1);
    return true;
  }

  // FunctionBody | FunctionDefinition*
  private static boolean ClassDefinition_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDefinition_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionBody(b, l + 1);
    if (!r) r = ClassDefinition_5_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // FunctionDefinition*
  private static boolean ClassDefinition_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDefinition_5_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionDefinition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ClassDefinition_5_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Statement*
  public static boolean FunctionBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBody")) return false;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_BODY, "<function body>");
    while (true) {
      int c = current_position_(b);
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionBody", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // function IDENTIFIER '(' ')' (returns Type)? '{' FunctionBody '}'
  public static boolean FunctionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition")) return false;
    if (!nextTokenIs(b, FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FUNCTION, IDENTIFIER, OPEN_BRACE, CLOSE_BRACE);
    r = r && FunctionDefinition_4(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACKETS);
    r = r && FunctionBody(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKETS);
    exit_section_(b, m, FUNCTION_DEFINITION, r);
    return r;
  }

  // (returns Type)?
  private static boolean FunctionDefinition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition_4")) return false;
    FunctionDefinition_4_0(b, l + 1);
    return true;
  }

  // returns Type
  private static boolean FunctionDefinition_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDefinition_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURNS);
    r = r && Type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER '(' ')' ';'
  public static boolean FunctionInvocation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionInvocation")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, OPEN_BRACE, CLOSE_BRACE, SEMI_COLON);
    exit_section_(b, m, FUNCTION_INVOCATION, r);
    return r;
  }

  /* ********************************************************** */
  // import Separator IDENTIFIER (';')? NEW_LINE
  public static boolean ImportDeclarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDeclarations")) return false;
    if (!nextTokenIs(b, IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMPORT);
    r = r && Separator(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && ImportDeclarations_3(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, IMPORT_DECLARATIONS, r);
    return r;
  }

  // (';')?
  private static boolean ImportDeclarations_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDeclarations_3")) return false;
    consumeToken(b, SEMI_COLON);
    return true;
  }

  /* ********************************************************** */
  // ImportDeclarations*
  public static boolean ImportStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportStatement")) return false;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_STATEMENT, "<import statement>");
    while (true) {
      int c = current_position_(b);
      if (!ImportDeclarations(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ImportStatement", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // package Separator IDENTIFIER (';')? NEW_LINE
  public static boolean PackageDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PackageDefinition")) return false;
    if (!nextTokenIs(b, PACKAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PACKAGE);
    r = r && Separator(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && PackageDefinition_3(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, PACKAGE_DEFINITION, r);
    return r;
  }

  // (';')?
  private static boolean PackageDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PackageDefinition_3")) return false;
    consumeToken(b, SEMI_COLON);
    return true;
  }

  /* ********************************************************** */
  // ((WHITE_SPACE)*)?
  public static boolean Separator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Separator")) return false;
    Marker m = enter_section_(b, l, _NONE_, SEPARATOR, "<separator>");
    Separator_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // (WHITE_SPACE)*
  private static boolean Separator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Separator_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, WHITE_SPACE)) break;
      if (!empty_element_parsed_guard_(b, "Separator_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // VariableDefinition | AssignmentStatement | FunctionInvocation
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = VariableDefinition(b, l + 1);
    if (!r) r = AssignmentStatement(b, l + 1);
    if (!r) r = FunctionInvocation(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // int | string | char
  public static boolean Type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, CHAR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Type IDENTIFIER (';' | ('=' FunctionInvocation)?)
  public static boolean VariableDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DEFINITION, "<variable definition>");
    r = Type(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && VariableDefinition_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ';' | ('=' FunctionInvocation)?
  private static boolean VariableDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMI_COLON);
    if (!r) r = VariableDefinition_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=' FunctionInvocation)?
  private static boolean VariableDefinition_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition_2_1")) return false;
    VariableDefinition_2_1_0(b, l + 1);
    return true;
  }

  // '=' FunctionInvocation
  private static boolean VariableDefinition_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinition_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && FunctionInvocation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
