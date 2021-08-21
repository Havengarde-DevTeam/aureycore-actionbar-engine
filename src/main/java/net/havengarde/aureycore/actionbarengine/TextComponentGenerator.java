package net.havengarde.aureycore.actionbarengine;

import net.md_5.bungee.api.chat.TextComponent;

@FunctionalInterface
public interface TextComponentGenerator {
    TextComponent generate();
}
