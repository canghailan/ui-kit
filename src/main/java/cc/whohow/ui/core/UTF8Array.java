package cc.whohow.ui.core;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class UTF8Array extends UTF16Array {
    public UTF8Array(byte[] utf8) {
        this(utf8, 0, utf8.length);
    }

    public UTF8Array(byte[] utf8, int offset, int length) {
        super(new String(utf8, offset, length, StandardCharsets.UTF_8));
    }

    public UTF8Array(ByteBuffer utf8) {
        super(StandardCharsets.UTF_8.decode(utf8));
    }
}
