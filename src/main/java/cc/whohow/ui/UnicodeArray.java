package cc.whohow.ui;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

public interface UnicodeArray extends CharSequence {
    boolean isEmpty();
    int getUnicodeLength();
    int getUnicode(int index);
    UnicodeArray slice(int start, int end);
    ByteBuffer toUTF8Buffer();
    CharBuffer toUTF16Buffer();
    IntBuffer toUTF32Buffer();
}
