SUMMARY = "Development files for gsound"
DESCRIPTION = "GSound is a library for playing system sounds. \
It's designed to be used via GObject Introspection, \
and is a wrapper around the libcanberra C library. \
 \
This package provides files needed for developing \
applications with gsound."
LICENSE = "LGPL-2.1-only"

PV = "1.0.3"

RPM_NAME = "gsound-devel-1.0.3-2.21.aarch64.rpm"
RPM_HASH = "bcf023353678a7c6b2a455bdde74222aaa478cc870b2187e6d4f43ccf6ce1ebf9f39667e8c2830899e199fa9cc6e9d6ec18a98279433361640beefbc1362e451"

RPROVIDES:${PN} += "gsound-devel \
pkgconfig-gsound"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgsound0 \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libcanberra \
typelib-1-0-GSound-1-0"

inherit rpm
