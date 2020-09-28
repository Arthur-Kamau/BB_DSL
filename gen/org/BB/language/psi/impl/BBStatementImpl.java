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

public class BBStatementImpl extends ASTWrapperPsiElement implements BBStatement {

  public BBStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BBVisitor visitor) {
    visitor.visitStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BBVisitor) accept((BBVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BBAssignmentStatement getAssignmentStatement() {
    return findChildByClass(BBAssignmentStatement.class);
  }

  @Override
  @Nullable
  public BBFunctionInvocation getFunctionInvocation() {
    return findChildByClass(BBFunctionInvocation.class);
  }

  @Override
  @Nullable
  public BBVariableDefinition getVariableDefinition() {
    return findChildByClass(BBVariableDefinition.class);
  }

}
