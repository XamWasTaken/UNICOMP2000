import java.awt.Color;
import java.awt.Polygon;

public class Cat extends Actor {
  // Cat design courtesy of Sawyer James Rush
  public Cat(Cell inLoc) {
    loc = inLoc;
    color = Color.BLUE;
    display = new ArrayList<Polygon>();
    Polygon ear1 = new Polygon();
    ear1.addPoint(loc.x + 11, loc.y + 5);
    ear1.addPoint(loc.x + 15, loc.y + 15);
    ear1.addPoint(loc.x + 7, loc.y + 15);

    Polygon ear2 = new Polygon();
    ear2.addPoint(loc.x + 22, loc.y + 5);
    ear2.addPoint(loc.x + 26, loc.y + 15);
    ear2.addPoint(loc.x + 18, loc.y + 15);

    Polygon face = new Polygon();
    face.addPoint(loc.x + 5, loc.y + 15);
    face.addPoint(loc.x + 29, loc.y + 15);
    face.addPoint(loc.x + 17, loc.y + 30);

    addPolygon(ear1);
    addPolygon(ear2);
    addPolygon(face);
  }
}
