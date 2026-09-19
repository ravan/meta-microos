SUMMARY = "Qt6 widget for plotting and data visualization"
DESCRIPTION = "QCustomPlot is a Qt6 C++ widget for plotting and data visualization. \
This plotting library focuses on making good looking, publication quality 2D \
plots, graphs and charts, as well as offering high performance for realtime \
visualization applications."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "libqcustomplot-qt6-2-2.1.1-5.5.aarch64.rpm"
RPM_HASH = "afc7e4ee9a20880a8334cba88d1127acc156a4665bd10264d0e9701e525c5ea06b6e34f02bbaa4d246932ff9e41b2f0c93804dc2dffba4ad494fe0dc4bf18b0a"

RPROVIDES:${PN} += "libqcustomplot-qt6-2 \
libqcustomplot-qt6.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
