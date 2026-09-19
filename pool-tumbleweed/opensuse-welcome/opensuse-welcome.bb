SUMMARY = "Welcome utility for openSUSE"
DESCRIPTION = "A welcome utility built to welcome new users to openSUSE."
LICENSE = "GPL-3.0-or-later"

PV = "50.0.openSUSE+git20260413.334ffbd"

RPM_NAME = "opensuse-welcome-50.0.openSUSE+git20260413.334ffbd-1.3.aarch64.rpm"
RPM_HASH = "d9a04dd716d7dacd749ef5d462ce7d8b400886e5569df07e8a2e2d6fab7ec04767ad55f4678b71a1ad6db46087c2383b4464e0bb957e607dc5bc9a586e2f419a"

RPROVIDES:${PN} += "opensuse-welcome"

RDEPENDS:${PN} += "gnome-tour-data \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0"

inherit rpm
