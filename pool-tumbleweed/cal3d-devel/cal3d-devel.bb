SUMMARY = "Development files for cal3d"
DESCRIPTION = "This package contains libraries, include files, and other resource \
you can use to develop applications using animated characters with \
cal3d."
LICENSE = "LGPL-2.1-or-later"

PV = "0.120"

RPM_NAME = "cal3d-devel-0.120-5.7.aarch64.rpm"
RPM_HASH = "e433b436c76042b9a81de165ca80c564ed039d66e17d2237850e076c47450869a1a0c4117f55340b53e85bf8dc7f76b876aaa4be215760cdfd74c2a2f36876c5"

RPROVIDES:${PN} += "cal3d-devel \
pkgconfig-cal3d"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcal3d12"

inherit rpm
