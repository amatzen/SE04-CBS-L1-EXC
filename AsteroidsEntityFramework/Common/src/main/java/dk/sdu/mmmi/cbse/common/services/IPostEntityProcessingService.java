package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

/**
 * The interface Post entity processing service.
 *
 * @author jcs
 */
public interface IPostEntityProcessingService {

    /**
     * Process.
     *
     * @param gameData the game data
     * @param world    the world
     */
    void process(GameData gameData, World world);
}
