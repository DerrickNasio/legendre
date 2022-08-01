fun scaleFromStandardInterval(leftEndpoint: Double, rightEndpoint: Double, nodes: Array<Double>): Array<Double> {
    return Array(nodes.size) { i -> ((1.0 - nodes[i]) * leftEndpoint + (1.0 + nodes[i]) * rightEndpoint) / 2.0 }
}

fun scaleToStandardInterval(leftEndpoint: Double, rightEndpoint: Double, inputs: Array<Double>): Array<Double> {
    return Array(inputs.size) { i -> ((inputs[i] - leftEndpoint) + (inputs[i] - rightEndpoint)) / (rightEndpoint - leftEndpoint) }
}