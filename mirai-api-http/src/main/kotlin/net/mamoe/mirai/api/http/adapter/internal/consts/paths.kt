package net.mamoe.mirai.api.http.adapter.internal.consts

/**
 * 路由路径
 */
object Paths {

    // about
    const val about = "about"

    // event
    const val newFriend = "resp_newFriendRequestEvent"
    const val memberJoin = "resp_memberJoinRequestEvent"
    const val botInvited = "resp_botInvitedJoinGroupRequestEvent"

    // group
    const val muteAll = "muteAll"
    const val unmuteAll = "unmuteAll"
    const val mute = "mute"
    const val unmute = "unmute"
    const val kick = "kick"
    const val quit = "quit"
    const val groupConfig = "groupConfig"
    const val memberInfo = "memberInfo"

    // base info
    const val friendList = "friendList"
    const val groupList = "groupList"
    const val memberList = "memberList"
    const val botProfile = "botProfile"
    const val friendProfile = "friendProfile"
    const val memberProfile = "memberProfile"

    // message
    const val messageFromId = "messageFromId"
    const val sendFriendMessage = "sendFriendMessage"
    const val sendGroupMessage = "sendGroupMessage"
    const val sendTempMessage = "sendTempMessage"
    const val sendImageMessage = "sendImageMessage"
    const val uploadImage = "uploadImage"
    const val uploadVoice = "uploadVoice"
    const val recall = "recall"

    fun httpPath(s: String): String {
        val t = s.replace("_", "/")
        if (t.startsWith('/')) {
            return t
        }
        return "/$t"
    }
}
