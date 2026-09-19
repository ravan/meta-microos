SUMMARY = "Library to access to and handle calendar data"
DESCRIPTION = "KCalendarCore is a library to provide access to and handling of calendar data. \
It supports the standard formats iCalendar and vCalendar and the group \
scheduling standard iTIP."
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6CalendarCore6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "b3854448a2f7037b579ceea8881b2d8f05224352ac240fce7e2d8e3406110a7ff1213db86dacb5ac51db1e41557868e8ca39df4d16448849a3bc3702c41a5ba8"

RPROVIDES:${PN} += "libKF6CalendarCore.so.6 \
libKF6CalendarCore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libical.so.3 \
libicalss.so.3 \
libicalvcal.so.3 \
libstdc++.so.6"

inherit rpm
