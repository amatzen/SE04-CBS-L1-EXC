package dk.sdu.mmmi.cbse.entities;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.MathUtils;

public class Bullet extends SpaceObject {
    private float lifeTime;
    private float lifeTimer;

    private boolean remove;

    public Bullet(float x, float y, float radians) {
        this.x = x;
        this.y = y;
        this.radians = radians;

        float speed = 350;
        dx = MathUtils.cos(radians) * speed;
        dy = MathUtils.sin(radians) * speed;

        width = height = 2;

        lifeTimer = 0;
        lifeTime = 0.75f;
    }

    public boolean shouldRemove() {
        return remove;
    }

    public void update(float dt) {
        x += dx * dt;
        y += dy * dt;

        wrap();

        lifeTimer += dt;
        if (lifeTimer > lifeTime) {
            remove = true;
        }
    }

    public void draw(ShapeRenderer sr) {
        sr.setColor(Color.RED);
        sr.begin(ShapeRenderer.ShapeType.Line);
        sr.circle(x, y, 2);
        sr.end();
    }
}
