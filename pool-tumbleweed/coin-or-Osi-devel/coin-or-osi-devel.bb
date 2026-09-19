SUMMARY = "Development headers for coin-or-Osi"
DESCRIPTION = "Osi (Open Solver Interface) provides an abstract base class to a generic \
linear programming (LP) solver. \
 \
This package contains the development headers for coin-or-Osi."
LICENSE = "EPL-2.0"

PV = "0.108.11"

RPM_NAME = "coin-or-Osi-devel-0.108.11-1.7.aarch64.rpm"
RPM_HASH = "b2d41782de1a6d6cf39fc44e239d3157959ffa7a44ff68b95289f1f248675767cead6cd49d016f47855f4460795318c817734a8e813e603bd38611fe568beecb"

RPROVIDES:${PN} += "coin-or-Osi-devel \
pkgconfig-osi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOsi1 \
pkgconfig-coinutils"

inherit rpm
