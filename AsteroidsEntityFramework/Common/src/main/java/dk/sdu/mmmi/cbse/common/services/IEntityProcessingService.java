package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

/**
 * The interface Entity processing service.
 */
public interface IEntityProcessingService {

    /**
     * Process.
     *
     * @param gameData the game data
     * @param world    the world
     */
    void process(GameData gameData, World world);
}
