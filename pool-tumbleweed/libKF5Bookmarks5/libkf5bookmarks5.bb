SUMMARY = "Framework for manipulating bookmarks in XBEL format"
DESCRIPTION = "This is a framework for accessing and manipulating bookmarks using \
the XBEL format."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5Bookmarks5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "363f6fa0ce8ae10acf42a218d0e9ff696bf853627d72abd97e2e44e0b0466f03c9ce2c6184b9cecc301bffd2945da49df406c8b7a3d97e8b81eaa199d1d953f9"

RPROVIDES:${PN} += "libKF5Bookmarks.so.5 \
libKF5Bookmarks5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
