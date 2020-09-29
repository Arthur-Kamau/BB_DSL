// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.BB.language;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class BBColorSettingsPage implements ColorSettingsPage {

  private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{

          new AttributesDescriptor("Class", BBSyntaxHighlighter.CLASS),
          new AttributesDescriptor("Function", BBSyntaxHighlighter.FUNCTION),
          new AttributesDescriptor("Return", BBSyntaxHighlighter.RETURN),
          new AttributesDescriptor("Package", BBSyntaxHighlighter.PACKAGE),
          new AttributesDescriptor("Import", BBSyntaxHighlighter.IMPORT),

          new AttributesDescriptor("Add", BBSyntaxHighlighter.ADD),
          new AttributesDescriptor("Subtract", BBSyntaxHighlighter.SUBTRACT),
          new AttributesDescriptor("Divide", BBSyntaxHighlighter.DIVIDE),
          new AttributesDescriptor("Subtract", BBSyntaxHighlighter.SUBTRACT),
          new AttributesDescriptor("Divide", BBSyntaxHighlighter.DIVIDE),



          new AttributesDescriptor("EQUAL", BBSyntaxHighlighter.EQUAL),
          new AttributesDescriptor("LESS_THAN", BBSyntaxHighlighter.LESS_THAN),
          new AttributesDescriptor("GREATER_THAN", BBSyntaxHighlighter.GREATER_THAN),

          new AttributesDescriptor("Bad Value", BBSyntaxHighlighter.BAD_CHARACTER)
  };

  @Nullable
  @Override
  public Icon getIcon() {
    return BBIcons.FILE;
  }

  @NotNull
  @Override
  public SyntaxHighlighter getHighlighter() {
    return new BBSyntaxHighlighter();
  }

  @NotNull
  @Override
  public String getDemoText() {
    return "# \n" +
            "struct User {\n" +
            "   var age : int;\n" +
            "   val name : string ;\n" +

            "}\n" +
            "// a class can impliment a struct\n" +
            "class student implements User {\n" +
            "   \n" +
            "   val age = 22;\n" +
            "   val name = \"User\";\n" +
            "\n" +
            "   function getNationality():  string{\n" +
            "      return \"kenya\"\n" +
            "   }\n" +
            "}\n" +
            "\n" +
            "function main(){ \n" +
            " \n" +
            "   let me = User {\n" +
            "      age = 20,\n" +
            "      name = \"Alex\"\n" +
            "   }\n" +
            "   // should print name and defailt value\n" +
            "   print(\"User name is ${me.name}  is audible ${me.isAudible}\") \n" +
            "\n" +
            "\n" ;
  }

  @Nullable
  @Override
  public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
    return null;
  }

  @NotNull
  @Override
  public AttributesDescriptor[] getAttributeDescriptors() {
    return DESCRIPTORS;
  }

  @NotNull
  @Override
  public ColorDescriptor[] getColorDescriptors() {
    return ColorDescriptor.EMPTY_ARRAY;
  }

  @NotNull
  @Override
  public String getDisplayName() {
    return "BB";
  }

}
