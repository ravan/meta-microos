SUMMARY = "Hunspell Plugin for the Qt5 Virtual Keyboard"
DESCRIPTION = "This package provides a hunspell spell checking plugin for the Qt Virtual Keyboard."
LICENSE = "GPL-3.0"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtvirtualkeyboard-hunspell-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "a7b00aea1029eda30aaefd1ea2d3a3d01a62fe0c55342a59c8745b293941a7a8fd237008c6a80972fbe996d58316c3cedfbddfe4ae11fb47014da8e2c4b86b28"

RPROVIDES:${PN} += "libqt5-qtvirtualkeyboard-hunspell \
libqtvirtualkeyboard-hunspell.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5HunspellInputMethod.so.5 \
libQt5Qml.so.5 \
libQt5VirtualKeyboard.so.5 \
libc.so.6 \
libqt5-qtvirtualkeyboard \
libstdc++.so.6"

inherit rpm
