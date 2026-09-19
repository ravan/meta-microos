SUMMARY = "PETSc shared libraries"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.25.1"

RPM_NAME = "libpetsc3_25-3.25.1-1.2.aarch64.rpm"
RPM_HASH = "ecfc1288e0bab9a9a14805bed2ea46c6704028f5d24361d3ba257a3c4b46dffd8eeb21a71696b2c15a1628276a1fdc3720f6748fa2b42c7cc7ef212157483419"

RPROVIDES:${PN} += "libpetsc.so.3.25 \
libpetsc3-25"

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
libspqr.so.4 \
libstdc++.so.6 \
libumfpack.so.6 \
libyaml-0.so.2 \
petsc-data"

inherit rpm
