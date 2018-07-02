package com.reschedule.model

/**
 * Created by AKatsnelson on 16.06.2018.
 */
data class Teacher(
        var name: String,
        var classes: List<Class>,
        var schedule: Schedule = Schedule(),
        var availableSchedule: AvailableSchedule = AvailableSchedule()
)