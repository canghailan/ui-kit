package cc.whohow.ui.provider.java2d;

import java.text.AttributedCharacterIterator;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class PlainCharacterIterator implements AttributedCharacterIterator {
    private CharSequence text;
    private int index;

    public PlainCharacterIterator(CharSequence text) {
        this(text, 0);
    }

    public PlainCharacterIterator(CharSequence text, int index) {
        this.text = text;
        this.index = index;
    }

    private char charAt(int index) {
        if (index < text.length()) {
            return text.charAt(index);
        } else {
            return DONE;
        }
    }

    @Override
    public int getRunStart() {
        return 0;
    }

    @Override
    public int getRunStart(Attribute attribute) {
        return getRunStart();
    }

    @Override
    public int getRunStart(Set<? extends Attribute> attributes) {
        return getRunStart();
    }

    @Override
    public int getRunLimit() {
        return text.length();
    }

    @Override
    public int getRunLimit(Attribute attribute) {
        return getRunLimit();
    }

    @Override
    public int getRunLimit(Set<? extends Attribute> attributes) {
        return getRunLimit();
    }

    @Override
    public Map<Attribute, Object> getAttributes() {
        return Collections.emptyMap();
    }

    @Override
    public Object getAttribute(Attribute attribute) {
        return null;
    }

    @Override
    public Set<Attribute> getAllAttributeKeys() {
        return Collections.emptySet();
    }

    @Override
    public char first() {
        return charAt(0);
    }

    @Override
    public char last() {
        return charAt(text.length() - 1);
    }

    @Override
    public char current() {
        return charAt(index);
    }

    @Override
    public char next() {
        return charAt(++index);
    }

    @Override
    public char previous() {
        return charAt(--index);
    }

    @Override
    public char setIndex(int position) {
        return charAt(index = position);
    }

    @Override
    public int getBeginIndex() {
        return 0;
    }

    @Override
    public int getEndIndex() {
        return text.length();
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public PlainCharacterIterator clone() {
        return new PlainCharacterIterator(text, index);
    }
}
