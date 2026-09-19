SUMMARY = "Development files for libversion"
DESCRIPTION = "Libversion is an advanced version string comparison library. It can \
compare versions of software packages, including complex cases like \
1.2-x.3~alpha4. Is is used by the Repology project. \
 \
This package contains the files needed to build with Libversion."
LICENSE = "MIT"

PV = "3.0.4"

RPM_NAME = "libversion-devel-3.0.4-1.4.aarch64.rpm"
RPM_HASH = "d542aacbff4730d6cd5f4ecb0838f50517366b9068470e9b168bf4cbd85e8a4f4171eeb794bdbab5b1a8f63e044388f88dcdfceb28ed2423aa509502592a63e2"

RPROVIDES:${PN} += "cmake-libversion \
libversion-devel \
pkgconfig-libversion"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libversion1"

inherit rpm
