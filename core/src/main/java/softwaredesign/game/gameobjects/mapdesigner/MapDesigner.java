package softwaredesign.game.gameobjects.mapdesigner;

import com.badlogic.gdx.utils.Array;
import softwaredesign.game.gameobjects.GameObject;
import softwaredesign.game.gameobjects.mapdesigner.tiles.TileType;

public class MapDesigner {
    private TileFactory tileFactory = new TileFactory();

    public void createStartingPointMap(Array<GameObject> gameObjects){
        tileFactory.addTilePatternToGameObjects(gameObjects,
                tileFactory.createTileArea(TileType.TILE_GRASS, -240, 210, 16, 16));
        tileFactory.addTilePatternToGameObjects(gameObjects,
                tileFactory.createTileBorder(TileType.TILE_GRAVEL, 48, 178, 5, 5));
        tileFactory.addTilePatternToGameObjects(gameObjects,
                tileFactory.createTileArea(TileType.TILE_WATER,80, 146, 4, 4));

        tileFactory.addTilePatternToGameObjects(gameObjects,
                tileFactory.createTileBorder(TileType.BUSH, -240, 210, 15, 15));
        tileFactory.addTileToGameObjects(gameObjects,
                tileFactory.createTile(TileType.SIGN, 48, 56));
        tileFactory.addTileToGameObjects(gameObjects,
                tileFactory.createTile(TileType.STONE, 148, 182));
        tileFactory.addTileToGameObjects(gameObjects,
                tileFactory.createTile(TileType.STONE, 178, 182));
        tileFactory.addTileToGameObjects(gameObjects,
                tileFactory.createTile(TileType.STONE, 178, 156));
        tileFactory.addTileToGameObjects(gameObjects,
                tileFactory.createTile(TileType.LOG, 176, -214));
        tileFactory.addTileToGameObjects(gameObjects,
                tileFactory.createTile(TileType.LOG, -208, -214));
        tileFactory.addTileToGameObjects(gameObjects,
                tileFactory.createTile(TileType.LOG, -214, -200));
        tileFactory.addTileToGameObjects(gameObjects,
                tileFactory.createTile(TileType.LOG, -188, -214));

    }
}
