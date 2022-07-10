package softwaredesign.game.gameobjects.mapdesigner.tiles;

import softwaredesign.game.assets.AssetRepository;
import softwaredesign.game.assets.AssetType;

public class TileGravel extends Tile{
    public TileGravel() {
        super(AssetRepository.assets.get(AssetType.TILE_GRAVEL), 32, 32, false);
    }
}
