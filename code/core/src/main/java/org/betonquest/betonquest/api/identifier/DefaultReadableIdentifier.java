package org.betonquest.betonquest.api.identifier;

import org.betonquest.betonquest.api.QuestException;
import org.betonquest.betonquest.api.bukkit.config.custom.multi.MultiConfiguration;
import org.betonquest.betonquest.api.config.quest.QuestPackage;

public abstract class DefaultReadableIdentifier extends DefaultIdentifier implements ReadableIdentifier {

    private final String section;

    protected DefaultReadableIdentifier(final QuestPackage pack, final String identifier, final String section) {
        super(pack, identifier);
        this.section = section;
    }

    @Override
    public String getSection() {
        return section;
    }

    @Override
    public String readRawInstruction() throws QuestException {
        final MultiConfiguration config = getPackage().getConfig();
        final String rawInstruction = config.getString(section + config.options().pathSeparator() + get());
        if (rawInstruction == null) {
            throw new QuestException("'%s' is not defined in section '%s'".formatted(getFull(), section));
        }
        return rawInstruction;
    }
}
