SUMMARY = "Development files for liballegro_physfs"
DESCRIPTION = "Development files needed to build applications which use liballegro_physfs."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro_physfs5_2-devel-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "67eeba38f10c02e8d1d69c0376018d87c578e55587e1db1a2a7369a5e1e3ce09c9789e20609a707fe3efeffa57976f39414a4a5b605b27cd197a283dcc21bc70"

RPROVIDES:${PN} += "liballegro-physfs5-2-devel \
pkgconfig-allegro-physfs-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-physfs5-2 \
pkgconfig-allegro-5"

inherit rpm
