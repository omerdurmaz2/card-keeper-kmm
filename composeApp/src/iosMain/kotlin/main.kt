import androidx.compose.ui.window.ComposeUIViewController
import com.omerd.cardkeeper.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
