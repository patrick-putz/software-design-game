package softwaredesign.game.gameobjects.mapdesigner.tiles;

import com.badlogic.gdx.graphics.Texture;
import softwaredesign.game.assets.AssetRepository;
import softwaredesign.game.assets.AssetType;

public class Log extends Tile{
    public Log() {
        super(AssetRepository.assets.get(AssetType.LOG), 32, 32, true);
    }
}
