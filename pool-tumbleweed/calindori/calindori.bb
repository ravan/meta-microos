SUMMARY = "Kirigami-based calendar application"
DESCRIPTION = "Calindori is a touch friendly calendar application. \
It has been designed for mobile devices but it can also run on desktop environments. \
Users of Calindori are able to check previous and future dates and manage tasks and events."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "calindori-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "c5d41086af82c80d6a69ab467c41ef6b781617e084264d40d24d5e007f24d43c6b6253f36fdf68079314968dcf859b9bbc7fce4834cfa1a0f429548aa6b96c55"

RPROVIDES:${PN} += "calindori"

RDEPENDS:${PN} += "kf6-kirigami-imports \
kf6-kpeople-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6Notifications.so.6 \
libKF6People.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-declarative-imports"

inherit rpm
