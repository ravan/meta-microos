SUMMARY = "Development tool to test KParts"
DESCRIPTION = "kpartloader is a debugging tool used to test \
loading of KParts."
LICENSE = "GFDL-1.2-only & GPL-2.0-only & LGPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "kpartloader-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "6ee3e037d668cabeb25d0ee811be2101c00bbd771ac473f05de26b14189dd486f51bce1227c4320cff990acda6355d317cf0266f2aebc2ee6d8a04e3b2881d60"

RPROVIDES:${PN} += "kpartloader"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6Parts.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
