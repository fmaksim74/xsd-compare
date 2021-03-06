package com.compare.xsd.messages;

import com.github.spring.boot.javafx.text.Message;
import lombok.Getter;

@Getter
public enum MenuMessage implements Message {
    COPY_NAME("menu_copy_name"),
    COPY_XPATH("menu_copy_xpath"),
    COPY_XML("menu_copy_xml");

    private String key;

    MenuMessage(String key) {
        this.key = key;
    }
}
