package softwaredesign.game.gameobjects.mapdesigner.tiles;

import softwaredesign.game.assets.AssetRepository;
import softwaredesign.game.assets.AssetType;

public class TileWater extends Tile{
    public TileWater() {
        super(AssetRepository.assets.get(AssetType.TILE_WATER), 32, 32, false);
    }
}
