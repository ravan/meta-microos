SUMMARY = "Library to access to and handle calendar data - QtQuick bindings"
DESCRIPTION = "KCalendarCore is a library to provide access to and handling of calendar data. \
It supports the standard formats iCalendar and vCalendar and the group \
scheduling standard iTIP. This package provides QtQuick bindings for KCalendarCore, \
allowing its use from QML."
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kcalendarcore-imports-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "7c7367c9689a81b5f295ad429f7ef5eeeef3fdc484865aa45c3c94b14fdaf5dbf3f82d9c462589f7e014f2fb6a0a2ab2f8d97c1a2fa283d89f556abb7caa090a"

RPROVIDES:${PN} += "kf6-kcalendarcore-imports \
libkcalendarcoreqml.so \
qt6qmlimport-org.kde.calendarcore \
qt6qmlimport-org.kde.calendarcore.1 \
qt6qmlimport-org.kde.calendarcore.254 \
qt6qmlimport-org.kde.calendarcore.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKF6CalendarCore6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
