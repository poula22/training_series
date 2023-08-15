package com.test.data.api.data_store

import com.test.data.api.convertTo
import com.test.data.api.web_service.TrainingSeriesWebService
import com.test.domain.data_store.TrainingSeriesDataStore
import com.test.domain.domain.TrainingSeriesDto

class TrainingSeriesDataStoreImp(private val service: TrainingSeriesWebService):TrainingSeriesDataStore{
    override suspend fun getTrainingSeries(): TrainingSeriesDto {
        return service.getTrainingSeries().convertTo(TrainingSeriesDto::class.java)
    }
}