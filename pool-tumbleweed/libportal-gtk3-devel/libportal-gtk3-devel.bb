SUMMARY = "Headers for the libportal GTK3 integration library"
DESCRIPTION = "The libportal-gtk3-devel package contains libraries, build data, and \
header files for developing applications that use libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "libportal-gtk3-devel-0.10.0-1.2.aarch64.rpm"
RPM_HASH = "56ab28e75972aa4e0b311dcfc2a04c36e0f4d3521c5f90a1686c8c978d1e39a3a8023e5e03056d5f7397dd6ccd6b09815e5e537c0e5788c567b87d8149abc144"

RPROVIDES:${PN} += "libportal-gtk3-devel \
pkgconfig-libportal-gtk3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libportal-gtk3-1 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libportal \
typelib-1-0-XdpGtk3-1-0"

inherit rpm
