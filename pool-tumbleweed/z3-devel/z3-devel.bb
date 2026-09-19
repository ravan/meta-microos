SUMMARY = "Development files for Z3"
DESCRIPTION = "Development files for the Z3 library."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "z3-devel-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "d9ec2d8fc74cbbd2f7fa7117bd97ab419abbd1a4b79166acd9e75bb3c31581eff03b6967e71fa4083408ab15a7f1b08e3ca765f2427c5d7c28a1872b37b2c782"

RPROVIDES:${PN} += "cmake-Z3 \
pkgconfig-z3 \
z3-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libz3-5-1"

inherit rpm
