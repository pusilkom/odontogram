package id.ac.ui.pusilkom;

import id.ac.ui.pusilkom.odontogram.Odontogram;
import id.ac.ui.pusilkom.odontogram.constant.PaintStyle;
import id.ac.ui.pusilkom.odontogram.constant.Size;
import id.ac.ui.pusilkom.odontogram.constant.StrokeStyle;
import id.ac.ui.pusilkom.odontogram.enums.*;
import id.ac.ui.pusilkom.odontogram.model.Box;
import id.ac.ui.pusilkom.odontogram.model.Tooth;
import id.ac.ui.pusilkom.odontogram.shape.*;
import id.ac.ui.pusilkom.odontogram.shape.Label;
import id.ac.ui.pusilkom.odontogram.shape.Rectangle;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by fahri on 4/24/17.
 */
public class Example {

    public static void main(String[] args)  {
        new Example();
    }

    Example()  {
        Odontogram odontogram = new Odontogram();

        Tooth g18 = odontogram.getTooth(18);
        Box boxTop18NON = g18.buildBoxForTop(Size.HALF_BOX_HEIGHT);
        g18.prependBoxForTop(boxTop18NON); // Utk penambahan box top, harus pake prependBoxForTop

        boxTop18NON.buildThenAddLayer(Label.class).with("NON");

        Box boxCenter18 = g18.buildBoxForTop(Size.BOX_HEIGHT);
        g18.replaceBoxForCenter(boxCenter18); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter18.buildThenAddLayer(Molar.class);


        Tooth g17 = odontogram.getTooth(17);
        Box boxCenter17 = g17.buildBoxForTop(Size.BOX_HEIGHT);
        g17.replaceBoxForCenter(boxCenter17); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter17.buildThenAddLayer(Molar.class);
        boxCenter17.buildThenAddLayer(X.class);


        Tooth g16 = odontogram.getTooth(16);
        Box boxCenter16 = g16.buildBoxForTop(Size.BOX_HEIGHT);
        g16.replaceBoxForCenter(boxCenter16); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter16.buildThenAddLayer(Molar.class);
        boxCenter16.buildThenAddLayer(Molar.class).with(MolarPart.CENTER, PaintStyle.SOLID_BLACK);


        Tooth g15 = odontogram.getTooth(15);
        Box boxCenter15 = g15.buildBoxForTop(Size.BOX_HEIGHT);
        g15.replaceBoxForCenter(boxCenter15); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter15.buildThenAddLayer(Molar.class);
        boxCenter15.buildThenAddLayer(X.class);

        Tooth g14 = odontogram.getTooth(14);
        Box boxCenter14 = g14.buildBoxForTop(Size.BOX_HEIGHT);
        g14.replaceBoxForCenter(boxCenter14); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter14.buildThenAddLayer(Molar.class);
        boxCenter14.buildThenAddLayer(Rectangle.class).with(StrokeStyle.BASIC, Color.BLACK, true);


        Tooth g13 = odontogram.getTooth(13);
        Box boxCenter13 = g13.buildBoxForTop(Size.BOX_HEIGHT);
        g13.replaceBoxForCenter(boxCenter13); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter13.buildThenAddLayer(NonMolar.class);

        Tooth g12 = odontogram.getTooth(12);
        Box boxTop12NON = g12.buildBoxForTop(Size.HALF_BOX_HEIGHT);
        g12.prependBoxForTop(boxTop12NON); // Utk penambahan box top, harus pake prependBoxForTop

        boxTop12NON.buildThenAddLayer(Label.class).with("ANO");

        Box boxCenter12 = g12.buildBoxForTop(Size.BOX_HEIGHT);
        g12.replaceBoxForCenter(boxCenter12); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter12.buildThenAddLayer(NonMolar.class);

        Tooth g11 = odontogram.getTooth(11);
        Box boxCenter11 = g11.buildBoxForTop(Size.BOX_HEIGHT);
        g11.replaceBoxForCenter(boxCenter11); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter11.buildThenAddLayer(NonMolar.class);
        boxCenter11.buildThenAddLayer(NonMolar.class).with(NonMolarPart.RIGHT, StrokeStyle.BOLDER_BASIC, Color.BLACK);


        Tooth g21 = odontogram.getTooth(21);
        Box boxCenter21 = g21.buildBoxForTop(Size.BOX_HEIGHT);
        g21.replaceBoxForCenter(boxCenter21); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter21.buildThenAddLayer(NonMolar.class);

        Tooth g22 = odontogram.getTooth(22);
        Box boxCenter22 = g22.buildBoxForTop(Size.BOX_HEIGHT);
        g22.replaceBoxForCenter(boxCenter22); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter22.buildThenAddLayer(NonMolar.class);
        boxCenter22.buildThenAddLayer(Hash.class);

        Box boxBottom22 = g22.buildBoxForBottom(Size.HALF_BOX_HEIGHT);
        g22.prependBoxForBottom(boxBottom22);
        boxBottom22.buildThenAddLayer(Arrow.class).with(ArrowDirection.CLOCKWISE, StrokeStyle.BASIC);

        Tooth g23 = odontogram.getTooth(23);
        Box boxCenter23 = g23.buildBoxForTop(Size.BOX_HEIGHT);
        g23.replaceBoxForCenter(boxCenter23); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter23.buildThenAddLayer(NonMolar.class);

        Box boxBottom23 = g23.buildBoxForBottom(Size.HALF_BOX_HEIGHT);
        g23.prependBoxForBottom(boxBottom23);
        boxBottom23.buildThenAddLayer(Arrow.class).with(ArrowDirection.COUNTER_CLOCKWISE, StrokeStyle.BASIC);

        Tooth g24 = odontogram.getTooth(24);
        Box boxCenter24 = g24.buildBoxForTop(Size.BOX_HEIGHT);
        g24.replaceBoxForCenter(boxCenter24); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter24.buildThenAddLayer(Molar.class);
        boxCenter24.buildThenAddLayer(Molar.class).with(MolarPart.CENTER, PaintStyle.SOLID_GREEN);

        Tooth g25 = odontogram.getTooth(25);
        Box boxCenter25 = g25.buildBoxForTop(Size.BOX_HEIGHT);
        g25.replaceBoxForCenter(boxCenter25); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter25.buildThenAddLayer(Molar.class);
        boxCenter25.buildThenAddLayer(X.class);

        Tooth g26 = odontogram.getTooth(26);
        Box boxCenter26 = g26.buildBoxForTop(Size.BOX_HEIGHT);
        g26.replaceBoxForCenter(boxCenter26); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter26.buildThenAddLayer(Rectangle.class).with(PaintStyle.SOLID_GREEN);
        boxCenter26.buildThenAddLayer(Rectangle.class).with(StrokeStyle.BOLD_BASIC, Color.BLACK);
        boxCenter26.buildThenAddLayer(Molar.class);
        boxCenter26.buildThenAddLayer(Molar.class).with(MolarPart.CENTER, StrokeStyle.BOLD_BASIC, Color.GREEN);
        boxCenter26.buildThenAddLayer(Molar.class).with(MolarPart.CENTER, StrokeStyle.DASHED_BOLDER_BASIC, Color.BLACK);

        Box boxBottom26 = g26.buildBoxForBottom(Size.HALF_BOX_HEIGHT);
        g26.prependBoxForBottom(boxBottom26);

        boxBottom26.buildThenAddLayer(Triangle.class).with(TriangleDirection.DOWN, PaintStyle.SOLID_BLACK);

        Tooth g27 = odontogram.getTooth(27);
        Box boxCenter27 = g27.buildBoxForTop(Size.BOX_HEIGHT);
        g27.replaceBoxForCenter(boxCenter27); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter27.buildThenAddLayer(Molar.class);
        boxCenter27.buildThenAddLayer(V.class);

        Tooth g28 = odontogram.getTooth(28);
        Box boxTop28NON = g28.buildBoxForTop(Size.HALF_BOX_HEIGHT);
        g28.prependBoxForTop(boxTop28NON); // Utk penambahan box top, harus pake prependBoxForTop

        boxTop28NON.buildThenAddLayer(Label.class).with("NON");

        Box boxCenter28 = g28.buildBoxForTop(Size.BOX_HEIGHT);
        g28.replaceBoxForCenter(boxCenter28); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter28.buildThenAddLayer(Molar.class);


        Tooth g56 = odontogram.getTooth(56);
        Box boxCenter56 = g56.buildBoxForTop(Size.BOX_HEIGHT);
        g56.replaceBoxForCenter(boxCenter56); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter56.buildThenAddLayer(HLine.class).with(HLinePart.HALF_RIGHT);


        Tooth g55 = odontogram.getTooth(55);
        Box boxCenter55 = g55.buildBoxForTop(Size.BOX_HEIGHT);
        g55.replaceBoxForCenter(boxCenter55); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter55.buildThenAddLayer(Molar.class);
        boxCenter55.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Tooth g54 = odontogram.getTooth(54);
        Box boxCenter54 = g54.buildBoxForTop(Size.BOX_HEIGHT);
        g54.replaceBoxForCenter(boxCenter54); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter54.buildThenAddLayer(Molar.class);
        boxCenter54.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Tooth g53 = odontogram.getTooth(53);
        Box boxCenter53 = g53.buildBoxForTop(Size.BOX_HEIGHT);
        g53.replaceBoxForCenter(boxCenter53); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter53.buildThenAddLayer(NonMolar.class);
        boxCenter53.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Tooth g52 = odontogram.getTooth(52);
        Box boxCenter52 = g52.buildBoxForTop(Size.BOX_HEIGHT);
        g52.replaceBoxForCenter(boxCenter52); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter52.buildThenAddLayer(NonMolar.class);
        boxCenter52.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Tooth g51 = odontogram.getTooth(51);
        Box boxCenter51 = g51.buildBoxForTop(Size.BOX_HEIGHT);
        g51.replaceBoxForCenter(boxCenter51); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter51.buildThenAddLayer(NonMolar.class);
        boxCenter51.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Tooth g61 = odontogram.getTooth(61);
        Box boxCenter61 = g61.buildBoxForTop(Size.BOX_HEIGHT);
        g61.replaceBoxForCenter(boxCenter61); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter61.buildThenAddLayer(NonMolar.class);
        boxCenter61.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Tooth g62 = odontogram.getTooth(62);
        Box boxCenter62 = g62.buildBoxForTop(Size.BOX_HEIGHT);
        g62.replaceBoxForCenter(boxCenter62); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter62.buildThenAddLayer(NonMolar.class);
        boxCenter62.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Tooth g63 = odontogram.getTooth(63);
        Box boxCenter63 = g63.buildBoxForTop(Size.BOX_HEIGHT);
        g63.replaceBoxForCenter(boxCenter63); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter63.buildThenAddLayer(NonMolar.class);
        boxCenter63.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Tooth g64 = odontogram.getTooth(64);
        Box boxCenter64 = g64.buildBoxForTop(Size.BOX_HEIGHT);
        g64.replaceBoxForCenter(boxCenter64); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter64.buildThenAddLayer(Molar.class);
        boxCenter64.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Tooth g65 = odontogram.getTooth(65);
        Box boxCenter65 = g65.buildBoxForTop(Size.BOX_HEIGHT);
        g65.replaceBoxForCenter(boxCenter65); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter65.buildThenAddLayer(Molar.class);
        boxCenter65.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Tooth g66 = odontogram.getTooth(66);
        Box boxCenter66 = g66.buildBoxForTop(Size.BOX_HEIGHT);
        g66.replaceBoxForCenter(boxCenter66); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter66.buildThenAddLayer(HLine.class).with(HLinePart.HALF_LEFT);

        Tooth g86 = odontogram.getTooth(86);
        Box boxCenter86 = g86.buildBoxForTop(Size.BOX_HEIGHT);
        g86.replaceBoxForCenter(boxCenter86); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter86.buildThenAddLayer(HLine.class).with(HLinePart.HALF_RIGHT);

        Tooth g85 = odontogram.getTooth(85);
        Box boxCenter85 = g85.buildBoxForTop(Size.BOX_HEIGHT);
        g85.replaceBoxForCenter(boxCenter85); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter85.buildThenAddLayer(Molar.class);
        boxCenter85.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Tooth g84 = odontogram.getTooth(84);
        Box boxCenter84 = g84.buildBoxForTop(Size.BOX_HEIGHT);
        g84.replaceBoxForCenter(boxCenter84); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter84.buildThenAddLayer(Molar.class);
        boxCenter84.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Tooth g83 = odontogram.getTooth(83);
        Box boxCenter83 = g83.buildBoxForTop(Size.BOX_HEIGHT);
        g83.replaceBoxForCenter(boxCenter83); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter83.buildThenAddLayer(NonMolar.class);
        boxCenter83.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Tooth g82 = odontogram.getTooth(82);
        Box boxCenter82 = g82.buildBoxForTop(Size.BOX_HEIGHT);
        g82.replaceBoxForCenter(boxCenter82); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter82.buildThenAddLayer(NonMolar.class);
        boxCenter82.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Tooth g81 = odontogram.getTooth(81);
        Box boxCenter81 = g81.buildBoxForTop(Size.BOX_HEIGHT);
        g81.replaceBoxForCenter(boxCenter81); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter81.buildThenAddLayer(NonMolar.class);
        boxCenter81.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Tooth g71 = odontogram.getTooth(71);
        Box boxCenter71 = g71.buildBoxForTop(Size.BOX_HEIGHT);
        g71.replaceBoxForCenter(boxCenter71); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter71.buildThenAddLayer(NonMolar.class);
        boxCenter71.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Tooth g72 = odontogram.getTooth(72);
        Box boxCenter72 = g72.buildBoxForTop(Size.BOX_HEIGHT);
        g72.replaceBoxForCenter(boxCenter72); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter72.buildThenAddLayer(NonMolar.class);
        boxCenter72.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Tooth g73 = odontogram.getTooth(73);
        Box boxCenter73 = g73.buildBoxForTop(Size.BOX_HEIGHT);
        g73.replaceBoxForCenter(boxCenter73); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter73.buildThenAddLayer(NonMolar.class);
        boxCenter73.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Tooth g74 = odontogram.getTooth(74);
        Box boxCenter74 = g74.buildBoxForTop(Size.BOX_HEIGHT);
        g74.replaceBoxForCenter(boxCenter74); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter74.buildThenAddLayer(Molar.class);
        boxCenter74.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Tooth g75 = odontogram.getTooth(75);
        Box boxCenter75 = g75.buildBoxForTop(Size.BOX_HEIGHT);
        g75.replaceBoxForCenter(boxCenter75); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter75.buildThenAddLayer(Molar.class);
        boxCenter75.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Tooth g76 = odontogram.getTooth(76);
        Box boxCenter76 = g76.buildBoxForTop(Size.BOX_HEIGHT);
        g76.replaceBoxForCenter(boxCenter76); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter76.buildThenAddLayer(HLine.class).with(HLinePart.HALF_LEFT);

        Tooth g48 = odontogram.getTooth(48);
        Box boxCenter48 = g48.buildBoxForTop(Size.BOX_HEIGHT);
        g48.replaceBoxForCenter(boxCenter48); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter48.buildThenAddLayer(Molar.class);

        Box boxBottom48UNE = g48.buildBoxForBottom(Size.HALF_BOX_HEIGHT);
        g48.appendBoxForBottom(boxBottom48UNE);

        boxBottom48UNE.buildThenAddLayer(Label.class).with("UNE");

        Tooth g47 = odontogram.getTooth(47);
        Box boxTop47 = g47.buildBoxForTop(Size.HALF_BOX_HEIGHT);
        g47.appendBoxForTop(boxTop47); // Utk penambahan box top, harus pake prependBoxForTop

        boxTop47.buildThenAddLayer(Triangle.class).with(TriangleDirection.UP, StrokeStyle.BOLD_BASIC, Color.BLACK);

        Box boxCenter47 = g47.buildBoxForTop(Size.BOX_HEIGHT);
        g47.replaceBoxForCenter(boxCenter47); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter47.buildThenAddLayer(Molar.class);
        boxCenter47.buildThenAddLayer(Molar.class).with(MolarPart.CENTER, StrokeStyle.BOLDER_BASIC, Color.BLACK);

        Tooth g46 = odontogram.getTooth(46);
        Box boxTop46 = g46.buildBoxForTop(Size.HALF_BOX_HEIGHT);
        g46.appendBoxForTop(boxTop46); // Utk penambahan box top, harus pake prependBoxForTop

        boxTop46.buildThenAddLayer(Triangle.class).with(TriangleDirection.UP, PaintStyle.SOLID_BLACK);

        Box boxCenter46 = g46.buildBoxForTop(Size.BOX_HEIGHT);
        g46.replaceBoxForCenter(boxCenter46); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter46.buildThenAddLayer(Molar.class);
        boxCenter46.buildThenAddLayer(Molar.class).with(MolarPart.CENTER, PaintStyle.SOLID_GREEN);

        Tooth g45 = odontogram.getTooth(45);
        Box boxTop45 = g45.buildBoxForTop(Size.HALF_BOX_HEIGHT);
        g45.appendBoxForTop(boxTop45); // Utk penambahan box top, harus pake prependBoxForTop

        boxTop45.buildThenAddLayer(VLine.class).with(VLinePart.HALF_BOTTOM);
        boxTop45.buildThenAddLayer(HLine.class).with(HLinePart.HALF_RIGHT);

        Box boxCenter45 = g45.buildBoxForTop(Size.BOX_HEIGHT);
        g45.replaceBoxForCenter(boxCenter45); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter45.buildThenAddLayer(Rectangle.class).with(PaintStyle.SOLID_GREEN);
        boxCenter45.buildThenAddLayer(Rectangle.class).with(StrokeStyle.BOLD_BASIC, Color.BLACK);
        boxCenter45.buildThenAddLayer(Molar.class);

        Tooth g44 = odontogram.getTooth(44);
        Box boxTop44 = g44.buildBoxForTop(Size.HALF_BOX_HEIGHT);
        g44.appendBoxForTop(boxTop44); // Utk penambahan box top, harus pake prependBoxForTop

        boxTop44.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Box boxCenter44 = g44.buildBoxForTop(Size.BOX_HEIGHT);
        g44.replaceBoxForCenter(boxCenter44); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter44.buildThenAddLayer(Rectangle.class).with(PaintStyle.SOLID_GREEN);
        boxCenter44.buildThenAddLayer(Rectangle.class).with(StrokeStyle.BOLD_BASIC, Color.BLACK);
        boxCenter44.buildThenAddLayer(Molar.class);
        boxCenter44.buildThenAddLayer(X.class);

        Tooth g43 = odontogram.getTooth(43);
        Box boxTop43 = g43.buildBoxForTop(Size.HALF_BOX_HEIGHT);
        g43.appendBoxForTop(boxTop43); // Utk penambahan box top, harus pake prependBoxForTop

        boxTop43.buildThenAddLayer(VLine.class).with(VLinePart.HALF_BOTTOM);
        boxTop43.buildThenAddLayer(HLine.class).with(HLinePart.HALF_LEFT);

        Box boxCenter43 = g43.buildBoxForTop(Size.BOX_HEIGHT);
        g43.replaceBoxForCenter(boxCenter43); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter43.buildThenAddLayer(Rectangle.class).with(PaintStyle.SOLID_GREEN);
        boxCenter43.buildThenAddLayer(Rectangle.class).with(StrokeStyle.BOLD_BASIC, Color.BLACK);
        boxCenter43.buildThenAddLayer(NonMolar.class);

        Tooth g42 = odontogram.getTooth(42);
        Box boxCenter42 = g42.buildBoxForTop(Size.BOX_HEIGHT);
        g42.replaceBoxForCenter(boxCenter42); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter42.buildThenAddLayer(NonMolar.class);

        Tooth g41 = odontogram.getTooth(41);
        Box boxCenter41 = g41.buildBoxForTop(Size.BOX_HEIGHT);
        g41.replaceBoxForCenter(boxCenter41); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter41.buildThenAddLayer(NonMolar.class);

        Tooth g31 = odontogram.getTooth(31);
        Box boxTop31 = g31.buildBoxForTop(Size.HALF_BOX_HEIGHT);
        g31.prependBoxForTop(boxTop31);
        boxTop31.buildThenAddLayer(Arrow.class).with(ArrowDirection.COUNTER_CLOCKWISE, StrokeStyle.BASIC);

        Box boxCenter31 = g31.buildBoxForTop(Size.BOX_HEIGHT);
        g31.replaceBoxForCenter(boxCenter31); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter31.buildThenAddLayer(NonMolar.class);

        Tooth g32 = odontogram.getTooth(32);
        Box boxCenter32 = g32.buildBoxForTop(Size.BOX_HEIGHT);
        g32.replaceBoxForCenter(boxCenter32); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter32.buildThenAddLayer(NonMolar.class);

        Tooth g33 = odontogram.getTooth(33);
        Box boxCenter33 = g33.buildBoxForTop(Size.BOX_HEIGHT);
        g33.replaceBoxForCenter(boxCenter33); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter33.buildThenAddLayer(NonMolar.class);
        boxCenter33.buildThenAddLayer(X.class);

        Tooth g34 = odontogram.getTooth(34);
        Box boxCenter34 = g34.buildBoxForTop(Size.BOX_HEIGHT);
        g34.replaceBoxForCenter(boxCenter34); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter34.buildThenAddLayer(Molar.class);
        boxCenter34.buildThenAddLayer(X.class);

        Tooth g35 = odontogram.getTooth(35);
        Box boxCenter35 = g35.buildBoxForTop(Size.BOX_HEIGHT);
        g35.replaceBoxForCenter(boxCenter35); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter35.buildThenAddLayer(Molar.class);

        Tooth g36 = odontogram.getTooth(36);
        Box boxCenter36 = g36.buildBoxForTop(Size.BOX_HEIGHT);
        g36.replaceBoxForCenter(boxCenter36); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter36.buildThenAddLayer(Rectangle.class).with(PaintStyle.SOLID_GREEN);
        boxCenter36.buildThenAddLayer(Rectangle.class).with(StrokeStyle.BOLD_BASIC, Color.BLACK);
        boxCenter36.buildThenAddLayer(Molar.class);

        Tooth g37 = odontogram.getTooth(37);
        Box boxCenter37 = g37.buildBoxForTop(Size.BOX_HEIGHT);
        g37.replaceBoxForCenter(boxCenter37); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter37.buildThenAddLayer(Molar.class);
        boxCenter37.buildThenAddLayer(Molar.class).with(MolarPart.CENTER, PaintStyle.ARSIR_MIRING_CYANVIOLET);

        Tooth g38 = odontogram.getTooth(38);
        Box boxCenter38 = g38.buildBoxForTop(Size.BOX_HEIGHT);
        g38.replaceBoxForCenter(boxCenter38); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter38.buildThenAddLayer(Molar.class);
        boxCenter38.buildThenAddLayer(Molar.class).with(MolarPart.CENTER, PaintStyle.ARSIR_VERTICAL_BLACKWHITE);

        Box boxBottom38UNE = g38.buildBoxForBottom(Size.HALF_BOX_HEIGHT);
        g38.appendBoxForBottom(boxBottom38UNE);

        boxBottom38UNE.buildThenAddLayer(Label.class).with("UNE");

//      === END MODIFIY STATE SEMUA GIGI ===

        try {
            BufferedImage canvas = odontogram.generateBufferedImage();
            ImageIO.write(canvas, "PNG", new File("odontogram.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
