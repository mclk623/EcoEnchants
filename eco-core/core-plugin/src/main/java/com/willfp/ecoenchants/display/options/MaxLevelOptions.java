package com.willfp.ecoenchants.display.options;

import com.willfp.eco.core.EcoPlugin;
import com.willfp.eco.core.PluginDependent;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

public class MaxLevelOptions extends PluginDependent<EcoPlugin> {

    /**
     * If enchantments should have a different format above max level.
     */
    @Getter
    private boolean reformatAboveMaxLevel;

    /**
     * The above max level format.
     */
    @Getter
    private String aboveMaxLevelFormat;

    /**
     * Create new description options.
     *
     * @param plugin EcoEnchants.
     */
    public MaxLevelOptions(@NotNull final EcoPlugin plugin) {
        super(plugin);
    }

    /**
     * Update the options.
     */
    public void update() {
        reformatAboveMaxLevel = this.getPlugin().getConfigYml().getBool("lore.above-max-level.reformat");
        aboveMaxLevelFormat = this.getPlugin().getLangYml().getBukkitHandle().getString("above-max-level-color");
    }
}