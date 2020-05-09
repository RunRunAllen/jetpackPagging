package com.example.pagging

import androidx.paging.PositionalDataSource
//PositionalDataSource<T>适用于 目标数据总数固定，通过特定的位置加载数据，这里Key是Integer类型的位置信息
//，并且被内置固定在了PositionalDataSource<T>类中，T即数据的类型
class PositialDataSource: PositionalDataSource<Bean>() {
    override fun loadRange(params: LoadRangeParams, callback: LoadRangeCallback<Bean>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadInitial(params: LoadInitialParams, callback: LoadInitialCallback<Bean>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}