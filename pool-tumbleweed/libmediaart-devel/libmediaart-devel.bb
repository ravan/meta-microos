SUMMARY = "Development files for the Media Art extraction library"
DESCRIPTION = "The libmediaart library is the foundation for media art caching, \
extraction and lookup for applications on the desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.7"

RPM_NAME = "libmediaart-devel-1.9.7-1.8.aarch64.rpm"
RPM_HASH = "dab207291fd0ae99412d19342c8a097e3dbf732a07925c6fbc3b63f9e333251f6562f1414b4b9e5bd746a71b636a52882e76558813f1d62d73462ceeedb589b1"

RPROVIDES:${PN} += "libmediaart-devel \
pkgconfig-libmediaart-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmediaart-2-0-0 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
typelib-1-0-MediaArt-2-0"

inherit rpm
