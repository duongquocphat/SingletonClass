package com.shakutara.singletonclassdemo

class SingletonClass private constructor() {
    companion object {
        private var singletonClass: SingletonClass? = null

        fun getInstance(): SingletonClass {
            if (singletonClass == null)
                singletonClass = SingletonClass()
            return singletonClass as SingletonClass
        }
    }
}