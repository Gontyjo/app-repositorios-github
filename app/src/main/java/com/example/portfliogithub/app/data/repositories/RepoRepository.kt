package com.example.portfliogithub.data.repositories

import com.example.portfliogithub.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}