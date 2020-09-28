package org.BB.language;


import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class BBElementType extends IElementType {

    public BBElementType(@NotNull @NonNls String debugName) {
        super(debugName, BBLanguage.INSTANCE);
    }

}
