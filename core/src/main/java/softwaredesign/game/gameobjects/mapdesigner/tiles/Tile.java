package softwaredesign.game.gameobjects.mapdesigner.tiles;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import softwaredesign.game.gameobjects.GameObject;

public abstract class Tile implements GameObject {
    protected Texture image;
    protected Sprite sprite;
    protected int width;
    protected int height;
    protected boolean obstacle;

    public Tile(Texture image, int width, int height, boolean obstacle) {
        this.image = image;
        this.sprite = new Sprite(image);
        this.width = width;
        this.height = height;
        this.obstacle = obstacle;
    }

    @Override
    public void act(float delta) {

    }

    @Override
    public void setPosition(float x, float y) {
        sprite.setPosition(x, y);
    }

    @Override
    public void draw(SpriteBatch batch) {
        sprite.draw(batch);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
