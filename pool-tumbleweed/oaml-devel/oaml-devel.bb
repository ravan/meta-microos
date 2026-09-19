SUMMARY = "Development files for OAML, the Open Adaptive Music library"
DESCRIPTION = "OAML is a library for implementing adaptive music in games. \
This package contains the development files for oaml."
LICENSE = "Apache-2.0"

PV = "1.3.4"

RPM_NAME = "oaml-devel-1.3.4-1.25.aarch64.rpm"
RPM_HASH = "2f485571906183f5765cc573a23790a3468b2700ee1effc0cce15769de5c4e1416d84b80844f1926e423341138d8c15cf823857f8d016d13c795d4e99f42d618"

RPROVIDES:${PN} += "oaml-devel \
pkgconfig-oaml"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liboaml1 \
pkgconfig-ogg \
pkgconfig-vorbis"

inherit rpm
