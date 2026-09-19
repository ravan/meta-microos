SUMMARY = "Library for resource discovery and announcement over SSDP - Development Files"
DESCRIPTION = "gssdp offers a GObject-based API for handling resource discovery and \
announcement over SSDP."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.6"

RPM_NAME = "libgssdp-devel-1.6.6-1.3.aarch64.rpm"
RPM_HASH = "8c626586e03df2d2c719fc989b6f0460fd246b576b32e49aa36368dcca0da278a6635d5ce47605ee8430e2a70245a73c3884ee1364050f91930b9d048e45643c"

RPROVIDES:${PN} += "libgssdp-devel \
pkgconfig-gssdp-1.6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgssdp-1-6-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libsoup-3.0 \
typelib-1-0-GSSDP-1-0"

inherit rpm
