SUMMARY = "Development files for gxml"
DESCRIPTION = "Development files for gxml."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.4"

RPM_NAME = "gxml-devel-0.20.4-2.7.aarch64.rpm"
RPM_HASH = "41fde8ab0af3cf305db2415316f0b87324aa3a38a6d3913f48ee83d61cce015aecec3e18dde53415e2fcbfa729a992decca373f3a50615cfc5b606f75a6d01d4"

RPROVIDES:${PN} += "gxml-devel \
pkgconfig-gxml-0.20"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgxml-0-20-2-0-2 \
pkgconfig-gee-0.8 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-GXml-0-20"

inherit rpm
