SUMMARY = "Development files for libpanel"
DESCRIPTION = "The libpanel-devel package contains libraries and header files for \
developing applications that use libpanel."
LICENSE = "LGPL-3.0-or-later"

PV = "1.10.4"

RPM_NAME = "libpanel-devel-1.10.4-2.3.aarch64.rpm"
RPM_HASH = "51ef4cf53e6a2a8c25f47f53d6e90aa16b382205050dc1a989520a3ef328aa953692054930800f7abbd0bdf7ea57ded7be3a88d7634f4828a215da621e273059"

RPROVIDES:${PN} += "libpanel-devel \
pkgconfig-libpanel-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpanel-1-1 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk4 \
pkgconfig-libadwaita-1 \
typelib-1-0-Panel-1"

inherit rpm
