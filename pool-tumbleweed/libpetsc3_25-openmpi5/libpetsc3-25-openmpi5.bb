SUMMARY = "PETSc shared libraries"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.25.1"

RPM_NAME = "libpetsc3_25-openmpi5-3.25.1-1.2.aarch64.rpm"
RPM_HASH = "d4e94c71e84de333301ccb821309beb435c82a648036a78ce97f4829dc11fffdc1b246ddd2137e3aee3aa1460a3e174c506c1f1bea375ead27d46176b41a1ad8"

RPROVIDES:${PN} += "libpetsc.so.3.25 \
libpetsc3-25-openmpi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libamd.so.3 \
libblas.so.3 \
libc.so.6 \
libcholmod.so.5 \
libgcc-s.so.1 \
libgfortran.so.5 \
libhdf5.so.310 \
libklu.so.2 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.40 \
libmpi.so.40 \
libptscotch.so.7.0 \
libptscotcherr.so.7.0 \
libscalapack.so.2.2.2 \
libscotch.so.7.0 \
libspqr.so.4 \
libstdc++.so.6 \
libumfpack.so.6 \
libyaml-0.so.2 \
petsc-openmpi5-data"

inherit rpm
