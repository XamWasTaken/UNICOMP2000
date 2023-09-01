import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.List;

public abstract class Actor {
  Color color;
  List<Polygon> polygons;
  Cell loc;
  List<Polygon> display;

  public void paint(Graphics g) {
    g.setColor(color);
    for (Polygon polygon : polygons) {
      g.fillPolygon(polygon);
    }
    g.setColor(Color.GRAY);
    for (Polygon polygon : polygons) {
      g.drawPolygon(polygon);
    }
  }

  protected abstract void setPoly();

  public boolean isHuman() {
    return humanPlayer;
  }

  public void setLocation(Cell inLoc) {
    loc = inLoc;
    setPoly();
  }
}
