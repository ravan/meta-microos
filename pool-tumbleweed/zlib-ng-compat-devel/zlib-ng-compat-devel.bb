SUMMARY = "Development files for zlib-ng-compat"
DESCRIPTION = "The zlib-ng-compat-devel package contains header files for \
developing application that use zlib-ng-compat."
LICENSE = "Zlib"

PV = "2.3.3"

RPM_NAME = "zlib-ng-compat-devel-2.3.3-2.3.aarch64.rpm"
RPM_HASH = "3ab826008fafe882f452929231c71576ecc4c0a7449124c78b87f0f16fab2b65fd2607ea0139f909b735cf114cdb915dc778718c9c645db134100175caa0b480"

RPROVIDES:${PN} += "cmake-zlib \
pkgconfig-zlib \
zlib-devel \
zlib-ng-compat-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libz-ng-compat1"

inherit rpm
