SUMMARY = "Source and header files for O2scl"
DESCRIPTION = "O2scl is a C++ library for object-oriented numerical programming. \
 \
This package provides the source and header files for writing software \
using o2scl."
LICENSE = "GPL-3.0-only"

PV = "0.930.1"

RPM_NAME = "o2scl-devel-0.930.1-3.2.aarch64.rpm"
RPM_HASH = "7d47bbf0f62c17d96f21184267c145aa0b6ef05f45195330db67d9390e2e586e48bb992365b40463c1f20fec481dfec7b7621122ddc45f23318d2aa1a513593c"

RPROVIDES:${PN} += "o2scl-devel"

RDEPENDS:${PN} += "armadillo-devel \
cblas-devel \
eigen3-devel \
gcc14-c++ \
hdf5-devel \
libc.so.6 \
libgcc-s.so.1 \
libgsl.so.28 \
libhdf5-hl.so.310 \
libhdf5.so.310 \
libm.so.6 \
libo2scl.so.0 \
libo2scl0 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
pkgconfig-fftw3 \
pkgconfig-gsl \
pkgconfig-mpfr \
readline-devel"

inherit rpm
