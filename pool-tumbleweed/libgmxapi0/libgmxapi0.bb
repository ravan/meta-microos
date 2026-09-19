SUMMARY = "Libraries for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains libraries for Gromacs."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2026.1"

RPM_NAME = "libgmxapi0-2026.1-2.1.aarch64.rpm"
RPM_HASH = "b682540e5054dfd11bfdd3e991413ba8742eda17f34faac0050bf72c4214f2baa6a3d01b9be087a54b78ff4e0c2075d05feb01d43d81c585f5b4a237314f674b"

RPROVIDES:${PN} += "libgmxapi.so.0 \
libgmxapi0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgromacs.so.11 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
