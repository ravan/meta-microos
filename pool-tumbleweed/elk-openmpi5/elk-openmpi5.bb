SUMMARY = "An all-electron full-potential linearised augmented-planewave code"
DESCRIPTION = "An all-electron full-potential linearised augmented-plane wave \
(FP-LAPW) code with many features. The code is designed to be as \
simple as possible so that new developments in the field of density \
functional theory (DFT) can be added quickly and reliably. \
 \
 \
This flavour of elk is built with openmpi5 \
parallelisation support."
LICENSE = "GPL-3.0-or-later"

PV = "8.7.2"

RPM_NAME = "elk-openmpi5-8.7.2-2.12.aarch64.rpm"
RPM_HASH = "1fb6fb8070161aad2f6248faf6879869dd85aea9258f8b8c07aa7890c02a65cede689fc050630d8d49d3455ae011f7cb87702ce80a38a12cef9f9eb8f72a8bbd"

RPROVIDES:${PN} += "elk-openmpi5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libfftw3.so.3 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgfortran.so.5 \
libgomp.so.1 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.40 \
libmvec.so.1 \
libwannier.so \
libxc.so.12 \
openmpi5-libs \
wannier90-openmpi5-devel"

inherit rpm
