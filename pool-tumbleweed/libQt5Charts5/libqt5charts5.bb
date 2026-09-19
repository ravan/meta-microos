SUMMARY = "Qt 5 Charts Library"
DESCRIPTION = "Qt Charts module provides a set of chart components. It uses the Qt \
Graphics View Framework, therefore charts can be integrated to user \
interfaces. Qt Charts can be used as QWidgets, QGraphicsWidget, or \
QML types. Users can create graphs by selecting one of the charts \
themes. \
 \
This package contains a shared library for the QtChart."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5Charts5-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "597e1d3b1f447bcf4e4f6809906fb152aa3b180df56fb950f4f1d828b3cfab32a8dbb013e1ae82be46b4e06e978b2dd91f3e7147e33805a9d8f1b653fcc0976a"

RPROVIDES:${PN} += "libQt5Charts.so.5 \
libQt5Charts5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
