package com.example.gymsaround.model



data class Gym (val id:Int, val name :String, val address:String, var isFavorite:Boolean = false)

val gyms = listOf(
    Gym(1, "Gold's Gym", "100 California St, San Francisco, CA"),
    Gym(2, "Planet Fitness", "123 Main St, Los Angeles, CA"),
    Gym(3, "Equinox", "45 Broadway, New York, NY"),
    Gym(4, "LA Fitness", "2000 Ocean Ave, Miami, FL"),
    Gym(5, "24 Hour Fitness", "300 Market St, Denver, CO"),
    Gym(6, "Crunch Fitness", "400 High St, Boston, MA"),
    Gym(7, "Anytime Fitness", "500 King St, Dallas, TX"),
    Gym(8, "OrangeTheory Fitness", "600 Elm St, Chicago, IL"),
    Gym(9, "Lifetime Fitness", "700 Pine St, Seattle, WA"),
    Gym(10, "Snap Fitness", "800 Maple St, Austin, TX"),
    Gym(11, "Retro Fitness", "900 Cedar St, Orlando, FL"),
    Gym(12, "Blink Fitness", "1000 Walnut St, Philadelphia, PA"),
    Gym(13, "YMCA", "1100 Oak St, San Diego, CA"),
    Gym(14, "CrossFit", "1200 Birch St, Portland, OR"),
    Gym(15, "Barry's Bootcamp", "1300 Spruce St, Nashville, TN"),
    Gym(16, "F45 Training", "1400 Redwood St, Atlanta, GA"),
    Gym(17, "CorePower Yoga", "1500 Cypress St, Minneapolis, MN"),
    Gym(18, "SoulCycle", "1600 Ash St, Washington, D.C."),
    Gym(19, "Pure Barre", "1700 Willow St, Phoenix, AZ"),
    Gym(20, "The Bar Method", "1800 Aspen St, Las Vegas, NV")
)
