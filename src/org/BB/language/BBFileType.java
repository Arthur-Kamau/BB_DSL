package org.BB.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class BBFileType extends LanguageFileType {

    public static final BBFileType INSTANCE = new BBFileType();

    private BBFileType() {
        super(BBLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "BB File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "BB DSL file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "bb";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return BBIcons.FILE;
    }

}
