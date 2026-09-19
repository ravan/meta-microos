SUMMARY = "Development headers for coin-or-Clp"
DESCRIPTION = "Clp (Coin-or linear programming) is an open-source linear programming solver. \
 \
This package contains the development headers for coin-or-Clp."
LICENSE = "EPL-2.0"

PV = "1.17.10"

RPM_NAME = "coin-or-Clp-devel-1.17.10-1.7.aarch64.rpm"
RPM_HASH = "85becca8a0ad75bdf4673db5e137de1b4a9771781c5976a5e1cd8451277b1c876254226d3240e899fa1512ac4fac3e0352777ebac6470d448d0d5bd36d250ad3"

RPROVIDES:${PN} += "coin-or-Clp-devel \
pkgconfig-clp \
pkgconfig-osi-clp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libClp1 \
libOsiClp1 \
pkgconfig-clp \
pkgconfig-coinutils \
pkgconfig-osi"

inherit rpm
