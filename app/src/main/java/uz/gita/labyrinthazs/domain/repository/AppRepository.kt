package uz.gita.labyrinthazs.domain.repository

import kotlinx.coroutines.flow.Flow
import uz.gita.labyrinthazs.data.model.AppLevel

interface AppRepository {
    fun getMatrix(level: AppLevel): Flow<List<List<Int>>>
}