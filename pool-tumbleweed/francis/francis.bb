SUMMARY = "Productivity tool"
DESCRIPTION = "Francis uses the well-known pomodoro technique to help you get more productive."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "francis-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "4d442e406b995b40b56e9580456741e217dc91754cb98f4ef65be0f17e721d0b6907d3933c93c11dcfcf84af7bef6d57e479dae529b3b153f4b612e589dd70e1"

RPROVIDES:${PN} += "francis"

RDEPENDS:${PN} += "kf6-kirigami-imports \
kf6-knotifications-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
