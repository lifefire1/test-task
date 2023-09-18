def countElements(list) {
    def elementCountMap = [:]

    list.each { element ->
        elementCountMap[element] = elementCountMap.getOrDefault(element, 0) + 1
    }

    return elementCountMap
}

def arr = [1, 3, 4, 5, 1, 5, 4]

def elementCountMap = countElements(arr)

println(elementCountMap)
