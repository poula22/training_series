package com.test.data.api.repo

import com.test.domain.data_store.TrainingSeriesDataStore
import com.test.domain.domain.TrainingSeriesDto
import com.test.domain.repo.TrainingSeriesRepository

class TrainingSeriesRepoImp(private val dataStore: TrainingSeriesDataStore):TrainingSeriesRepository {
    override suspend fun getTrainingSeries(): TrainingSeriesDto {
        return dataStore.getTrainingSeries()
    }

}