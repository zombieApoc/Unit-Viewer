package com.wh40k.unitviewer.Utilities;

/**
 * Created by Ultramar on 6/15/16.
 */
public class SelectOption {
    String value;
    String text;
    boolean selected;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public SelectOption(String value, String text, boolean selected) {
        this.value = value;
        this.text = text;
        this.selected = selected;
    }
}
