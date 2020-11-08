package paint;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.IOException;

public class MyDiamond  implements Class2D{

    private Polygon Diamond;
    private Color lineColor = null;
    private Color color = null;
    public MyDiamond() {

    }
    public MyDiamond(Polygon pol) {
        this.Diamond = pol;
    }
    public MyDiamond(Polygon pol, Color lc) {
        this.Diamond = pol;
        this.lineColor = lc;
    }
    public MyDiamond(Polygon pol, Color lc, Color c) {
        this.Diamond = pol;
        this.lineColor = lc;
        this.color = c;
    }
    @Override
    public void makeObject(Point startDrag, Point endDrag){
        setLineColor(GUI.selectColor);
        int midx = endDrag.x + (startDrag.x - endDrag.x) / 2;
        int midy = endDrag.y + (startDrag.y - endDrag.y) / 2;
        int[] xs = { endDrag.x, midx, startDrag.x, midx};
        int[] ys = { midy, endDrag.y, midy, startDrag.y};
        Polygon pol = new Polygon(xs, ys, xs.length);
        this.setDiamond(pol);
    }

    public void makeObject(int x1, int y1, int x2, int y2){
        int midx;
        int midy;
        midx = x2 + (x1 - x2);
        midy = y2 + (y1 - y2);
        int[] xs = { x2, midx, x1, midx};
        int[] ys = { midy, y2, midy, x1};
        Polygon pol = new Polygon(xs, ys, xs.length);
        this.setDiamond(pol);
    }

    @Override
    public void draw(GraphicAdapter g) {
        if(getColor() == null){
            g.getGraphicAdapter().setColor(getLineColor());
            g.getGraphicAdapter().drawPolygon(getDiamond());
        }
        else{
            g.getGraphicAdapter().setColor(getColor());
            g.getGraphicAdapter().fillPolygon(getDiamond());
        }
    }
    @Override
    public void fill(Color c){
        this.setColor(c);
    }

    @Override
    public boolean contains(Point p) {
        return getDiamond().contains(p);
    }

    @Override
    public void move(Point startDrag, Point endDrag) {
        int[] xs = {0, 0, 0, 0};
        int[] ys = {0, 0, 0, 0};
        for(int k = 0; k < 4; k++ ){
            xs[k] = this.getDiamond().xpoints[k] + endDrag.x - startDrag.x;
            ys[k] = this.getDiamond().ypoints[k] + endDrag.y - startDrag.y;
        }
        this.setDiamond(new Polygon(xs,ys,4));
    }

    @Override
    public void writetoFile(BufferedWriter b){
        try {
            b.write(getClass().getSimpleName() + ";");
            b.write(getDiamond().xpoints[2] + ";" + getDiamond().ypoints[3] + ";");
            b.write(getDiamond().xpoints[0] + ";" + getDiamond().ypoints[1] + ";");
            b.write(getLineColor().getRed() + ";" + getLineColor().getGreen() + ";" + getLineColor().getBlue() +";");
            if(getColor() == null){
                b.write("null" + ";" +"null" +";" + "null");
            }else{
                b.write(getColor().getRed() + ";" + getColor().getGreen() + ";" + getColor().getBlue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Polygon getDiamond() {
        return Diamond;
    }
    public void setDiamond(Polygon diamond) {
        Diamond = diamond;
    }
    public Color getLineColor() {
        return lineColor;
    }
    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

}
