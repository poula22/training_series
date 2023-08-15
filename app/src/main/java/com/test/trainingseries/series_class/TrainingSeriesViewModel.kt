package com.test.trainingseries.series_class

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.test.data.api.data_store.TrainingSeriesDataStoreImp
import com.test.data.api.repo.TrainingSeriesRepoImp
import com.test.data.api.web_service.TrainingSeriesWebService
import com.test.data.api.web_service.TrainingSeriesWebServiceImp
import com.test.domain.data_store.TrainingSeriesDataStore
import com.test.domain.domain.TrainingSeriesDto
import com.test.domain.repo.TrainingSeriesRepository
import kotlinx.coroutines.launch

class TrainingSeriesViewModel : ViewModel() {
    val trainingSeriesWebService:TrainingSeriesWebService=TrainingSeriesWebServiceImp()
    val trainingSeriesDataStore:TrainingSeriesDataStore=TrainingSeriesDataStoreImp(trainingSeriesWebService)
    val trainingSeriesRepository:TrainingSeriesRepository=TrainingSeriesRepoImp(trainingSeriesDataStore)

    val liveData=MutableLiveData<TrainingSeriesDto?>()


    fun getTrainingSeries(){
        viewModelScope.launch {
            liveData.value=trainingSeriesRepository.getTrainingSeries()
        }
    }
}