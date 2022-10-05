class DelegatingCollection2<T>(innerList: Collection<T> = ArrayList<T>())
    : Collection <T> by innerList { }