package softwaredesign.game.gameobjects.mapdesigner;

import com.badlogic.gdx.utils.Array;
import softwaredesign.game.gameobjects.GameObject;
import softwaredesign.game.gameobjects.mapdesigner.tiles.*;

import java.util.ArrayList;

public class TileFactory {

    private Tile getTileType(TileType tileType){
        switch (tileType){
            case BUSH:
                return new Bush();
            case LOG:
                return new Log();
            case SIGN:
                return new Sign();
            case STONE:
                return new Stone();
            case TILE_GRASS:
                return new TileGrass();
            case TILE_GRAVEL:
                return new TileGravel();
            case TILE_WALL:
                return new TileWall();
            case TILE_WATER:
                return new TileWater();
            default:
                return null;
        }
    }

    public Tile createTile(TileType tileType, int positionX, int positionY){
        Tile tile = getTileType(tileType);
        tile.setPosition(positionX, positionY);
        return tile;
    }

    public ArrayList<Tile> createTileArea(TileType tileType, int topLeftX, int topLeftY, int numberOfTilesHorizontal, int numberOfTilesVertical){
        ArrayList<Tile> tiles = new ArrayList<>();
        int currentX = topLeftX;
        int currentY = topLeftY;

        for(int i = 0; i < (numberOfTilesVertical - 1); i++){
            for(int j = 0; j < (numberOfTilesHorizontal - 1); j++){
                Tile tile = createTile(tileType, currentX, currentY);
                currentX += tile.getWidth();
                tiles.add(tile);
            }
            currentX = topLeftX;
            currentY -= tiles.get(0).getHeight();
        }

        return tiles;
    }

    public ArrayList<Tile> createTileBorder(TileType tileType, int topLeftX, int topLeftY, int numberOfTilesHorizontal, int numberOfTilesVertical){
        ArrayList<Tile> tiles = new ArrayList<>();
        int currentX = topLeftX;
        int currentY = topLeftY;

        // Top Row
        for(int i = 0; i < (numberOfTilesHorizontal - 1); i++){
            Tile tile = createTile(tileType, currentX, currentY);
            currentX += tile.getWidth();
            tiles.add(tile);
        }
        // Right Column
        for(int i = 0; i < (numberOfTilesVertical - 1); i++){
            Tile tile = createTile(tileType, currentX, currentY);
            currentY -= tile.getHeight();
            tiles.add(tile);
        }
        // Bottom Row
        for(int i = 0; i < (numberOfTilesHorizontal - 1); i++){
            Tile tile = createTile(tileType, currentX, currentY);
            currentX -= tile.getWidth();
            tiles.add(tile);
        }
        // Left Column
        for(int i = 0; i < (numberOfTilesVertical - 1); i++){
            Tile tile = createTile(tileType, currentX, currentY);
            currentY += tile.getHeight();
            tiles.add(tile);
        }

        return tiles;
    }

    public void addTileToGameObjects(Array<GameObject> gameObjects, Tile tile){
        gameObjects.add(tile);
    }

    public void addTilePatternToGameObjects(Array<GameObject> gameObjects, ArrayList<Tile> tiles){
        for (Tile tile : tiles) {
            gameObjects.add(tile);
        }
    }
}
