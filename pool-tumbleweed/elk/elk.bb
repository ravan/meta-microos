SUMMARY = "An all-electron full-potential linearised augmented-planewave code"
DESCRIPTION = "An all-electron full-potential linearised augmented-plane wave \
(FP-LAPW) code with many features. The code is designed to be as \
simple as possible so that new developments in the field of density \
functional theory (DFT) can be added quickly and reliably."
LICENSE = "GPL-3.0-or-later"

PV = "8.7.2"

RPM_NAME = "elk-8.7.2-2.13.aarch64.rpm"
RPM_HASH = "35783e5266eebca93091be5fe34903d05753c4c52556dd8f898f6634e9f1cbfccdca045d4cb740fcfb1a9af56812018e0ff209b9a37090290973dc628aad301c"

RPROVIDES:${PN} += "elk"

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
libmvec.so.1 \
libwannier.so \
libxc.so.12 \
wannier90-devel"

inherit rpm
