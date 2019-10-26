package cc.whohow.ui.console.ansi;

import java.util.Iterator;
import java.util.LinkedList;

public class ANSIEscapeCodeBuffer implements ANSIEscapeCode, Appendable  {
    private LinkedList<ANSIEscapeCodeLine> lines;
    // cursor
    private int line;
    private int column;
    private StringBuilder buffer;

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public Appendable append(CharSequence csq) {
        return append(csq, 0, csq.length());
    }

    @Override
    public Appendable append(CharSequence csq, int start, int end) {
        for (int i = start; i < end; i++) {
            append(csq.charAt(i));
        }
        return this;
    }

    @Override
    public Appendable append(char c) {
        return null;
    }

    @Override
    public Iterator<ANSIEscapeCodeLine> iterator() {
        return lines.iterator();
    }
}
