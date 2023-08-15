package com.test.data.api.web_service

import com.test.data.api.models.Mock
import com.test.data.api.models.TrainingSeries

class TrainingSeriesWebServiceImp:TrainingSeriesWebService {
    override suspend fun getTrainingSeries(): TrainingSeries {
        return Mock.data
    }

}