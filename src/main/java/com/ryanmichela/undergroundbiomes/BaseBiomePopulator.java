//    Copyright (C) 2012  Ryan Michela
//
//    This program is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    This program is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with this program.  If not, see <http://www.gnu.org/licenses/>.

package com.ryanmichela.undergroundbiomes;

import org.bukkit.*;
import org.bukkit.generator.BlockPopulator;

import java.util.Random;

/**
 */
public class BaseBiomePopulator extends BlockPopulator {

    private UBConfig config;

    public BaseBiomePopulator(UBConfig config) {
        this.config = config;
    }

    @Override
    public void populate(World world, Random random, Chunk chunk) {

    }
}
