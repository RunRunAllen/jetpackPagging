package com.example.pagging

import androidx.paging.ItemKeyedDataSource

class ItemKeyDataSource:ItemKeyedDataSource<Int, Bean> (){
    override fun loadInitial(params: LoadInitialParams<Int>, callback: LoadInitialCallback<Bean>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Bean>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Bean>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getKey(item: Bean): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}