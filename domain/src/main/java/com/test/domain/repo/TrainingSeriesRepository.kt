package com.test.domain.repo

import com.test.domain.domain.TrainingSeriesDto

interface TrainingSeriesRepository {
    suspend fun getTrainingSeries():TrainingSeriesDto
}