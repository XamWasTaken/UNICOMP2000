import java.awt.Color;
import java.awt.Polygon;

public class Bird extends Actor {
  // Bird design courtesy of Sawyer James Rush
  public Bird(Cell inLoc) {
    loc = inLoc;
    color = Color.GREEN;
    display = new ArrayList<Polygon>();
    Polygon body = new Polygon();
    body.addPoint(loc.x + 7, loc.y + 7);
    body.addPoint(loc.x + 15, loc.y + 5);
    body.addPoint(loc.x + 22, loc.y + 30);
    body.addPoint(loc.x + 10, loc.y + 13);
    body.addPoint(loc.x + 12, loc.y + 7);
    Polygon wing1 = new Polygon();
    wing1.addPoint(loc.x + 5, loc.y + 5);
    wing1.addPoint(loc.x + 15, loc.y + 17);
    wing1.addPoint(loc.x + 5, loc.y + 17);

    Polygon wing2 = new Polygon();
    wing2.addPoint(loc.x + 30, loc.y + 5);
    wing2.addPoint(loc.x + 20, loc.y + 17);
    wing2.addPoint(loc.x + 30, loc.y + 17);

    Polygon body = new Polygon();
    body.addPoint(loc.x + 15, loc.y + 10);
    body.addPoint(loc.x + 20, loc.y + 10);
    body.addPoint(loc.x + 20, loc.y + 25);
    body.addPoint(loc.x + 15, loc.y + 25);

    addPolygon(wing1);
    addPolygon(wing2);
    addPolygon(body);
  }
}
