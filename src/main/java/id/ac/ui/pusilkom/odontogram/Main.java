package id.ac.ui.pusilkom.odontogram;

import id.ac.ui.pusilkom.odontogram.constant.PaintStyle;
import id.ac.ui.pusilkom.odontogram.constant.Size;
import id.ac.ui.pusilkom.odontogram.constant.StrokeStyle;
import id.ac.ui.pusilkom.odontogram.enums.*;
import id.ac.ui.pusilkom.odontogram.model.Box;
import id.ac.ui.pusilkom.odontogram.model.Gigi;
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
public class Main {

    public static void main(String[] args)  {
        new Main();
    }

    Main()  {
        Odontogram odontogram = new Odontogram();

        Gigi g18 = odontogram.getGigi(18);
        Box boxTop18NON = g18.buildBoxForTop(Size.HALF_BOX_HEIGHT);
        g18.prependBoxForTop(boxTop18NON); // Utk penambahan box top, harus pake prependBoxForTop

        boxTop18NON.buildThenAddLayer(Label.class).with("NON");

        Box boxCenter18 = g18.buildBoxForTop(Size.BOX_HEIGHT);
        g18.replaceBoxForCenter(boxCenter18); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter18.buildThenAddLayer(Geraham.class);


        Gigi g17 = odontogram.getGigi(17);
        Box boxCenter17 = g17.buildBoxForTop(Size.BOX_HEIGHT);
        g17.replaceBoxForCenter(boxCenter17); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter17.buildThenAddLayer(Geraham.class);
        boxCenter17.buildThenAddLayer(X.class);


        Gigi g16 = odontogram.getGigi(16);
        Box boxCenter16 = g16.buildBoxForTop(Size.BOX_HEIGHT);
        g16.replaceBoxForCenter(boxCenter16); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter16.buildThenAddLayer(Geraham.class);
        boxCenter16.buildThenAddLayer(Geraham.class).with(GerahamPart.CENTER, PaintStyle.SOLID_BLACK);


        Gigi g15 = odontogram.getGigi(15);
        Box boxCenter15 = g15.buildBoxForTop(Size.BOX_HEIGHT);
        g15.replaceBoxForCenter(boxCenter15); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter15.buildThenAddLayer(Geraham.class);
        boxCenter15.buildThenAddLayer(X.class);

        Gigi g14 = odontogram.getGigi(14);
        Box boxCenter14 = g14.buildBoxForTop(Size.BOX_HEIGHT);
        g14.replaceBoxForCenter(boxCenter14); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter14.buildThenAddLayer(Geraham.class);
        boxCenter14.buildThenAddLayer(Rectangle.class).with(StrokeStyle.BASIC, Color.BLACK, true);


        Gigi g13 = odontogram.getGigi(13);
        Box boxCenter13 = g13.buildBoxForTop(Size.BOX_HEIGHT);
        g13.replaceBoxForCenter(boxCenter13); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter13.buildThenAddLayer(NonGeraham.class);

        Gigi g12 = odontogram.getGigi(12);
        Box boxTop12NON = g12.buildBoxForTop(Size.HALF_BOX_HEIGHT);
        g12.prependBoxForTop(boxTop12NON); // Utk penambahan box top, harus pake prependBoxForTop

        boxTop12NON.buildThenAddLayer(Label.class).with("ANO");

        Box boxCenter12 = g12.buildBoxForTop(Size.BOX_HEIGHT);
        g12.replaceBoxForCenter(boxCenter12); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter12.buildThenAddLayer(NonGeraham.class);

        Gigi g11 = odontogram.getGigi(11);
        Box boxCenter11 = g11.buildBoxForTop(Size.BOX_HEIGHT);
        g11.replaceBoxForCenter(boxCenter11); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter11.buildThenAddLayer(NonGeraham.class);
        boxCenter11.buildThenAddLayer(NonGeraham.class).with(NonGerahamPart.RIGHT, StrokeStyle.BOLDER_BASIC, Color.BLACK);


        Gigi g21 = odontogram.getGigi(21);
        Box boxCenter21 = g21.buildBoxForTop(Size.BOX_HEIGHT);
        g21.replaceBoxForCenter(boxCenter21); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter21.buildThenAddLayer(NonGeraham.class);

        Gigi g22 = odontogram.getGigi(22);
        Box boxCenter22 = g22.buildBoxForTop(Size.BOX_HEIGHT);
        g22.replaceBoxForCenter(boxCenter22); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter22.buildThenAddLayer(NonGeraham.class);
        boxCenter22.buildThenAddLayer(Hash.class);

        Box boxBottom22 = g22.buildBoxForBottom(Size.HALF_BOX_HEIGHT);
        g22.prependBoxForBottom(boxBottom22);
        boxBottom22.buildThenAddLayer(Arrow.class).with("CLOCKWISE", StrokeStyle.BASIC);

        Gigi g23 = odontogram.getGigi(23);
        Box boxCenter23 = g23.buildBoxForTop(Size.BOX_HEIGHT);
        g23.replaceBoxForCenter(boxCenter23); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter23.buildThenAddLayer(NonGeraham.class);

        Box boxBottom23 = g23.buildBoxForBottom(Size.HALF_BOX_HEIGHT);
        g23.prependBoxForBottom(boxBottom23);
        boxBottom23.buildThenAddLayer(Arrow.class).with("COUNTERCLOCKWISE", StrokeStyle.BASIC);

        Gigi g24 = odontogram.getGigi(24);
        Box boxCenter24 = g24.buildBoxForTop(Size.BOX_HEIGHT);
        g24.replaceBoxForCenter(boxCenter24); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter24.buildThenAddLayer(Geraham.class);
        boxCenter24.buildThenAddLayer(Geraham.class).with(GerahamPart.CENTER, PaintStyle.SOLID_GREEN);

        Gigi g25 = odontogram.getGigi(25);
        Box boxCenter25 = g25.buildBoxForTop(Size.BOX_HEIGHT);
        g25.replaceBoxForCenter(boxCenter25); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter25.buildThenAddLayer(Geraham.class);
        boxCenter25.buildThenAddLayer(X.class);

        Gigi g26 = odontogram.getGigi(26);
        Box boxCenter26 = g26.buildBoxForTop(Size.BOX_HEIGHT);
        g26.replaceBoxForCenter(boxCenter26); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter26.buildThenAddLayer(Rectangle.class).with(PaintStyle.SOLID_GREEN);
        boxCenter26.buildThenAddLayer(Rectangle.class).with(StrokeStyle.BOLD_BASIC, Color.BLACK);
        boxCenter26.buildThenAddLayer(Geraham.class);
        boxCenter26.buildThenAddLayer(Geraham.class).with(GerahamPart.CENTER, StrokeStyle.BOLD_BASIC, Color.GREEN);
        boxCenter26.buildThenAddLayer(Geraham.class).with(GerahamPart.CENTER, StrokeStyle.DASHED_BOLDER_BASIC, Color.BLACK);

        Box boxBottom26 = g26.buildBoxForBottom(Size.HALF_BOX_HEIGHT);
        g26.prependBoxForBottom(boxBottom26);

        boxBottom26.buildThenAddLayer(Triangle.class).with(TriangleDirection.DOWN, PaintStyle.SOLID_BLACK);

        Gigi g27 = odontogram.getGigi(27);
        Box boxCenter27 = g27.buildBoxForTop(Size.BOX_HEIGHT);
        g27.replaceBoxForCenter(boxCenter27); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter27.buildThenAddLayer(Geraham.class);
        boxCenter27.buildThenAddLayer(V.class);

        Gigi g28 = odontogram.getGigi(28);
        Box boxTop28NON = g28.buildBoxForTop(Size.HALF_BOX_HEIGHT);
        g28.prependBoxForTop(boxTop28NON); // Utk penambahan box top, harus pake prependBoxForTop

        boxTop28NON.buildThenAddLayer(Label.class).with("NON");

        Box boxCenter28 = g28.buildBoxForTop(Size.BOX_HEIGHT);
        g28.replaceBoxForCenter(boxCenter28); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter28.buildThenAddLayer(Geraham.class);


        Gigi g56 = odontogram.getGigi(56);
        Box boxCenter56 = g56.buildBoxForTop(Size.BOX_HEIGHT);
        g56.replaceBoxForCenter(boxCenter56); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter56.buildThenAddLayer(HLine.class).with(HLinePart.HALF_RIGHT);


        Gigi g55 = odontogram.getGigi(55);
        Box boxCenter55 = g55.buildBoxForTop(Size.BOX_HEIGHT);
        g55.replaceBoxForCenter(boxCenter55); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter55.buildThenAddLayer(Geraham.class);
        boxCenter55.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Gigi g54 = odontogram.getGigi(54);
        Box boxCenter54 = g54.buildBoxForTop(Size.BOX_HEIGHT);
        g54.replaceBoxForCenter(boxCenter54); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter54.buildThenAddLayer(Geraham.class);
        boxCenter54.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Gigi g53 = odontogram.getGigi(53);
        Box boxCenter53 = g53.buildBoxForTop(Size.BOX_HEIGHT);
        g53.replaceBoxForCenter(boxCenter53); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter53.buildThenAddLayer(NonGeraham.class);
        boxCenter53.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Gigi g52 = odontogram.getGigi(52);
        Box boxCenter52 = g52.buildBoxForTop(Size.BOX_HEIGHT);
        g52.replaceBoxForCenter(boxCenter52); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter52.buildThenAddLayer(NonGeraham.class);
        boxCenter52.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Gigi g51 = odontogram.getGigi(51);
        Box boxCenter51 = g51.buildBoxForTop(Size.BOX_HEIGHT);
        g51.replaceBoxForCenter(boxCenter51); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter51.buildThenAddLayer(NonGeraham.class);
        boxCenter51.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Gigi g61 = odontogram.getGigi(61);
        Box boxCenter61 = g61.buildBoxForTop(Size.BOX_HEIGHT);
        g61.replaceBoxForCenter(boxCenter61); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter61.buildThenAddLayer(NonGeraham.class);
        boxCenter61.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Gigi g62 = odontogram.getGigi(62);
        Box boxCenter62 = g62.buildBoxForTop(Size.BOX_HEIGHT);
        g62.replaceBoxForCenter(boxCenter62); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter62.buildThenAddLayer(NonGeraham.class);
        boxCenter62.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Gigi g63 = odontogram.getGigi(63);
        Box boxCenter63 = g63.buildBoxForTop(Size.BOX_HEIGHT);
        g63.replaceBoxForCenter(boxCenter63); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter63.buildThenAddLayer(NonGeraham.class);
        boxCenter63.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Gigi g64 = odontogram.getGigi(64);
        Box boxCenter64 = g64.buildBoxForTop(Size.BOX_HEIGHT);
        g64.replaceBoxForCenter(boxCenter64); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter64.buildThenAddLayer(Geraham.class);
        boxCenter64.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Gigi g65 = odontogram.getGigi(65);
        Box boxCenter65 = g65.buildBoxForTop(Size.BOX_HEIGHT);
        g65.replaceBoxForCenter(boxCenter65); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter65.buildThenAddLayer(Geraham.class);
        boxCenter65.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Gigi g66 = odontogram.getGigi(66);
        Box boxCenter66 = g66.buildBoxForTop(Size.BOX_HEIGHT);
        g66.replaceBoxForCenter(boxCenter66); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter66.buildThenAddLayer(HLine.class).with(HLinePart.HALF_LEFT);

        Gigi g86 = odontogram.getGigi(86);
        Box boxCenter86 = g86.buildBoxForTop(Size.BOX_HEIGHT);
        g86.replaceBoxForCenter(boxCenter86); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter86.buildThenAddLayer(HLine.class).with(HLinePart.HALF_RIGHT);

        Gigi g85 = odontogram.getGigi(85);
        Box boxCenter85 = g85.buildBoxForTop(Size.BOX_HEIGHT);
        g85.replaceBoxForCenter(boxCenter85); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter85.buildThenAddLayer(Geraham.class);
        boxCenter85.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Gigi g84 = odontogram.getGigi(84);
        Box boxCenter84 = g84.buildBoxForTop(Size.BOX_HEIGHT);
        g84.replaceBoxForCenter(boxCenter84); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter84.buildThenAddLayer(Geraham.class);
        boxCenter84.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Gigi g83 = odontogram.getGigi(83);
        Box boxCenter83 = g83.buildBoxForTop(Size.BOX_HEIGHT);
        g83.replaceBoxForCenter(boxCenter83); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter83.buildThenAddLayer(NonGeraham.class);
        boxCenter83.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Gigi g82 = odontogram.getGigi(82);
        Box boxCenter82 = g82.buildBoxForTop(Size.BOX_HEIGHT);
        g82.replaceBoxForCenter(boxCenter82); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter82.buildThenAddLayer(NonGeraham.class);
        boxCenter82.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Gigi g81 = odontogram.getGigi(81);
        Box boxCenter81 = g81.buildBoxForTop(Size.BOX_HEIGHT);
        g81.replaceBoxForCenter(boxCenter81); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter81.buildThenAddLayer(NonGeraham.class);
        boxCenter81.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Gigi g71 = odontogram.getGigi(71);
        Box boxCenter71 = g71.buildBoxForTop(Size.BOX_HEIGHT);
        g71.replaceBoxForCenter(boxCenter71); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter71.buildThenAddLayer(NonGeraham.class);
        boxCenter71.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Gigi g72 = odontogram.getGigi(72);
        Box boxCenter72 = g72.buildBoxForTop(Size.BOX_HEIGHT);
        g72.replaceBoxForCenter(boxCenter72); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter72.buildThenAddLayer(NonGeraham.class);
        boxCenter72.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Gigi g73 = odontogram.getGigi(73);
        Box boxCenter73 = g73.buildBoxForTop(Size.BOX_HEIGHT);
        g73.replaceBoxForCenter(boxCenter73); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter73.buildThenAddLayer(NonGeraham.class);
        boxCenter73.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Gigi g74 = odontogram.getGigi(74);
        Box boxCenter74 = g74.buildBoxForTop(Size.BOX_HEIGHT);
        g74.replaceBoxForCenter(boxCenter74); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter74.buildThenAddLayer(Geraham.class);
        boxCenter74.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Gigi g75 = odontogram.getGigi(75);
        Box boxCenter75 = g75.buildBoxForTop(Size.BOX_HEIGHT);
        g75.replaceBoxForCenter(boxCenter75); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter75.buildThenAddLayer(Geraham.class);
        boxCenter75.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Gigi g76 = odontogram.getGigi(76);
        Box boxCenter76 = g76.buildBoxForTop(Size.BOX_HEIGHT);
        g76.replaceBoxForCenter(boxCenter76); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter76.buildThenAddLayer(HLine.class).with(HLinePart.HALF_LEFT);

        Gigi g48 = odontogram.getGigi(48);
        Box boxCenter48 = g48.buildBoxForTop(Size.BOX_HEIGHT);
        g48.replaceBoxForCenter(boxCenter48); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter48.buildThenAddLayer(Geraham.class);

        Box boxBottom48UNE = g48.buildBoxForBottom(Size.HALF_BOX_HEIGHT);
        g48.appendBoxForBottom(boxBottom48UNE);

        boxBottom48UNE.buildThenAddLayer(Label.class).with("UNE");

        Gigi g47 = odontogram.getGigi(47);
        Box boxTop47 = g47.buildBoxForTop(Size.HALF_BOX_HEIGHT);
        g47.appendBoxForTop(boxTop47); // Utk penambahan box top, harus pake prependBoxForTop

        boxTop47.buildThenAddLayer(Triangle.class).with(TriangleDirection.UP, StrokeStyle.BOLD_BASIC, Color.BLACK);

        Box boxCenter47 = g47.buildBoxForTop(Size.BOX_HEIGHT);
        g47.replaceBoxForCenter(boxCenter47); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter47.buildThenAddLayer(Geraham.class);
        boxCenter47.buildThenAddLayer(Geraham.class).with(GerahamPart.CENTER, StrokeStyle.BOLDER_BASIC, Color.BLACK);

        Gigi g46 = odontogram.getGigi(46);
        Box boxTop46 = g46.buildBoxForTop(Size.HALF_BOX_HEIGHT);
        g46.appendBoxForTop(boxTop46); // Utk penambahan box top, harus pake prependBoxForTop

        boxTop46.buildThenAddLayer(Triangle.class).with(TriangleDirection.UP, PaintStyle.SOLID_BLACK);

        Box boxCenter46 = g46.buildBoxForTop(Size.BOX_HEIGHT);
        g46.replaceBoxForCenter(boxCenter46); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter46.buildThenAddLayer(Geraham.class);
        boxCenter46.buildThenAddLayer(Geraham.class).with(GerahamPart.CENTER, PaintStyle.SOLID_GREEN);

        Gigi g45 = odontogram.getGigi(45);
        Box boxTop45 = g45.buildBoxForTop(Size.HALF_BOX_HEIGHT);
        g45.appendBoxForTop(boxTop45); // Utk penambahan box top, harus pake prependBoxForTop

        boxTop45.buildThenAddLayer(VLine.class).with(VLinePart.HALF_BOTTOM);
        boxTop45.buildThenAddLayer(HLine.class).with(HLinePart.HALF_RIGHT);

        Box boxCenter45 = g45.buildBoxForTop(Size.BOX_HEIGHT);
        g45.replaceBoxForCenter(boxCenter45); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter45.buildThenAddLayer(Rectangle.class).with(PaintStyle.SOLID_GREEN);
        boxCenter45.buildThenAddLayer(Rectangle.class).with(StrokeStyle.BOLD_BASIC, Color.BLACK);
        boxCenter45.buildThenAddLayer(Geraham.class);

        Gigi g44 = odontogram.getGigi(44);
        Box boxTop44 = g44.buildBoxForTop(Size.HALF_BOX_HEIGHT);
        g44.appendBoxForTop(boxTop44); // Utk penambahan box top, harus pake prependBoxForTop

        boxTop44.buildThenAddLayer(HLine.class).with(HLinePart.FULL);

        Box boxCenter44 = g44.buildBoxForTop(Size.BOX_HEIGHT);
        g44.replaceBoxForCenter(boxCenter44); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter44.buildThenAddLayer(Rectangle.class).with(PaintStyle.SOLID_GREEN);
        boxCenter44.buildThenAddLayer(Rectangle.class).with(StrokeStyle.BOLD_BASIC, Color.BLACK);
        boxCenter44.buildThenAddLayer(Geraham.class);
        boxCenter44.buildThenAddLayer(X.class);

        Gigi g43 = odontogram.getGigi(43);
        Box boxTop43 = g43.buildBoxForTop(Size.HALF_BOX_HEIGHT);
        g43.appendBoxForTop(boxTop43); // Utk penambahan box top, harus pake prependBoxForTop

        boxTop43.buildThenAddLayer(VLine.class).with(VLinePart.HALF_BOTTOM);
        boxTop43.buildThenAddLayer(HLine.class).with(HLinePart.HALF_LEFT);

        Box boxCenter43 = g43.buildBoxForTop(Size.BOX_HEIGHT);
        g43.replaceBoxForCenter(boxCenter43); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter43.buildThenAddLayer(Rectangle.class).with(PaintStyle.SOLID_GREEN);
        boxCenter43.buildThenAddLayer(Rectangle.class).with(StrokeStyle.BOLD_BASIC, Color.BLACK);
        boxCenter43.buildThenAddLayer(NonGeraham.class);

        Gigi g42 = odontogram.getGigi(42);
        Box boxCenter42 = g42.buildBoxForTop(Size.BOX_HEIGHT);
        g42.replaceBoxForCenter(boxCenter42); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter42.buildThenAddLayer(NonGeraham.class);

        Gigi g41 = odontogram.getGigi(41);
        Box boxCenter41 = g41.buildBoxForTop(Size.BOX_HEIGHT);
        g41.replaceBoxForCenter(boxCenter41); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter41.buildThenAddLayer(NonGeraham.class);

        Gigi g31 = odontogram.getGigi(31);
        Box boxTop31 = g31.buildBoxForTop(Size.HALF_BOX_HEIGHT);
        g31.prependBoxForTop(boxTop31);
        boxTop31.buildThenAddLayer(Arrow.class).with("COUNTERCLOCKWISE", StrokeStyle.BASIC);

        Box boxCenter31 = g31.buildBoxForTop(Size.BOX_HEIGHT);
        g31.replaceBoxForCenter(boxCenter31); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter31.buildThenAddLayer(NonGeraham.class);

        Gigi g32 = odontogram.getGigi(32);
        Box boxCenter32 = g32.buildBoxForTop(Size.BOX_HEIGHT);
        g32.replaceBoxForCenter(boxCenter32); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter32.buildThenAddLayer(NonGeraham.class);

        Gigi g33 = odontogram.getGigi(33);
        Box boxCenter33 = g33.buildBoxForTop(Size.BOX_HEIGHT);
        g33.replaceBoxForCenter(boxCenter33); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter33.buildThenAddLayer(NonGeraham.class);
        boxCenter33.buildThenAddLayer(X.class);

        Gigi g34 = odontogram.getGigi(34);
        Box boxCenter34 = g34.buildBoxForTop(Size.BOX_HEIGHT);
        g34.replaceBoxForCenter(boxCenter34); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter34.buildThenAddLayer(Geraham.class);
        boxCenter34.buildThenAddLayer(X.class);

        Gigi g35 = odontogram.getGigi(35);
        Box boxCenter35 = g35.buildBoxForTop(Size.BOX_HEIGHT);
        g35.replaceBoxForCenter(boxCenter35); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter35.buildThenAddLayer(Geraham.class);

        Gigi g36 = odontogram.getGigi(36);
        Box boxCenter36 = g36.buildBoxForTop(Size.BOX_HEIGHT);
        g36.replaceBoxForCenter(boxCenter36); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter36.buildThenAddLayer(Rectangle.class).with(PaintStyle.SOLID_GREEN);
        boxCenter36.buildThenAddLayer(Rectangle.class).with(StrokeStyle.BOLD_BASIC, Color.BLACK);
        boxCenter36.buildThenAddLayer(Geraham.class);

        Gigi g37 = odontogram.getGigi(37);
        Box boxCenter37 = g37.buildBoxForTop(Size.BOX_HEIGHT);
        g37.replaceBoxForCenter(boxCenter37); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter37.buildThenAddLayer(Geraham.class);
        boxCenter37.buildThenAddLayer(Geraham.class).with(GerahamPart.CENTER, PaintStyle.ARSIR_MIRING_CYANVIOLET);

        Gigi g38 = odontogram.getGigi(38);
        Box boxCenter38 = g38.buildBoxForTop(Size.BOX_HEIGHT);
        g38.replaceBoxForCenter(boxCenter38); // Utk penggantian box center, harus pake replaceBoxForCenter

        boxCenter38.buildThenAddLayer(Geraham.class);
        boxCenter38.buildThenAddLayer(Geraham.class).with(GerahamPart.CENTER, PaintStyle.ARSIR_VERTICAL_BLACKWHITE);

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
