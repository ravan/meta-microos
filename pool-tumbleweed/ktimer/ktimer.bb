SUMMARY = "Countdown Launcher"
DESCRIPTION = "Countdown launching tool by KDE"
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "ktimer-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "5099094c5549e41fd4eec1a8fd50a117598515b5a6c36d31c03c6ef245d610f04140f6def8f91581ae4edab32d66f89141e5af4eb6065144c20957afc1c44790"

RPROVIDES:${PN} += "ktimer \
ktimer5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOWidgets.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
