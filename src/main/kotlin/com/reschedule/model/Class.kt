package com.reschedule.model

/**
 * Created by AKatsnelson on 16.06.2018.
 */
data class Class(var classNumber: Int,
                 var indexOfParallel: String,
                 var subjects: List<Subject> = ArrayList())