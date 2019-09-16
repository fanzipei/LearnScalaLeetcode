object Solution {
    def distanceBetweenBusStops(distance: Array[Int], start: Int, destination: Int): Int = {
        val totalDis = distance.sum
        if (start > destination) distanceBetweenBusStops(distance, destination, start)
        else{
            val oneWayDis = distance.slice(start, destination).sum
            Math.min(oneWayDis, totalDis - oneWayDis)
        }
    }
}
