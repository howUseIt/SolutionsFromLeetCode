fun rotate(matrix: Array<IntArray>): Unit {
    val matrixSize = matrix.size
    var i = 0
    while (i < matrixSize / 2) {
        var j = i
        while (j < matrixSize - i - 1) {
            val temp = matrix[i][j]
            matrix[i][j] = matrix[matrixSize - 1 - j][i]
            matrix[matrixSize - 1 - j][i] = matrix[matrixSize -1 - i][matrixSize - 1 - j]
            matrix[matrixSize - 1 - i][matrixSize - 1 - j] = matrix[j][matrixSize - 1 - i]
            matrix[j][matrixSize - 1 - i] = temp
            ++j
        }
        ++i
    }
}
