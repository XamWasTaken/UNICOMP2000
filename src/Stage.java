import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Optional;
import java.awt.Color;

public class Stage {
  Grid grid;
  // Actor cat;
  // Actor dog;
  // Actor bird;
  ArrayList<Actor> actors;

  public Stage() {
    grid = new Grid();
    actors = new ArrayList<>();
    actors.add(new Cat(grid.cellAtColRow(10, 6)));
    actors.add(new Dog(grid.cellAtColRow(3, 12)));
    actors.add(new Bird(grid.cellAtColRow(18, 3)));
    // cat = new Cat(grid.cellAtColRow(0, 0));
    // dog = new Dog(grid.cellAtColRow(0, 15));
    // bird = new Bird(grid.cellAtColRow(12, 9));
  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    for (Actor a : actors) {
      a.paint(g);
    }

    String cDisplay = "";
    Optional<Cell> mouseOverCell = grid.cellAtPoint(mouseLoc);
    if (mouseOverCell.isPresent()) {
      cDisplay = mouseOverCell.get().toString();
    } else {
      cDisplay = "Cursor is not over a cell";
    }

    g.setColor(Color.black);
    g.drawString(cDisplay, 760, 50);
  }
}
