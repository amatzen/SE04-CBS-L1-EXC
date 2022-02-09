package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

/**
 * The Game Plugin Service Contract.
 */
public interface IGamePluginService {

    /**
     * Starts a game plugin
     *
     * @param gameData The game context
     * @param world    The world
     */
    void start(GameData gameData, World world);

    /**
     * Stops a game plugin
     *
     * @param gameData the game data
     * @param world    the world
     */
    void stop(GameData gameData, World world);
}
