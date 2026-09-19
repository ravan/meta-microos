SUMMARY = "Shared libraries for O2scl, a scientific computation library"
DESCRIPTION = "O2scl is a C++ library for object-oriented numerical programming. \
 \
This package provides the shared libraries for o2scl."
LICENSE = "GPL-3.0-only"

PV = "0.930.1"

RPM_NAME = "libo2scl0-0.930.1-3.2.aarch64.rpm"
RPM_HASH = "178933fd6c5de95c9dae47eba66ec24e5ca9ec60d365d133de05f3a64ea15ca0fe26aaaab60e169a2c7acc5fdb9ae7eadc4a5cbde25a60f558bc117282587e19"

RPROVIDES:${PN} += "libo2scl.so.0 \
libo2scl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libarmadillo.so.15 \
libc.so.6 \
libcblas.so.3 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libgsl.so.28 \
libhdf5-hl.so.310 \
libhdf5.so.310 \
libm.so.6"

inherit rpm
