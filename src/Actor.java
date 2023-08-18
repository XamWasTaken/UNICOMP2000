import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.List;

public abstract class Actor {
  Color color;
  List<Polygon> polygons;
  Cell loc;

  public Actor() {
    polygons = new ArrayList<>();
  }

  public void addPolygon(Polygon polygon) {
    polygons.add(polygon);
  }

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
}
