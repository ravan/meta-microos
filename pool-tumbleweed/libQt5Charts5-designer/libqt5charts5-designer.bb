SUMMARY = "Designer plugin for the Qt 5 Charts library"
DESCRIPTION = "This package provides Qt Designer plugin for development with Qt Charts."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5Charts5-designer-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "2a6d7762e3d105edd3cb59a875adbf1e1ae34835c9f639e002ae99eaf31a7bc0cc048222845e1e1ac098d8adf7caa75cfe3ba726b336c9e14a587be04af363c5"

RPROVIDES:${PN} += "libQt5Charts5-designer \
libqtchartsdesigner.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Charts.so.5 \
libQt5Charts5-devel \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libqt5-qttools \
libstdc++.so.6"

inherit rpm
