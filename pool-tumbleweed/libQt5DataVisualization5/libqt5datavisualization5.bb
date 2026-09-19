SUMMARY = "Qt5 Data Visualization module"
DESCRIPTION = "Qt Data Visualization module provides a way to visualize data in 3D. \
 \
This package contains a shared library for the QtDataVisualization."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5DataVisualization5-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "818bd67483ebf524f4f79213f669b68fbf60ae54d541c979227bd80a089438a04220e98bd93118db59a5084eba895cd81ee158dc56e1f5c3bd45c884b4f6eb78"

RPROVIDES:${PN} += "libQt5DataVisualization.so.5 \
libQt5DataVisualization5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
