package pol.rubiano.simpsonspool.app.errors

import pol.rubiano.simpsonspool.R

class AppErrorUIFactory {
    fun build(appError: AppError): AppErrorUI {
        return when (appError) {
            is AppError.NoResultsError -> AppErrorUI(
                R.drawable.error_no_results,
                R.string.str_error_no_results_title,
                R.string.str_error_no_results_message
            )
            is AppError.AppDataError -> AppErrorUI(
                R.drawable.error_data,
                R.string.str_error_data_title,
                R.string.str_error_data_message
            )
            else -> AppErrorUI(
                R.drawable.error_unknown,
                R.string.str_error_unknown_title,
                R.string.str_error_unknown_message
            )
        }
    }
}
