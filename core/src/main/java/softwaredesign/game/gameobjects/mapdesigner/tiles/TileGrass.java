package softwaredesign.game.gameobjects.mapdesigner.tiles;

import softwaredesign.game.assets.AssetRepository;
import softwaredesign.game.assets.AssetType;

public class TileGrass extends Tile{
    public TileGrass() {
        super(AssetRepository.assets.get(AssetType.TILE_GRASS), 32, 32, false);
    }
}
