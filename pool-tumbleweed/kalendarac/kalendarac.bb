SUMMARY = "Reminder daemon client"
DESCRIPTION = "Kalendarac is a reminder daemon client for calendar events."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kalendarac-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "64e07b74f5491d2f2262cd074e3327ce476d1652aa37c9df44dd4626da9e9e94745d1bfefdf7f52855d1d7ccf6f4d2c10f05d767281631d1904a70f5d98f831c"

RPROVIDES:${PN} += "kalendarac"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOGui.so.6 \
libKF6Notifications.so.6 \
libKF6Service.so.6 \
libKPim6AkonadiCalendar.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6IdentityManagementCore.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
