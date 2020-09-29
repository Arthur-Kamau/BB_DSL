
package org.BB.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import org.BB.language.psi.BBTypes;
import com.intellij.pom.java.LanguageLevel;

@SuppressWarnings("ALL")
%%

%{


 public  _BBLexer() {
            this(null);
          }


%}


%class _BBLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

DIGIT = [0-9]
DIGIT_OR_UNDERSCORE = [_0-9]
DIGITS = {DIGIT} | {DIGIT} {DIGIT_OR_UNDERSCORE}*
HEX_DIGIT_OR_UNDERSCORE = [_0-9A-Fa-f]

INTEGER_LITERAL = {DIGITS} | {HEX_INTEGER_LITERAL} | {BIN_INTEGER_LITERAL}
LONG_LITERAL = {INTEGER_LITERAL} [Ll]
HEX_INTEGER_LITERAL = 0 [Xx] {HEX_DIGIT_OR_UNDERSCORE}*
BIN_INTEGER_LITERAL = 0 [Bb] {DIGIT_OR_UNDERSCORE}*


%%





<YYINITIAL> {
{LONG_LITERAL} { return BBTypes.LONG_LITERAL; }
 {INTEGER_LITERAL} { return BBTypes.INTEGER_LITERAL; }

  "true" { return BBTypes.TRUE; }
  "false" { return BBTypes.FALSE; }
  "null" { return BBTypes.NULL; }


  "break" { return BBTypes.BREAK; }

  "case" { return BBTypes.CASE; }
  "catch" { return BBTypes.CATCH; }
  "char" { return BBTypes.CHAR; }
  "class" { return BBTypes.CLASS; }
  "function" { return BBTypes.FUNCTION; }
  "package" { return BBTypes.PACKAGE; }

  "continue" { return BBTypes.CONTINUE; }
  "default" { return BBTypes.DEFAULT; }

  "double" { return BBTypes.DOUBLE; }
  "else" { return BBTypes.ELSE; }
  "enum" { return  BBTypes.ENUM ; }
  "extends" { return BBTypes.EXTENDS; }



  "for" { return BBTypes.FOR; }

  "if" { return BBTypes.IF; }
  "implements" { return BBTypes.IMPLEMENTS; }
  "import" { return BBTypes.IMPORT; }

  "int" { return BBTypes.INT; }



  "new" { return BBTypes.NEW; }
  "package" { return BBTypes.PACKAGE; }



  "super" { return BBTypes.SUPER; }
  "switch" { return BBTypes.SWITCH; }
  "this" { return BBTypes.THIS; }


  "return" { return BBTypes.RETURN; }


  "try" { return BBTypes.TRY; }

  "throws" { return BBTypes.THROW; }



  "==" { return BBTypes.EQUAL; }





  "<" { return BBTypes.LESS_THAN; }
  ">" { return BBTypes.GREATER_THAN; }
  "&" { return BBTypes.AND; }


  "("   { return BBTypes.OPEN_BRACE; }
  ")"   { return BBTypes.CLOSE_BRACE; }
  "{"   { return BBTypes.OPEN_BRACKETS; }
  "}"   { return BBTypes.CLOSE_BRACKETS; }
  "["   { return BBTypes.LSQUAREBRACKET; }
  "]"   { return BBTypes.RSQUAREBRACKET; }
  ";"   { return BBTypes.SEMI_COLON; }
  ","   { return BBTypes.COMMA; }
  "..." { return BBTypes.DOT_DOT; }
  "."   { return BBTypes.DOT; }

  "=" { return BBTypes.ASSIGN; }
  "!" { return BBTypes.NOT; }

  ":" { return BBTypes.COLON; }
  "+" { return BBTypes.ADD; }
  "-" { return BBTypes.MINUS; }
  "*" { return BBTypes.MULTIPLY; }
  "/" { return BBTypes.DIVIDE; }



  "@" { return BBTypes.AT; }

  "::" { return BBTypes.COLONCOLON; }
  "->" { return BBTypes.ARROW; }
}

[^]  { return TokenType.BAD_CHARACTER; }
