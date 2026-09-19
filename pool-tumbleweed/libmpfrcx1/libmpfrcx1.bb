SUMMARY = "Multi-precision floating-point interval arithmetic computation library"
DESCRIPTION = "MPFRCX is a library for the arithmetic of univariate polynomials over \
arbitrary precision real or complex numbers, without control on the \
rounding. \
 \
The motivation for the library is to have functionality available for \
the floating-point approach to complex multiplication. \
Asymptotically-fast routines such as Toom–Cook and the FFT for \
multiplication of polynomials are available, as well as fast routines \
for interpolation and evaluation based on trees of polynomials."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.3"

RPM_NAME = "libmpfrcx1-0.6.3-1.17.aarch64.rpm"
RPM_HASH = "ec064f380463c7c14f2f9cd8e3e1838bd4fa63b4a8c9ebbe27d847d4059253a8956235e0cf858be758a5faa998b54cf814da956d8a2cacb0198a5db418f22f14"

RPROVIDES:${PN} += "libmpfrcx.so.1 \
libmpfrcx1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libmpc.so.3 \
libmpfr.so.6"

inherit rpm
