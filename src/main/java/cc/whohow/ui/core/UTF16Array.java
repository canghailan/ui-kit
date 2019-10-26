package cc.whohow.ui.core;

import cc.whohow.ui.UnicodeArray;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;
import java.util.stream.IntStream;

public class UTF16Array implements UnicodeArray {
    private final String string;
    private final int start;
    private final int length;

    public UTF16Array(char[] utf16) {
        this(utf16, 0, utf16.length);
    }

    public UTF16Array(char[] utf16, int offset, int length) {
        this(new String(utf16, offset, length));
    }

    public UTF16Array(CharBuffer utf16) {
        this(utf16.toString());
    }

    public UTF16Array(String string) {
        this(string, 0, string.length());
    }

    public UTF16Array(String string, int start, int end) {
        this.string = string;
        this.start = start;
        this.length = end - start;
    }

    protected int getCharStartIndex() {
        return start;
    }

    protected int getCharEndIndex() {
        return start + length;
    }

    protected int getUnicodeStartIndex() {
        return string.codePointCount(0, getCharStartIndex());
    }

    protected int getUnicodeEndIndex() {
        return string.codePointCount(0, getCharEndIndex());
    }

    protected int toCharIndex(int index) {
        return string.offsetByCodePoints(getCharStartIndex(), index);
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public char charAt(int index) {
        return string.charAt(getCharStartIndex() + index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new UTF16Array(string, getCharStartIndex() + start, end);
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public int getUnicodeLength() {
        return string.codePointCount(getCharStartIndex(), getCharEndIndex());
    }

    @Override
    public int getUnicode(int index) {
        return string.codePointAt(toCharIndex(index));
    }

    @Override
    public UnicodeArray slice(int start, int end) {
        return new UTF16Array(string, toCharIndex(start), toCharIndex(end));
    }

    @Override
    public ByteBuffer toUTF8Buffer() {
        return StandardCharsets.UTF_8.encode(toUTF16Buffer());
    }

    @Override
    public CharBuffer toUTF16Buffer() {
        return CharBuffer.wrap(string, getCharStartIndex(), getCharEndIndex());
    }


    @Override
    public IntBuffer toUTF32Buffer() {
        return IntBuffer.wrap(codePoints().toArray());
    }

    @Override
    public IntStream chars() {
        return string.chars().skip(getCharStartIndex()).limit(length());
    }

    @Override
    public String toString() {
        return string.substring(getCharStartIndex(), getCharEndIndex());
    }
}
