SUMMARY = "Development files for hasl"
DESCRIPTION = "Development files for hasl."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.0"

RPM_NAME = "hasl-devel-0.5.0-1.4.aarch64.rpm"
RPM_HASH = "c86fefec66cb023e2deb8b153dec571f910d723ed9332f2dc51880c2924efac5c1b84514a4185d1ea1228bca4ff2c2a5c42e9e51a1f1d5125553f71a3431a261"

RPROVIDES:${PN} += "hasl-devel \
pkgconfig-hasl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhasl0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libidn \
typelib-1-0-Hasl-1-0"

inherit rpm
