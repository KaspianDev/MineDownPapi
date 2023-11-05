package com.github.kaspiandev.minedownpapi;


import de.themoep.minedown.MineDown;
import me.clip.placeholderapi.PlaceholderAPI;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import net.md_5.bungee.api.chat.BaseComponent;
import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;

public final class MineDownPapi extends PlaceholderExpansion {

    @Override
    public @NotNull String getIdentifier() {
        return "minedownpapi";
    }

    @Override
    public @NotNull String getAuthor() {
        return "Kaspian";
    }

    @Override
    public @NotNull String getVersion() {
        return "1";
    }

    @Override
    public @NotNull String onRequest(OfflinePlayer player, @NotNull String params) {
        String parsedString = PlaceholderAPI.setBracketPlaceholders(player, params);
        return BaseComponent.toLegacyText(new MineDown(parsedString).toComponent());
    }

}
