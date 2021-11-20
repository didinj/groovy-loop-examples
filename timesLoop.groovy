@groovy.transform.Canonical
class Cars {
    String brand = ""
    String type = ""
    Integer price = 0 
}

List<Cars> cars = [
    [brand: "BMW", type: "750i", price: 300000],
    [brand: "Mercedes Benz", type: "B600", price: 120000],
    [brand: "Volvo", type: "S230", price: 98000]
]

cars.size().times { it ->
    println cars[it]
}