package com.test.domain.data_store

import com.test.domain.domain.TrainingSeriesDto

interface TrainingSeriesDataStore {
    suspend fun getTrainingSeries():TrainingSeriesDto
}