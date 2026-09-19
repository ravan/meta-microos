SUMMARY = "Development files for kcalendarcore, a library to handle calendar data"
DESCRIPTION = "KCalendarCore is a library to provide access to and handling of calendar data. \
It supports the standard formats iCalendar and vCalendar and the group \
scheduling standard iTIP. This package contains the headers necessary to \
develop applications making use of KCalendarCore."
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kcalendarcore-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "f4c6e49435616af8ab794514377238e8aa93ca6a21dd618b90aa64b55a15b3153805876bdb22c602bfcbcfa4730a3c4d3f050e85125b3a66dafe0f325a7f4c95"

RPROVIDES:${PN} += "cmake-KF6CalendarCore \
kf6-kcalendarcore-devel \
pkgconfig-KF6CalendarCore"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-LibIcal \
libKF6CalendarCore6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
