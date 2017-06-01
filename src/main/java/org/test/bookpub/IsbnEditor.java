package org.test.bookpub;

import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;

/**
 * Created by z063407 on 6/1/17.
 */
public class IsbnEditor extends PropertyEditorSupport{

    public void setAsText(String text) throws IllegalArgumentException {
        if(StringUtils.hasText(text)) {
            setValue(new Isbn(text.trim()));
        } else {
            setValue(null);
        }
    }

    @Override
    public String getAsText() {
        Isbn isbn = (Isbn) getValue();
        if(isbn != null) {
            return isbn.getIsbn();
        }
        else {
            return "";
        }
    }

}
