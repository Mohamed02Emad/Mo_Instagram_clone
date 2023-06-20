package com.mo_insta.instagramclone.data.models

data class Post(
    val id:Int = 0,
    val username : String = "",
    val userImage : Int =0,
    val caption : String = " ",
    val audio : String = " ",
    val likes : Int = 0,
    val comments:Int = 0,
    val shares : Int = 0,
    val isVideo : Boolean = false,
    val video : Int? = null,
    val image : Int? = null,
    val hours : Int = 2,
)