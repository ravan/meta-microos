SUMMARY = "Development files for liballegro_main"
DESCRIPTION = "Development files needed to build applications which use liballegro_main."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro_main5_2-devel-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "cff57c6d3f0a873b76162b9330a65fa4f7b0a34222ec83aeabca6f8671c00e6f0ec92bdc20dcab81a952ae1f4ae3e692387b88f1213d583185e08771ceceac25"

RPROVIDES:${PN} += "liballegro-main5-2-devel \
pkgconfig-allegro-main-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-main5-2 \
pkgconfig-allegro-5"

inherit rpm
