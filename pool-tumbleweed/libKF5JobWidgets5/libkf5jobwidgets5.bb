SUMMARY = "Widgets for showing progress of asynchronous jobs"
DESCRIPTION = "KJobWIdgets provides widgets for showing progress of asynchronous jobs."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5JobWidgets5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "956501bf1363288b8a4152269622a217515e23d3e6afe7733011c9634e1fc0e18fe9f0237b864705ca6b01dd7b565acce139e07d24e648a9babda45352b80963"

RPROVIDES:${PN} += "libKF5JobWidgets.so.5 \
libKF5JobWidgets5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
