SUMMARY = "Development files for pcg-c"
DESCRIPTION = "This package contains the development files for pcg-c."
LICENSE = "Apache-2.0 | MIT"

PV = "0.94.2"

RPM_NAME = "libpcg-c0-devel-0.94.2-1.3.aarch64.rpm"
RPM_HASH = "eb861d663afee000e996afc566aac63d79589bba29a1704c2ace96dc93bcdbfd09a1ac6d95a3d6c2442f3bf9af8c86fe45c50560eba31034c2e77374debf7836"

RPROVIDES:${PN} += "libpcg-c0-devel \
pkgconfig-pcg-c"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpcg-c0"

inherit rpm
