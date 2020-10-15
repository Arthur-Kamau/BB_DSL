// This is a generated file. Not intended for manual editing.
package org.BB.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BBClassDefinition extends PsiElement {

  @Nullable
  BBFunctionBody getFunctionBody();

  @NotNull
  List<BBFunctionDefinition> getFunctionDefinitionList();

  @NotNull
  BBSeparator getSeparator();

}
