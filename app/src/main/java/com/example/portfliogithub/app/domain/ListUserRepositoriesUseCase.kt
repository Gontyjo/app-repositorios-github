package com.example.portfliogithub.domain

import com.example.portfliogithub.core.UseCase
import com.example.portfliogithub.data.model.Repo
import com.example.portfliogithub.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}