package org.betonquest.betonquest.api.identifier;

public interface CompassIdentifier extends Identifier {

    /**
     * Get the full path of the tag to indicate a quest compass should be shown.
     *
     * @return the compass tag
     */
    String getTag();
}
