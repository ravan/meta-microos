SUMMARY = "QML imports for the Qt 5 Charts Library"
DESCRIPTION = "This package contains QML import files."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtcharts-imports-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "e7e48d5e2bda08b6b2c559d7f84e0fc692354ab4376fd37391f8b1a4d0857a45e60cfed45701c91a7e61d14038d17bdb4bc3e9dfb883a6f663efaee1f4c85165"

RPROVIDES:${PN} += "libqt5-qtcharts-imports \
libqtchartsqml2.so \
qt5qmlimport-QtCharts.1 \
qt5qmlimport-QtCharts.2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Charts.so.5 \
libQt5Charts5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
