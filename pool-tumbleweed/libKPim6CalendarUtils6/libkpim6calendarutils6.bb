SUMMARY = "Library with utility functions for handling calendar data"
DESCRIPTION = "This library provides a set of utility functions that help \
applications access and use calendar data via the KCalCore library."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6CalendarUtils6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "6da87f2a2046e87c76e597f481d389613f5869e4918615145eb7c82c7e931ae7160f416893037b3254be3cf1930b081dc560c75c70b956f7acae623b6d45466e"

RPROVIDES:${PN} += "libKPim6CalendarUtils.so.6 \
libKPim6CalendarUtils6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kcalutils \
ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKF6Codecs.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6TextTemplate.so.6 \
libKF6WidgetsAddons.so.6 \
libKPim6IdentityManagementCore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
