SUMMARY = "Header files for the Osmocom E1 daemon protocol library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-e1d."
LICENSE = "LGPL-3.0-or-later"

PV = "0.8.0"

RPM_NAME = "osmo-e1d-devel-0.8.0-1.1.aarch64.rpm"
RPM_HASH = "9f9a9209b4c6c2e2c91ceb4ccb113d55a9f7d785686294086a2c52982b4226a556c6e86bcd58cc1f92510ec049abbc76c3a9bf2f4193267520307807000bf3d7"

RPROVIDES:${PN} += "libosmo-e1d-devel \
osmo-e1d-devel \
pkgconfig-libosmo-e1d \
pkgconfig-libosmo-octoi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmo-e1d3 \
libosmo-octoi3 \
pkgconfig-libosmocore"

inherit rpm
