SUMMARY = "Development files for the Qt 6 HunspellInputMethod library"
DESCRIPTION = "Development files for the Qt 6 HunspellInputMethod library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-hunspellinputmethod-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "16aeabcb91c64bec8b941973eeb8333a09fb269cdf991ba8c7ebdf91fc6a14aeee1aa064d549005b821f673484bb7f2b4d80ab59bb0ff639addf8350c6a26adf"

RPROVIDES:${PN} += "cmake-Qt6HunspellInputMethod \
cmake-Qt6HunspellInputMethodPrivate \
qt6-hunspellinputmethod-devel \
qt6-hunspellinputmethod-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Gui \
cmake-Qt6VirtualKeyboard \
libQt6HunspellInputMethod6"

inherit rpm
