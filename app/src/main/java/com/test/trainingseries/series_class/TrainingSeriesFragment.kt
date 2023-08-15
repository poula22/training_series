package com.test.trainingseries.series_class

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import coil.load
import coil.size.Scale
import com.test.trainingseries.R
import com.test.trainingseries.databinding.FragmentTrainingSeriesBinding
import com.test.trainingseries.ext_func.loadVideoUrl
import com.test.trainingseries.series_class.rv.TrainingClassesAdapter

class TrainingSeriesFragment : Fragment() {


    private val viewModel: TrainingSeriesViewModel by viewModels()
    private lateinit var viewBinding:FragmentTrainingSeriesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_training_series,container,false)
        viewBinding.imgPoster.load(data = "data:image/jpeg;base64,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")
        val adp=TrainingClassesAdapter()
        viewBinding.rv.adapter=adp
        subscribeToLiveData(adp)
        viewModel.getTrainingSeries()
        return viewBinding.root
    }

    private fun subscribeToLiveData(adp: TrainingClassesAdapter) {
        viewModel.liveData.observe(viewLifecycleOwner){
            it?.let {
                dto->
                viewBinding.txtInstructor.text=dto.instructor.name
                viewBinding.txtInstructorName.text=dto.instructor.name
                viewBinding.txtSeriesDescription.text=dto.description
                viewBinding.imgInstructorVideo.loadVideoUrl(dto.instructor.videoUrl)
                viewBinding.imgInstructorImage.load(dto.instructor.profilePicUrl){
                    scale(Scale.FILL)
                }
                viewBinding.txtInstructorAbout.text=dto.instructor.about
                viewBinding.txtTime.text=dto.totalRunTime
                viewBinding.txtDifficulty.text=dto.difficulty
                viewBinding.txtIntensity.text=dto.intensity
                adp.submitList(dto.classes)

            }
        }
    }


}