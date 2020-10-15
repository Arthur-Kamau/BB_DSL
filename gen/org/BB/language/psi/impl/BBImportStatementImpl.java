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

public class BBImportStatementImpl extends ASTWrapperPsiElement implements BBImportStatement {

  public BBImportStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BBVisitor visitor) {
    visitor.visitImportStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BBVisitor) accept((BBVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<BBImportDeclarations> getImportDeclarationsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BBImportDeclarations.class);
  }

}
