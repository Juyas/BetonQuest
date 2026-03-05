package org.betonquest.betonquest.api.integration;

/**
 * Offers methods for building integrations in a chain.
 */
public interface IntegrationBuilder {

    void enable(Integration integration);

    void postEnable(PostIntegration postIntegration);

    void teardown(IntegrationTeardown teardown);

    void integrate();
}
