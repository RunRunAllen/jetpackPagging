package com.example.pagging

import androidx.paging.DataSource

class MyDataSourceFactory : DataSource.Factory<Int, Bean>() {
    override fun create(): DataSource<Int, Bean> {
        return PageKeyDataSource(DataRepository())
    }
}