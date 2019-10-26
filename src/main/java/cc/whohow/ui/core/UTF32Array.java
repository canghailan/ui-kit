package cc.whohow.ui.core;

import java.nio.IntBuffer;

public class UTF32Array extends UTF16Array {
    public UTF32Array(int[] codePoints) {
        this(codePoints, 0, codePoints.length);
    }

    public UTF32Array(int[] codePoints, int offset, int length) {
        super(new String(codePoints, offset, length));
    }

    public UTF32Array(IntBuffer codePoints) {
        super(decode(codePoints));
    }

    public static String decode(IntBuffer buffer) {
        if (buffer.hasArray()) {
            String string = new String(buffer.array(), buffer.arrayOffset(), buffer.remaining());
            buffer.position(buffer.limit());
            return string;
        } else {
            int[] codePoints = new int[buffer.remaining()];
            buffer.get(codePoints);
            return new String(codePoints, 0, codePoints.length);
        }
    }
}
