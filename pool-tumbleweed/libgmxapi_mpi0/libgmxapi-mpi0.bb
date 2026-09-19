SUMMARY = "Libraries for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains libraries for Gromacs."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2026.1"

RPM_NAME = "libgmxapi_mpi0-2026.1-2.1.aarch64.rpm"
RPM_HASH = "dd72344b75005e23f39464a22f4bfd184303dbb624a67295b8ca6353b393b63f8db6250bbc0f4afdd6c529917f7d83b4577707c25407362b49319df377a12461"

RPROVIDES:${PN} += "libgmxapi-mpi.so.0 \
libgmxapi-mpi0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgromacs-mpi.so.11 \
libm.so.6 \
libmpi.so.40 \
libstdc++.so.6"

inherit rpm
