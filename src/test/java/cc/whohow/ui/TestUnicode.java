package cc.whohow.ui;

import cc.whohow.ui.core.UTF16Array;
import org.junit.Test;

public class TestUnicode {
    @Test
    public void test() {
        UTF16Array s = new UTF16Array("abc中文😀😁🤣😂😄😅😆😇😉😊🙂🙃☺️😋😌😍字符xyz");
        System.out.println(s.length());
        System.out.println(s.getUnicodeLength());

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        for (int i = 0; i < s.getUnicodeLength(); i++) {
            System.out.println(s.getUnicode(i));
        }

        System.out.println(s.slice(4, 10));
    }
}
