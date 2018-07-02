package com.reschedule.model

/**
 * Created by AKatsnelson on 02.07.2018.
 */
class AvailableSchedule(var monday: List<Availability> = ArrayList(),
                        var tuesday: List<Availability> = ArrayList(),
                        var wednesday: List<Availability> = ArrayList(),
                        var thursday: List<Availability> = ArrayList(),
                        var friday: List<Availability> = ArrayList(),
                        var saturday: List<Availability> = ArrayList())