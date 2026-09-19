SUMMARY = "Libraries for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains libraries for Gromacs"
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2026.1"

RPM_NAME = "libgromacs_mpi11-2026.1-2.1.aarch64.rpm"
RPM_HASH = "8fa5f21f9fe620cc456a0c613f2f7260e33c34c44210c3abb37aadc8c729f673917b35aa421bbd740c875b0d8b170e9284e3c6b05e7d5c479eba324a0009595f"

RPROVIDES:${PN} += "libgromacs-mpi.so.11 \
libgromacs-mpi11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
liblapack.so.3 \
libm.so.6 \
libmpi.so.40 \
libmuparser.so.2.3.5 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
