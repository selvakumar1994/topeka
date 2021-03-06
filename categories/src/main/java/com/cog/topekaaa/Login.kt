/*
 * Copyright 2018 Google LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cog.topekaaa

import android.app.Activity
import com.cog.topekaaa.helper.Login
import com.cog.topekaaa.helper.getPlayer
import com.cog.topekaaa.helper.storePlayerLocally
import com.cog.topekaaa.model.Avatar.FIVE
import com.cog.topekaaa.model.Player

/**
 * Login without using SmartLock.
 */
object TestLogin : Login {
    override fun loginPlayer(activity: Activity, onSuccess: (Player) -> Unit) {
        onSuccess(activity.getPlayer() ?: Player(firstName = "", lastInitial = "", avatar = FIVE))
    }

    override fun savePlayer(activity: Activity, player: Player, onSuccess: () -> Unit) {
        activity.storePlayerLocally(player)
        onSuccess()
    }
}