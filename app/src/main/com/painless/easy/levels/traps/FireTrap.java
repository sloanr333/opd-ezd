/*
 * Easy Dungeon
 * Copyright (C) 2012-2014  Oleg Dolya
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.painless.easy.levels.traps;

import com.painless.easy.actors.Char;
import com.painless.easy.actors.blobs.Blob;
import com.painless.easy.actors.blobs.Fire;
import com.painless.easy.effects.CellEmitter;
import com.painless.easy.effects.particles.FlameParticle;
import com.painless.easy.scenes.GameScene;

public class FireTrap {

	// 0xFF7708
	
	public static void trigger( int pos, Char ch ) {
		
		GameScene.add( Blob.seed( pos, 2, Fire.class ) );
		CellEmitter.get( pos ).burst( FlameParticle.FACTORY, 5 );
		
	}
}
