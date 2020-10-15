// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.BB.language;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
//import org.BB.language.psi.BBTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class BBSyntaxHighlighter extends SyntaxHighlighterBase {

  public static final TextAttributesKey ADD =
          createTextAttributesKey("ADD_SIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
  public static final TextAttributesKey SUBTRACT =
          createTextAttributesKey("SUBTRACT_SIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
  public static final TextAttributesKey DIVIDE =
          createTextAttributesKey("DIVIDE_SIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
  public static final TextAttributesKey MULTIPLY =
          createTextAttributesKey("MULTIPLY_SIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
  public static final TextAttributesKey MODULA =
          createTextAttributesKey("MODULA_SIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);


  public static final TextAttributesKey EQUAL =
          createTextAttributesKey("EQUAL_SIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
  public static final TextAttributesKey LESS_THAN =
          createTextAttributesKey("LESS_THAN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
  public static final TextAttributesKey GREATER_THAN =
          createTextAttributesKey("GREATER_THAN", DefaultLanguageHighlighterColors.OPERATION_SIGN);

  public static final TextAttributesKey STRING =
          createTextAttributesKey("STRING_KEY", DefaultLanguageHighlighterColors.KEYWORD);
  public static final TextAttributesKey INT =
          createTextAttributesKey("INT_KEY", DefaultLanguageHighlighterColors.KEYWORD);
  public static final TextAttributesKey DOUBLE =
          createTextAttributesKey("DOUBLE_KEY", DefaultLanguageHighlighterColors.KEYWORD);
  public static final TextAttributesKey CHAR =
          createTextAttributesKey("CHAR_KEY", DefaultLanguageHighlighterColors.KEYWORD);

  public static final TextAttributesKey LET =
          createTextAttributesKey("LET_KEY", DefaultLanguageHighlighterColors.KEYWORD);
  public static final TextAttributesKey VAR =
          createTextAttributesKey("VAR_KEY", DefaultLanguageHighlighterColors.KEYWORD);
  public static final TextAttributesKey VAL =
          createTextAttributesKey("VAL_KEY", DefaultLanguageHighlighterColors.KEYWORD);
  public static final TextAttributesKey MUT =
          createTextAttributesKey("MUT_KEY", DefaultLanguageHighlighterColors.KEYWORD);

  public static final TextAttributesKey CLASS =
          createTextAttributesKey("CLASS_KEY", DefaultLanguageHighlighterColors.KEYWORD);
  public static final TextAttributesKey RETURN =
          createTextAttributesKey("RETURN_KEY", DefaultLanguageHighlighterColors.KEYWORD);
  public static final TextAttributesKey FUNCTION =
          createTextAttributesKey("FUNCTION_KEY", DefaultLanguageHighlighterColors.KEYWORD);
  public static final TextAttributesKey IMPORT =
          createTextAttributesKey("IMPORT_KEY", DefaultLanguageHighlighterColors.KEYWORD);
  public static final TextAttributesKey PACKAGE =
          createTextAttributesKey("PACKAGE_KEY", DefaultLanguageHighlighterColors.KEYWORD);

  public static final TextAttributesKey COMMENT =
          createTextAttributesKey("SIMPLE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
  public static final TextAttributesKey BAD_CHARACTER =
          createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);


  private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};

  private static final TextAttributesKey[] ADD_KEYS = new TextAttributesKey[]{ADD};
  private static final TextAttributesKey[] SUBTRACT_KEYS = new TextAttributesKey[]{SUBTRACT};
  private static final TextAttributesKey[] DIVIDE_KEYS = new TextAttributesKey[]{DIVIDE};
  private static final TextAttributesKey[] MULTIPLY_KEYS = new TextAttributesKey[]{MULTIPLY};

  private static final TextAttributesKey[] EQUAL_KEYS = new TextAttributesKey[]{EQUAL};
  private static final TextAttributesKey[]  GREATER_KEYS = new TextAttributesKey[]{GREATER_THAN};
  private static final TextAttributesKey[] LESS_KEYS = new TextAttributesKey[]{LESS_THAN};


  private static final TextAttributesKey[] MUTABLE_KEYS = new TextAttributesKey[]{MUT};
  private static final TextAttributesKey[] VARIABLE_KEYS = new TextAttributesKey[]{VAR};
  private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VAL};
  private static final TextAttributesKey[] LET_KEYS = new TextAttributesKey[]{LET};


  private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
  private static final TextAttributesKey[] DOUBLE_KEYS = new TextAttributesKey[]{DOUBLE};
  private static final TextAttributesKey[] INT_KEYS = new TextAttributesKey[]{INT};
  private static final TextAttributesKey[] CHAR_KEYS = new TextAttributesKey[]{CHAR};


  private static final TextAttributesKey[] CLASS_KEYS = new TextAttributesKey[]{CLASS};
  private static final TextAttributesKey[] RETURN_KEYS = new TextAttributesKey[]{RETURN};
  private static final TextAttributesKey[] FUNCTION_KEYS = new TextAttributesKey[]{FUNCTION};
  private static final TextAttributesKey[] IMPORT_KEYS = new TextAttributesKey[]{IMPORT};
  private static final TextAttributesKey[] PACKAGE_KEYS = new TextAttributesKey[]{PACKAGE};

  private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
  private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

  @NotNull
  @Override
  public Lexer getHighlightingLexer() {
    return new BBLexerAdapter();
  }

  @NotNull
  @Override
  public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
    if (tokenType.equals(BBTypes.PACKAGE)) {
      return PACKAGE_KEYS;
    } else if (tokenType.equals(BBTypes.IMPORT)) {
      return IMPORT_KEYS;
    }else if (tokenType.equals(BBTypes.CLASS)) {
      return CLASS_KEYS;
    } else if (tokenType.equals(BBTypes.FUNCTION)) {
      return FUNCTION_KEYS;
    } else if (tokenType.equals(BBTypes.RETURN)) {
      return RETURN_KEYS;
    } else if (tokenType.equals(BBTypes.ADD)) {
      return ADD_KEYS;
    } else if (tokenType.equals(BBTypes.MINUS)) {
      return SUBTRACT_KEYS;
    }else if (tokenType.equals(BBTypes.MULTIPLY)) {
      return MULTIPLY_KEYS;
    }else if (tokenType.equals(BBTypes.DIVIDE)) {
      return DIVIDE_KEYS;
    }else if (tokenType.equals(BBTypes.EQUAL)) {
      return EQUAL_KEYS;
    }else if (tokenType.equals(BBTypes.GREATER_THAN)) {
      return GREATER_KEYS;
    }else if (tokenType.equals(BBTypes.LESS_THAN)) {
      return LESS_KEYS;
    }else if (tokenType.equals(BBTypes.LET)) {
      return LET_KEYS;
    }else if (tokenType.equals(BBTypes.MUTABLE)) {
      return MUTABLE_KEYS;
    }else if (tokenType.equals(BBTypes.VALUE)) {
      return VALUE_KEYS;
    }else if (tokenType.equals(BBTypes.VARIABLE)) {
      return VARIABLE_KEYS;
    }else if (tokenType.equals(BBTypes.INT)) {
      return INT_KEYS;
    }else if (tokenType.equals(BBTypes.DOUBLE)) {
      return CLASS_KEYS;
    }else if (tokenType.equals(BBTypes.STRING)) {
      return CLASS_KEYS;
    } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
      return BAD_CHAR_KEYS;
    } else {
      return EMPTY_KEYS;
    }
  }

}
