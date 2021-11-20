def sku = []
for (def (String a, int b) = ['AA', 1000]; b < 1010; a++, b++) {
    sku << "$a$b"
}
println sku