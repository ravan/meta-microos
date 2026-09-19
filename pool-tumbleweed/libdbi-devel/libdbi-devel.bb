SUMMARY = "Development files for libdbi (Database Independent Abstraction Layer for C)"
DESCRIPTION = "The libdbi-devel package contains the header files needed to develop \
applications with libdbi."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.0.g33"

RPM_NAME = "libdbi-devel-0.9.0.g33-4.20.aarch64.rpm"
RPM_HASH = "186c835194dabe29ff6abaac6155f705c94857ddad95d7df87039cbfc9e94e077f9d987de81eda75ec1f0339d9ee6f85613c402472d30b39deaf8dc58fda506c"

RPROVIDES:${PN} += "libdbi-devel \
pkgconfig-dbi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdbi3"

inherit rpm
