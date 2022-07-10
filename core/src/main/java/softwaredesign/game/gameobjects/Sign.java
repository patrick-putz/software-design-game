package softwaredesign.game.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import softwaredesign.game.assets.AssetRepository;
import softwaredesign.game.assets.AssetType;

public class Sign implements GameObject {
    private Texture image;
    private Sprite sprite;

    public Sign() {
        image = AssetRepository.assets.get(AssetType.SIGN);
        sprite = new Sprite(image);
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
}
