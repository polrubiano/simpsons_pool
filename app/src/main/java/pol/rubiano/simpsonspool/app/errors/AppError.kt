package pol.rubiano.simpsonspool.app.errors

sealed class AppError : Throwable() {

    data object AppConnectionError : AppError() {
        private fun readResolve(): Any = AppConnectionError
    }

    data object AppInternetError : AppError() {
        private fun readResolve(): Any = AppInternetError
    }

    data object AppServerError : AppError() {
        private fun readResolve(): Any = AppServerError
    }

    data object AppDataError : AppError() {
        private fun readResolve(): Any = AppDataError
    }

    data object NoResultsError : AppError() {
        private fun readResolve(): Any = NoResultsError
    }

    data object AppUnknowError : AppError() {
        private fun readResolve(): Any = AppUnknowError
    }
}