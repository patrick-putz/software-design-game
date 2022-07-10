package softwaredesign.game.gameobjects.mapdesigner.tiles;

import softwaredesign.game.assets.AssetRepository;
import softwaredesign.game.assets.AssetType;

public class Sign extends Tile{
    public Sign() {
        super(AssetRepository.assets.get(AssetType.SIGN), 32, 32, true);
    }
}
