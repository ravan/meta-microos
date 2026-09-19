SUMMARY = "Personal Time Tracker"
DESCRIPTION = "KTimeTracker tracks time spent on various tasks."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.0"

RPM_NAME = "ktimetracker-6.0.0-1.5.aarch64.rpm"
RPM_HASH = "061399a6a6c9d30535ddd0033b627fc28cb3ed4a36cc3ad68719e556aa12afc6dee80d5bcefd3e488fe81745c5bb7a7a60413c8024e60380bf00e7e829a7c726"

RPROVIDES:${PN} += "ktimetracker"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6IdleTime.so.6 \
libKF6KCMUtils.so.6 \
libKF6KIOCore.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
