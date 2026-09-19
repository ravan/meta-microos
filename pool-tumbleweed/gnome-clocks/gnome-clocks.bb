SUMMARY = "Clock application designed for GNOME 3"
DESCRIPTION = "A nice simple app to show the time, date, and alarms."
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "gnome-clocks-50.0-1.3.aarch64.rpm"
RPM_HASH = "f54a2996c8455bb6db55df5d4e4da1e3571dcd88953f8257e06d1bbbb3ce6486efa7863283809178caa8677953e17d7b226dea74685104879f8945106fd32c21"

RPROVIDES:${PN} += "gnome-clocks"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgeoclue-2.so.0 \
libgeocode-glib-2.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-4.so.2 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgweather-4.so.0 \
libicui18n.so.78 \
libicuuc.so.78 \
libm.so.6"

inherit rpm
