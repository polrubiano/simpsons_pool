package pol.rubiano.simpsonspool.app.errors

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import pol.rubiano.simpsonspool.app.extensions.gone
import pol.rubiano.simpsonspool.app.extensions.visible
import pol.rubiano.simpsonspool.databinding.ErrorViewBinding

class AppErrorView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null,
) : FrameLayout(context, attrs) {

    private val binding = ErrorViewBinding.inflate(LayoutInflater.from(context), this, true)

    init {
        gone()
    }

    fun render(appErrorUI: AppErrorUI) {
        binding.errorImage.setImageResource(appErrorUI.image)
        binding.errorTitle.setText(appErrorUI.title)
        binding.errorMessage.setText(appErrorUI.message)
        visible()
    }

    fun setOnRetryClickListener(listener: () -> Unit) {
        binding.errorButtonRetry.setOnClickListener {
            listener()
        }
    }
}