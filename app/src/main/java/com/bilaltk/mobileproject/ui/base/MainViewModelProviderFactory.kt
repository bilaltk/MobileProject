package com.bilaltk.mobileproject.ui.base

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bilaltk.mobileproject.data.repository.MainRepository
import com.bilaltk.mobileproject.ui.vm.MainViewModel

class MainViewModelProviderFactory(val app: Application, private val mainRepository: MainRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(app, mainRepository) as T
    }
}