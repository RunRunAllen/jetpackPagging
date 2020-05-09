package com.example.pagging

import androidx.paging.ItemKeyedDataSource

//ItemKeyedDataSource<Key, Value>适用于目标数据的加载依赖特定条目的信息，
//比如需要根据第N项的信息加载第N+1项的数据，传参中需要传入第N项的某些信息时。
class ItemKeyDataSource : ItemKeyedDataSource<Int, Bean>() {
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