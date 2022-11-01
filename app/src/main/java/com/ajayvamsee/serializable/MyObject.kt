package com.ajayvamsee.serializable

import java.io.Serializable

/**
 * Created by Ajay Vamsee on 11/1/2022.
 * Time : 14:14 HRS
 */
class MyObject : Serializable {

    var name = ""
    var id = 0
    var place = " "

    constructor(mName:String , mID:Int, mPlace: String){
        name = mName
        id = mID
        place = mPlace
    }

    constructor()
}