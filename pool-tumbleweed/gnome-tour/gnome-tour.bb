SUMMARY = "GNOME Tour & Greeter"
DESCRIPTION = "A guided tour and greeter for GNOME."
LICENSE = "GPL-3.0-or-later"

PV = "50.0.openSUSE+git20260413.334ffbd"

RPM_NAME = "gnome-tour-50.0.openSUSE+git20260413.334ffbd-1.3.aarch64.rpm"
RPM_HASH = "2d41064bd4c474e9fe94db83e04dfd5206b527a3baf8051c9b69eca8704163416c93c5bbd3ca03a90713798c86875f96d27e2ad96e12cdf53eed3e5eb20c31d5"

RPROVIDES:${PN} += "gnome-tour"

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
