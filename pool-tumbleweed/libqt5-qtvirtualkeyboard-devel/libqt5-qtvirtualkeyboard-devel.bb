SUMMARY = "Qt Development Kit"
DESCRIPTION = "You need this package if you want to compile programs or plugins with \
Qt Virtual Keyboard."
LICENSE = "GPL-3.0"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtvirtualkeyboard-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "a67e8005eedb947e88d01194a0f98c0cf18282abe28a4102283dd4b5543f71f90cc0ae16d8d38f0e243d72375c2f975ff7c3adf4926a24632058dfefc65374a0"

RPROVIDES:${PN} += "cmake-Qt5VirtualKeyboard \
libqt5-qtvirtualkeyboard-devel \
pkgconfig-Qt5VirtualKeyboard"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqt5-qtvirtualkeyboard \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Qml \
pkgconfig-Qt5Quick"

inherit rpm
