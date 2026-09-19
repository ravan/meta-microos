SUMMARY = "Development files for gck, a GObject library to access PKCS#11 modules"
DESCRIPTION = "GCK is a library for accessing PKCS#11 modules like smart cards, in a \
(G)object oriented way."
LICENSE = "LGPL-2.1-or-later"

PV = "4.4.0.1"

RPM_NAME = "libgck-devel-4.4.0.1-3.3.aarch64.rpm"
RPM_HASH = "ca1134b90481330d3803444f3119ba203952a2a0056085d8b11f1b76dc08456bce515135e22c09768eb38b70ca885575cdffc211672850104346386c43a528e5"

RPROVIDES:${PN} += "libgck-devel \
pkgconfig-gck-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgck-2-2 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-p11-kit-1 \
typelib-1-0-Gck-2"

inherit rpm
