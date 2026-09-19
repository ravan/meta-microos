SUMMARY = "Qt5 State Chart XML examples"
DESCRIPTION = "Examples for libqt5-qtscxml module."
LICENSE = "BSD-3-Clause"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtscxml-examples-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "4067329a23acf2e857df119d0ac48e15120592d86fb51be6a82ecf582a51210fe0b8847b47a0d7aa012096ae77d35558c4daf8361adcef9853874301475d8626"

RPROVIDES:${PN} += "libqt5-qtscxml-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Scxml.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-QtScxml.5"

inherit rpm
