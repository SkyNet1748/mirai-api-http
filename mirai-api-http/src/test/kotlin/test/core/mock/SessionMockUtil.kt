/*
 * Copyright 2020 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/master/LICENSE
 */

package test.core.mock

import net.mamoe.mirai.api.http.adapter.internal.dto.AuthedDTO
import kotlin.reflect.jvm.javaField

internal fun <T: AuthedDTO> T.withSession(sessionKey: String): T {
    this::sessionKey.javaField?.apply {
        isAccessible = true
        set(this@withSession, sessionKey)
    }
    return this
}
