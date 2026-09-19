SUMMARY = "Development files for the Blake2 library"
DESCRIPTION = "Development files for the Blake2 library \
 \
This package contains the development files."
LICENSE = "CC0-1.0"

PV = "0.98.1"

RPM_NAME = "libb2-devel-0.98.1-2.4.aarch64.rpm"
RPM_HASH = "3c732d4f7fd259914348e11ed087818c35e85de41c12fce83f9623fca7d99e0d6fb721736a3d851d9578f03e8560b3ade167bc9f34308dc261c780dfc2b65a4f"

RPROVIDES:${PN} += "libb2-devel \
pkgconfig-libb2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libb2-1"

inherit rpm
