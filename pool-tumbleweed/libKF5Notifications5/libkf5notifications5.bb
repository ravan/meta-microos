SUMMARY = "KDE Desktop notifications"
DESCRIPTION = "KNotification is used to notify the user of an event. It covers feedback and \
persistent events."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5Notifications5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "8e17192b97f92ac04dc8f3bca3db91303658fc57f1d35a253037965900b7c8b84584daf8bbeebe1536b06a4aee8da9e4c856766647363b3c32a36c1654b0d9b2"

RPROVIDES:${PN} += "libKF5Notifications.so.5 \
libKF5Notifications5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libcanberra.so.0 \
libdbusmenu-qt5.so.2 \
libstdc++.so.6"

inherit rpm
