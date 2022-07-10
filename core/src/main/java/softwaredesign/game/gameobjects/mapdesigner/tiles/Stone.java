package softwaredesign.game.gameobjects.mapdesigner.tiles;

import softwaredesign.game.assets.AssetRepository;
import softwaredesign.game.assets.AssetType;

public class Stone extends Tile{
    public Stone() {
        super(AssetRepository.assets.get(AssetType.STONE), 32, 32, true);
    }
}
