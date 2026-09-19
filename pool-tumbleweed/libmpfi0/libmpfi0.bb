SUMMARY = "Multi-precision floating-point interval arithmetic computation library"
DESCRIPTION = "MPFI is a C library for arbitrary precision interval arithmetic with \
intervals represented using MPFR reliable floating-point numbers. \
 \
The purpose of an arbitrary precision interval arithmetic is on the \
one hand to get 'guaranteed' results, thanks to interval computation, \
and on the other hand to obtain accurate results, thanks to multiple \
precision arithmetic."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.4"

RPM_NAME = "libmpfi0-1.5.4-2.9.aarch64.rpm"
RPM_HASH = "2a02fc06f4da9253b2d4313f5a5c1909139ac735bf7e1ae291a7323aa31abbadcab41eb8bf59e170ef9ac33d184894b48a089d00fc9f11820d43acc587770520"

RPROVIDES:${PN} += "libmpfi.so.0 \
libmpfi0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libmpfr.so.6"

inherit rpm
