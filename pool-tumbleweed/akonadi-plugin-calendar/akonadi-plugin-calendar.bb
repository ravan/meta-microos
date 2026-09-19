SUMMARY = "Akonadi calendar integration - serializer plugin"
DESCRIPTION = "This package provides plugins required by PIM applications to read and write calendar data."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "akonadi-plugin-calendar-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "02cd085233e0cbbc7ab22c3a7579eb6d500ca409d43ddb805e956edabc47001221a495e87c30d0cc513409a704641b02d0f0b3247eb1fd3c26bd37f6d70490ab"

RPROVIDES:${PN} += "akonadi-plugin-calendar \
libakonadicalendarplugin.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKPim6AkonadiCalendar.so.6 \
libKPim6AkonadiCalendar6 \
libKPim6AkonadiCalendarCore6 \
libKPim6AkonadiCore.so.6 \
libKPim6CalendarUtils.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
