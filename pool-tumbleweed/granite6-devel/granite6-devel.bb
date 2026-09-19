SUMMARY = "Development files for the Granite development library"
DESCRIPTION = "This package contains the development files for libgranite6."
LICENSE = "LGPL-3.0-or-later"

PV = "6.2.0"

RPM_NAME = "granite6-devel-6.2.0-2.8.aarch64.rpm"
RPM_HASH = "d40c86d93fe4af8b35c297985ea2c784a01fde46e49cef5330067d6e15eb4d51f89b3659e84f573b6b7b60376d6d43005da589308692466bbbe452bdfb22d6c0"

RPROVIDES:${PN} += "granite6-devel \
pkgconfig-granite"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgranite6 \
pkgconfig-gee-0.8 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-Granite-1-0"

inherit rpm
