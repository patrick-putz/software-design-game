package softwaredesign.game.gameobjects.mapdesigner.tiles;

import softwaredesign.game.assets.AssetRepository;
import softwaredesign.game.assets.AssetType;

public class TileWall extends Tile{
    public TileWall() {
        super(AssetRepository.assets.get(AssetType.TILE_WALL), 32, 32, false);
    }
}
