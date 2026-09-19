SUMMARY = "FDTD finite-difference time-domain solver library"
DESCRIPTION = "Meep (or MEEP) is a free finite-difference time-domain (FDTD) \
simulation software package developed at MIT to model electromagnetic \
systems."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "libmeep32-1.28.0-1.12.aarch64.rpm"
RPM_HASH = "b7c2c04c0f997f8a3d54c7a9708057416f2ebdc9c59048d43c9833f64c6d4b8bfd0c58753e2d68a847832d74142db0d157c5fdb442574ee2e5c18dd759f3803e"

RPROVIDES:${PN} += "libmeep.so.32 \
libmeep32"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libctlgeom.so.7 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libgsl.so.28 \
libgslcblas.so.0 \
libharminv.so.3 \
libhdf5.so.310 \
liblapack.so.3 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
