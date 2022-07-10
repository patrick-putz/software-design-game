package softwaredesign.game.assets;

import com.badlogic.gdx.graphics.Texture;

import java.util.HashMap;

public class AssetRepository {

    public static HashMap<AssetType, Texture> assets;

    public static void loadAssets(){
        assets = new HashMap<>();
        assets.put(AssetType.BUSH, new Texture("bush.png"));
        assets.put(AssetType.LOG, new Texture("log.png"));
        assets.put(AssetType.SIGN, new Texture("sign.png"));
        assets.put(AssetType.STONE, new Texture("stone.png"));
        assets.put(AssetType.TILE_GRASS, new Texture("tile_gras.png"));
        assets.put(AssetType.TILE_GRAVEL, new Texture("tile_gravel.png"));
        assets.put(AssetType.TILE_WALL, new Texture("tile_wall.png"));
        assets.put(AssetType.TILE_WATER, new Texture("tile_water.png"));
        assets.put(AssetType.PLAYER, new Texture("player.png"));
    }

}
