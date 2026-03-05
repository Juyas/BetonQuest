package org.betonquest.betonquest.api.integration;

import org.betonquest.betonquest.api.BetonQuestApi;
import org.betonquest.betonquest.api.QuestException;

/**
 * Represents a set of features to be integrated with BetonQuest.
 */
public interface Integration {

    /**
     * Enables the integration.
     *
     * @param betonQuestApi the BetonQuest API
     * @throws QuestException if the integration fails
     */
    void enable(BetonQuestApi betonQuestApi) throws QuestException;
}
