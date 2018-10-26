import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String[] args) {
		World world = new World();
		Bug bugA = new Bug(Color.GREEN);
		Bug bugB = new Bug(Color.BLUE);
		Flower flowerA = new Flower();
		Flower flowerB = new Flower();
		Location placeA = new Location(1, 1);
		Location placeB = new Location(1, 9);
		for (int i = 0; i < 10; i++) {
			placeA = new Location(i, i);

			world.add(placeA, bugA);
			for (int j = 9; j > -1; j--) {
				placeB = new Location(i, j);
				if(i+j == 9)
				world.add(placeB, bugB);
			}
		}
		world.show();
	}
}
