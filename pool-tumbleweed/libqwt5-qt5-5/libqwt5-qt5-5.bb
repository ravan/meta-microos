SUMMARY = "Shared library for Qt Widgets"
DESCRIPTION = "This package contains the shared library to run Technical Applications \
developed with/for qwt."
LICENSE = "SUSE-QWT-1.0"

PV = "5.2.3_qt5+git20181129.2819734"

RPM_NAME = "libqwt5-qt5-5-5.2.3_qt5+git20181129.2819734-4.8.aarch64.rpm"
RPM_HASH = "bbe95874984d230fb34013ea908cf337eb4373884c9df6b30057a4f51a20463fb0c8fbedccf64051459d3ba36395dbce083a69555bce89ac730c945aa72a06b2"

RPROVIDES:${PN} += "libqwt5-qt5-5 \
libqwt5-qt5.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
