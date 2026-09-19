SUMMARY = "Development tools for ibus"
DESCRIPTION = "The ibus-devel package contains the header files and developer \
docs for ibus."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.34"

RPM_NAME = "ibus-devel-1.5.34-2.1.aarch64.rpm"
RPM_HASH = "078d37df7df07d82d120bcd81f4926da84743957691a4172b0c038adfb21b8136ff501ccc7b5badd194e4f4f58aa8e2b256834822666c5d5b01adcc519505a27"

RPROVIDES:${PN} += "ibus-devel \
pkgconfig-ibus-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1-devel \
glib2-devel \
gtk-doc \
ibus \
libibus-1-0-5 \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
typelib-1-0-IBus-1-0"

inherit rpm
