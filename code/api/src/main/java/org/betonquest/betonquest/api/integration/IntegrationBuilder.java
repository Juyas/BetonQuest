package org.betonquest.betonquest.api.integration;

import org.betonquest.betonquest.api.BetonQuestApi;

import java.util.function.Consumer;

/**
 * Offers methods for building integrations in a chain.
 */
public interface IntegrationBuilder {

    /**
     * Registers functionality to be called when the integration is enabled.
     *
     * @param enable the integration to enable
     */
    void enable(Consumer<BetonQuestApi> enable);

    /**
     * Registers functionality to be enabled after all plugins are enabled.
     *
     * @param postEnable the integration to enable
     */
    void postEnable(Consumer<BetonQuestApi> postEnable);

    /**
     * Registers functionality to be called when the integration is disabled.
     *
     * @param teardown the integration to disable
     */
    void teardown(Runnable teardown);

    /**
     * Finalizes the builder by registering the integration with all its methods.
     */
    void integrate();
}
