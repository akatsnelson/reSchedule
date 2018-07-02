package com.reschedule.model

/**
 * Created by AKatsnelson on 16.06.2018.
 */
data class Subject(var name: String,
                   var significance: Int,
                   var frequency: Int,
                   var numberOfTimesAWeek: Int,
                   var Teachers: List<Teacher> = ArrayList())