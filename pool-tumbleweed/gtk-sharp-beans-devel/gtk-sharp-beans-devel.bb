SUMMARY = "Extra Gtk# bindings"
DESCRIPTION = "Files for developing programs that use gtk-sharp-beans"
LICENSE = "LGPL-2.1-or-later"

PV = "2.14.1"

RPM_NAME = "gtk-sharp-beans-devel-2.14.1-23.19.aarch64.rpm"
RPM_HASH = "3edb7fd530f48367d42ce7fc958e9bde726e977c8dd30c1c3c2027566dcc6a1f2269b036d256fc43d81ef35662173824e50857d1bd94011f34536f304c9e43c8"

RPROVIDES:${PN} += "gtk-sharp-beans-devel \
pkgconfig-gtk-sharp-beans-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gtk-sharp-beans \
pkgconfig-glib-sharp-2.0 \
pkgconfig-gtk-sharp-2.0"

inherit rpm
