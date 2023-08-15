package com.test.data.api.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class TrainingSeries(
    @field:SerializedName("description")
    val description: String,
    @field:SerializedName("instructor")
    val instructor: Instructor,
    @field:SerializedName("totalRunTime")
    val totalRunTime: String,
    @field:SerializedName("difficulty")
    val difficulty: String,
    @field:SerializedName("intensity")
    val intensity: String,
    @field:SerializedName("classes")
    val classes: List<TrainingClass>,
): Parcelable

@Parcelize
data class TrainingClass(
    @field:SerializedName("title")
    val title: String,
    @field:SerializedName("duration")
    val duration: String,
    @field:SerializedName("classDescription")
    val classDescription: String,
    @field:SerializedName("url")
    val url:String="",
    @field:SerializedName("comments")
    val comments:List<Comment>,
    @field:SerializedName("isWatched")
    val isWatched:Boolean=false,
): Parcelable

@Parcelize
data class Comment(
    @field:SerializedName("user")
    val user: User,
    @field:SerializedName("comment")
    val comment: String,
    @field:SerializedName("time")
    val time: String
): Parcelable

@Parcelize
data class User(
    @field:SerializedName("userName")
    val userName: String,
    @field:SerializedName("profilePicUrl")
    val profilePicUrl: String
): Parcelable

@Parcelize
data class Instructor(
    @field:SerializedName("name")
    val name: String,
    @field:SerializedName("profilePicUrl")
    val profilePicUrl: String,
    @field:SerializedName("videoUrl")
    val videoUrl: String,
    @field:SerializedName("about")
    val about: String
): Parcelable