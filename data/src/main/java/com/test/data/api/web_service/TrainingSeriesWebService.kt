package com.test.data.api.web_service

import com.test.data.api.models.TrainingSeries


interface TrainingSeriesWebService {
    suspend fun getTrainingSeries():TrainingSeries
}