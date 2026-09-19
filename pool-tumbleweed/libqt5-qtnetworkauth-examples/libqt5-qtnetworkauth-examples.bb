SUMMARY = "Qt5 networkauth examples"
DESCRIPTION = "Examples for libqt5-qtnetworkauth module."
LICENSE = "BSD-3-Clause"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtnetworkauth-examples-5.15.19+kde0-1.3.aarch64.rpm"
RPM_HASH = "717350ff327a069702096f945921403f90ec22bea9cbcffda1635702ec284aa4dcb4c7691ddbd5d2177db8db710e77e173475808a8a510cea0548d992a9cc1ef"

RPROVIDES:${PN} += "libqt5-qtnetworkauth-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5NetworkAuth.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
