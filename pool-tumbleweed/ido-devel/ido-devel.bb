SUMMARY = "Development files for Indicator Display Objects"
DESCRIPTION = "Shared library providing extra GTK+ menu items for display in \
system indicators. \
 \
This package contains the development files for Ido."
LICENSE = "GPL-3.0-only & LGPL-3.0-only & LGPL-2.1-only"

PV = "13.10.0+bzr20161028"

RPM_NAME = "ido-devel-13.10.0+bzr20161028-4.10.aarch64.rpm"
RPM_HASH = "9810a1fc9434aa1ffda6bb293dd2eb41d27a80efb1cd40277c249a56a9e1925b6872384a4c355cdb728edcdac73d7cc0ad7980c7a5616d2084ce558a535b7c42"

RPROVIDES:${PN} += "ido-devel \
pkgconfig-libido3-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libido3-0-1-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-introspection-1.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-Ido3-0-1"

inherit rpm
