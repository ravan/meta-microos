SUMMARY = "Qt5 xmlpatterns examples"
DESCRIPTION = "Examples for the libqt5-qtxmlpatterns module."
LICENSE = "BSD-3-Clause"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtxmlpatterns-examples-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "220a96efd74c9d989bb3b8a10046719d2a1788b1dfc2785271c294d9841ebbbcd943fd63116b2e9ccaa04443fdd097dea1edb353496e9e3bf6e661d8431b6ba3"

RPROVIDES:${PN} += "libqt5-qtxmlpatterns-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5XmlPatterns.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
