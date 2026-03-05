package org.betonquest.betonquest.api.integration;

import org.betonquest.betonquest.api.QuestException;

/**
 * Represents a teardown of an integration.
 */
public interface IntegrationTeardown {

    /**
     * Disables the integration.
     *
     * @throws QuestException if the integration teardown fails
     */
    void disable() throws QuestException;
}
