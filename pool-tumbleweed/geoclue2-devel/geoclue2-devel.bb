SUMMARY = "GeoLocation Framework -- Development files"
DESCRIPTION = "GeoClue is a software framework which can be used to enable geospatial \
awareness in applications. GeoClue uses the D-Bus inter-process \
communication mechanism to provide location information"
LICENSE = "GPL-2.0-or-later"

PV = "2.8.2"

RPM_NAME = "geoclue2-devel-2.8.2-1.2.aarch64.rpm"
RPM_HASH = "91b5eaba0fffccfc3577b6e661320ef00d0e7070299836dbea87e451d14cd91101b28c800d163c198dc1a94fd6c27b83caa0beb262665529b85e29c6eedbb1e8"

RPROVIDES:${PN} += "geoclue2-devel \
pkgconfig-geoclue-2.0 \
pkgconfig-libgeoclue-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
geoclue2 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
typelib-1-0-Geoclue-2-0"

inherit rpm
