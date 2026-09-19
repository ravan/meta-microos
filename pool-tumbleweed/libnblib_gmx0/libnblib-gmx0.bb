SUMMARY = "Libraries for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains libraries for Gromacs."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2026.1"

RPM_NAME = "libnblib_gmx0-2026.1-2.1.aarch64.rpm"
RPM_HASH = "9828850241161dc57e39eb027f444849e84914fcf9ddbab9c3d6386a18cc0809a3840f4f49f00af97b1e0387e69fac90531af3ffc1760389eafb95e25d8d33d9"

RPROVIDES:${PN} += "libnblib-gmx.so.0 \
libnblib-gmx0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libgromacs.so.11 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
