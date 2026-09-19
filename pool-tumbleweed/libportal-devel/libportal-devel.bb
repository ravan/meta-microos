SUMMARY = "Headers for libportal, a GIO async API for Flatpak portals"
DESCRIPTION = "The libportal-devel package contains libraries, build data, and \
header files for developing applications that use libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "libportal-devel-0.10.0-1.2.aarch64.rpm"
RPM_HASH = "d265137610c17079df07d47088da5f806297b1196f46d1393baafa9eec0f3f2674a01bf3322d7c9456c2725cdf50470d176b4794848bb981c7d1b7afd48dcecc"

RPROVIDES:${PN} += "libportal-devel \
pkgconfig-libportal"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libportal1 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
typelib-1-0-Xdp-1-0"

inherit rpm
