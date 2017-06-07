package id.ac.ui.pusilkom.odontogram.constant;

import java.awt.*;

/**
 * Created by fahri on 4/24/17.
 */
public class StrokeStyle {
    public static final float[] dash1 = { 5.0f };
    public static final Stroke BASIC = new BasicStroke(2f);
    public static final Stroke BOLD_BASIC = new BasicStroke(4f);
    public static final Stroke BOLDER_BASIC = new BasicStroke(6f);
    public static final Stroke DASHED_BASIC = new BasicStroke(2f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 5.0f, dash1, 0.0f);
    public static final Stroke DASHED_BOLD_BASIC = new BasicStroke(4f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 5.0f, dash1, 0.0f);
    public static final Stroke DASHED_BOLDER_BASIC = new BasicStroke(6f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 5.0f, dash1, 0.0f);
}
