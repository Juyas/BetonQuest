package org.betonquest.betonquest.api.identifier;

import org.betonquest.betonquest.api.QuestException;

public interface ReadableIdentifier extends Identifier {

    String getSection();

    String readRawInstruction() throws QuestException;
}
