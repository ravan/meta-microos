SUMMARY = "QML imports for the Qt5 Gamepad module"
DESCRIPTION = "This package contains QML import files for the Qt5 Gamepad module."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtgamepad-imports-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "f5754a46fe06563046b5fb59a13bccc42b37face7aaedf1982139f53ddd52d290d86593fd70a1683fc30c00f321575c0fdbe4b3eb42c63c1b79fa02af4cec2d3"

RPROVIDES:${PN} += "libdeclarative-gamepad.so \
libqt5-qtgamepad-imports \
qt5qmlimport-QtGamepad.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gamepad.so.5 \
libQt5Gamepad5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQtQuick5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
