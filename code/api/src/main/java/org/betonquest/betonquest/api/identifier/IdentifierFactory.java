package org.betonquest.betonquest.api.identifier;

import org.betonquest.betonquest.api.QuestException;
import org.betonquest.betonquest.api.config.quest.QuestPackage;
import org.jetbrains.annotations.Nullable;

public interface IdentifierFactory<I extends Identifier> {

    I parseIdentifier(@Nullable QuestPackage source, String input) throws QuestException;
}
