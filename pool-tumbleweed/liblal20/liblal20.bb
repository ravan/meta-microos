SUMMARY = "Shared library for LAL"
DESCRIPTION = "The LSC Algorithm Library Suite (LALSuite) is comprised of various \
gravitational wave data analysis routines written in C following the ISO/IEC \
9899:1999 standard. \
 \
This package provides the shared library for lal."
LICENSE = "GPL-2.0-only"

PV = "7.7.0"

RPM_NAME = "liblal20-7.7.0-4.1.aarch64.rpm"
RPM_HASH = "d3257e910b51031732087c7559b29e9179762fe1dbf9878b47d8ea0c49b51adf88f7e11b3173633253efbe4980ec9b0e325f6040e289b66b99ed2543e9a895d9"

RPROVIDES:${PN} += "liblal.so.20 \
liblal20"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libfftw3f.so.3 \
libgsl.so.28 \
libgslcblas.so.0 \
libm.so.6"

inherit rpm
