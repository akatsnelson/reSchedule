package com.reschedule.model

/**
 * Created by AKatsnelson on 16.06.2018.
 */
data class Schedule(var monday: List<Subject> = ArrayList(),
                    var tuesday: List<Subject> = ArrayList(),
                    var wednesday: List<Subject> = ArrayList(),
                    var thursday: List<Subject> = ArrayList(),
                    var friday: List<Subject> = ArrayList(),
                    var saturday: List<Subject> = ArrayList())