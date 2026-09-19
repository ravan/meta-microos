SUMMARY = "PETSc shared libraries"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.25.1"

RPM_NAME = "libpetsc3_25-openmpi4-3.25.1-1.2.aarch64.rpm"
RPM_HASH = "23621b83e33d161cfc0f30b779dacab3689434920c68afb36264778c757c6312f81b496e3b79693b75c1c4e9438c8035b57f20997a840cd1d73c4ebcdd989adc"

RPROVIDES:${PN} += "libpetsc.so.3.25 \
libpetsc3-25-openmpi4"

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
petsc-openmpi4-data"

inherit rpm
