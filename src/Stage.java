import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Stage {
  Grid grid;
  List<Actor> actors;

  public Stage() {
    grid = new Grid();
    actors = new ArrayList<Actor>();
  }

  public void paint(Graphics g, Point mouseLoc) {
    // do we have AI moves to make?
    if(currentState == State.BotMoving) {
      for(Actor a: actors) {
        if(!a.isHuman()) {
          List<Cell> possibleLocs = getClearRadius(a.loc, a.moves);
          int moveBotChooses = (new Random()).nextInt(possibleLocs.size());
          a.setLocation(possibleLocs.get(moveBotChooses));
        }
      }
      currentState = State.ChoosingActor;
      for(Actor a: actors) {
        a.turns = 1;
      }
    }
    grid.paint(g, mouseLoc);
    for(Actor a: actors) {
      a.paint(g);
    }
  }
}
