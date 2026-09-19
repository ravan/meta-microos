SUMMARY = "An all-electron full-potential linearised augmented-planewave code"
DESCRIPTION = "An all-electron full-potential linearised augmented-plane wave \
(FP-LAPW) code with many features. The code is designed to be as \
simple as possible so that new developments in the field of density \
functional theory (DFT) can be added quickly and reliably. \
 \
 \
This flavour of elk is built with openmpi4 \
parallelisation support."
LICENSE = "GPL-3.0-or-later"

PV = "8.7.2"

RPM_NAME = "elk-openmpi4-8.7.2-2.14.aarch64.rpm"
RPM_HASH = "4a43eebcc94f1dd2cf1a4cc75b09f5b01f480dfc402941f59473c63a4825bf01494626a8797e8b2ea9cf4ada7814b57f2f7f5407a9637bf0a1b65db1de1ce0d3"

RPROVIDES:${PN} += "elk-openmpi4"

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
openmpi4-libs \
wannier90-openmpi4-devel"

inherit rpm
