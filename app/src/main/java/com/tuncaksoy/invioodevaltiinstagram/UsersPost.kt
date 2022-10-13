package com.tuncaksoy.invioodevaltiinstagram

data class UsersPost(
    var userName: String,
    var userImageName: String,
    var postImageName: String,
    var postLikeNumber: Int,
    var postCommentNumber: Int,
    var postExplanation: String
) {
}