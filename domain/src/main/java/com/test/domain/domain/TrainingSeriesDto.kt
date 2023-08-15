package com.test.domain.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class TrainingSeriesDto(
    val description: String,
    val instructor: InstructorDTO,
    val totalRunTime: String,
    val difficulty: String,
    val intensity: String,
    val classes: List<TrainingClassDTO>,
): Parcelable

@Parcelize
data class TrainingClassDTO(
    val title: String,
    val duration: String,
    val classDescription: String,
    val url:String="",
    val comments:List<CommentDTO>,
    val isWatched:Boolean=false,
): Parcelable

@Parcelize
data class CommentDTO(
    val user: UserDTO,
    val comment: String,
    val time: String
): Parcelable

@Parcelize
data class UserDTO(
    val userName: String,
    val profilePicUrl: String
): Parcelable

@Parcelize
data class InstructorDTO(
    val name: String,
    val profilePicUrl: String,
    val videoUrl: String,
    val about: String
): Parcelable