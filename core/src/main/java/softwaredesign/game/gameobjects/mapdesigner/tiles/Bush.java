package softwaredesign.game.gameobjects.mapdesigner.tiles;

import softwaredesign.game.assets.AssetRepository;
import softwaredesign.game.assets.AssetType;

public class Bush extends Tile{
    public Bush() {
        super(AssetRepository.assets.get(AssetType.BUSH), 32, 32, true);
    }
}
