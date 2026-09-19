SUMMARY = "Development files for Ayatana Indicator Display Objects"
DESCRIPTION = "Shared library providing extra GTK menu items for display in \
system indicators. \
 \
This package contains the development files for Ido."
LICENSE = "GPL-3.0-only & LGPL-3.0-only & LGPL-2.1-only"

PV = "0.10.4"

RPM_NAME = "ayatana-ido-devel-0.10.4-1.6.aarch64.rpm"
RPM_HASH = "19c1c5490845ce731eaa28884c31eed552bd2ffb9c95902d597566acf6e558aa5ceabd5101d49acc7c91c52d921832316bdd17de6329196e3720dacf45b94bb0"

RPROVIDES:${PN} += "ayatana-ido-devel \
pkgconfig-libayatana-ido3-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libayatana-ido3-0-4-0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-introspection-1.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-AyatanaIdo3-0-4"

inherit rpm
