SUMMARY = "Development files for libfolks"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts. \
 \
This package provides the development files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.12"

RPM_NAME = "folks-devel-0.15.12-2.4.aarch64.rpm"
RPM_HASH = "21a83b1b199ed00c93affe7718428cda82dc990df89ebb11dc84de2ac3b55ab6bb8693e1b54e2279e46a0445b5b13671d02a29fc34649c0ef858f6c168e89dab"

RPROVIDES:${PN} += "folks-devel \
pkgconfig-folks \
pkgconfig-folks-dummy \
pkgconfig-folks-eds \
pkgconfig-folks-telepathy"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfolks-eds26 \
libfolks-telepathy26 \
libfolks26 \
pkgconfig-folks \
pkgconfig-gee-0.8 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libebook-1.2 \
pkgconfig-libedataserver-1.2 \
pkgconfig-telepathy-glib \
typelib-1-0-Folks-0-7 \
typelib-1-0-FolksEds-0-7 \
typelib-1-0-FolksTelepathy-0-7"

inherit rpm
