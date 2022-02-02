package dk.sdu.mmmi.cbse.gamestates;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import dk.sdu.mmmi.cbse.entities.Bullet;
import dk.sdu.mmmi.cbse.entities.Enemy;
import dk.sdu.mmmi.cbse.entities.Player;
import dk.sdu.mmmi.cbse.managers.GameKeys;
import dk.sdu.mmmi.cbse.managers.GameStateManager;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PlayState extends GameState {
	
	private ShapeRenderer sr;
	
	private Player player;
    private Enemy enemy;

    private ArrayList<Bullet> bullets;
	
	public PlayState(GameStateManager gsm) {
		super(gsm);
	}
	
	public void init() {

		sr = new ShapeRenderer();

        bullets = new ArrayList<>();

		player = new Player();
        enemy = new Enemy(bullets);
		
	}
	
	public void update(float dt) {
		
		handleInput();
		
		player.update(dt);
        enemy.update(dt);

        ListIterator<Bullet> bli = bullets.listIterator();
        while (bli.hasNext()) {
            Bullet b = bli.next();
            if(b.shouldRemove()) {
                bli.remove();
                continue;
            }

            b.update(dt);
        }

	}
	
	public void draw() {
        player.draw(sr);
        enemy.draw(sr);

        bullets.forEach(bullet -> bullet.draw(sr));
	}
	
	public void handleInput() {
		player.setLeft(GameKeys.isDown(GameKeys.LEFT));
		player.setRight(GameKeys.isDown(GameKeys.RIGHT));
		player.setUp(GameKeys.isDown(GameKeys.UP));
	}
	
	public void dispose() {}
	
}









