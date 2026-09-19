SUMMARY = "KDE PIM Libraries: AkonadiCalendar"
DESCRIPTION = "This library provides calendar integration for Akonadi based applications. \
This library is provides the core integration."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6AkonadiCalendarCore6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "6b313d3f10bb66a7b6d7181f7b2bc28a23ec7763dad6431981650979b1d5235b455d326fe722356957c6117aba76fe3081f3eb42699ad7ba15b6dcedd55c387f"

RPROVIDES:${PN} += "libKPim6AkonadiCalendarCore.so.6 \
libKPim6AkonadiCalendarCore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
akonadi-calendar \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
