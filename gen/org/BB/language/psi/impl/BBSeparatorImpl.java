// This is a generated file. Not intended for manual editing.
package org.BB.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.BB.language.BBTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.BB.language.psi.*;

public class BBSeparatorImpl extends ASTWrapperPsiElement implements BBSeparator {

  public BBSeparatorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BBVisitor visitor) {
    visitor.visitSeparator(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BBVisitor) accept((BBVisitor)visitor);
    else super.accept(visitor);
  }

}
