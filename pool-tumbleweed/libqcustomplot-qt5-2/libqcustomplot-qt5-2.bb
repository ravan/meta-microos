SUMMARY = "Qt5 widget for plotting and data visualization"
DESCRIPTION = "QCustomPlot is a Qt5 C++ widget for plotting and data visualization. \
This plotting library focuses on making good looking, publication quality 2D \
plots, graphs and charts, as well as offering high performance for realtime \
visualization applications."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "libqcustomplot-qt5-2-2.1.1-5.4.aarch64.rpm"
RPM_HASH = "72cd0f1e6912a15a8568c0d927559c63d041ab3896dc3a251f3330374ad7b513847b5738c56ae212316be91962e5e9e99e0b280bf083a20e61439ecf7891ac75"

RPROVIDES:${PN} += "libqcustomplot-qt5 \
libqcustomplot-qt5-2 \
libqcustomplot-qt5.so.2 \
qcustomplot-qt5 \
qcustomplot-qt5-qt5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
