// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.BB.language;

import com.intellij.psi.tree.IElementType;
import org.BB.language.BBLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class BBTokenType extends IElementType {

  public BBTokenType(@NotNull @NonNls String debugName) {
    super(debugName, BBLanguage.INSTANCE);
  }

  @Override
  public String toString() {
    return "BBTokenType." + super.toString();
  }

}
