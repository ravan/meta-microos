SUMMARY = "GMP/MPIR, MPFR, and MPC interface to Python 2.6+ and 3x"
DESCRIPTION = "gmpy2 is a C-coded Python extension module that supports \
multiple-precision arithmetic. In addition to supporting \
GMP or MPIR for multiple-precision integer and rational \
arithmetic, gmpy2 adds support for the MPFR (correctly \
rounded real floating-point arithmetic) and MPC (correctly \
rounded complex floating-point arithmetic) libraries."
LICENSE = "LGPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "python313-gmpy2-2.3.1-1.2.aarch64.rpm"
RPM_HASH = "a58282f8019869b6db57e79e45cd4e5caa23b2d8d7e04cc913411bdc6cb0a2b8cba438ee23a866f8c4f8baba1f3ba0b6a0e74f45a862bf1f491b922457ee94ac"

RPROVIDES:${PN} += "python3-gmpy2 \
python3.13dist-gmpy2 \
python313-gmpy2 \
python3dist-gmpy2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
python-abi"

inherit rpm
