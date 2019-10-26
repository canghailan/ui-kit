package cc.whohow.ui.text;

import cc.whohow.ui.UnicodeArray;
import lombok.Data;

@Data
public class Text {
    private final UnicodeArray text;
    private final TextStyle style;
}
