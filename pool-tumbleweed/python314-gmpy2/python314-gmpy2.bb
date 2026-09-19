SUMMARY = "GMP/MPIR, MPFR, and MPC interface to Python 2.6+ and 3x"
DESCRIPTION = "gmpy2 is a C-coded Python extension module that supports \
multiple-precision arithmetic. In addition to supporting \
GMP or MPIR for multiple-precision integer and rational \
arithmetic, gmpy2 adds support for the MPFR (correctly \
rounded real floating-point arithmetic) and MPC (correctly \
rounded complex floating-point arithmetic) libraries."
LICENSE = "LGPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "python314-gmpy2-2.3.1-1.2.aarch64.rpm"
RPM_HASH = "984a5e18ef3f6aa09b54bc379f7e3c5160803ec177e4b6a42daae30a051624dce35fc2a4ba25d1d6353e0d21c744028851602d20fe9c2bb76d4d58611a26ddd0"

RPROVIDES:${PN} += "python3.14dist-gmpy2 \
python314-gmpy2 \
python3dist-gmpy2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
python-abi"

inherit rpm
