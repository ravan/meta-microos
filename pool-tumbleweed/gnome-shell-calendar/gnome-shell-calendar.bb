SUMMARY = "Evolution Calendar support for GNOME Shell"
DESCRIPTION = "This package adds support for Evolution Calendar, such as appointments \
into GNOME Shell calendar."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "50.4"

RPM_NAME = "gnome-shell-calendar-50.4-1.1.aarch64.rpm"
RPM_HASH = "d5baf570fcaa7c6a82dc7dee0348d0758cf9774159d554b8242dd2709c2ec14c62e5e40e06307abfeeac0ec991288d5df0f9b41344059aa483e26030da3af04c"

RPROVIDES:${PN} += "gnome-shell-calendar"

RDEPENDS:${PN} += "evolution-data-server \
gnome-shell \
ld-linux-aarch64.so.1 \
libc.so.6 \
libecal-2.0.so.3 \
libedataserver-1.2.so.27 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libical-glib.so.3"

inherit rpm
