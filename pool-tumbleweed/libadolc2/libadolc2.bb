SUMMARY = "Algorithmic Differentiation Library for C/C++"
DESCRIPTION = "ADOL-C (Automatic Differentiation by OverLoading in C++) facilitates \
the evaluation of first and higher derivatives of vector functions \
written in C or C++. The resulting derivative evaluation routines may \
be called from C/C++, Fortran, or any other language that can be \
linked with C. \
 \
The numerical values of derivative vectors are obtained free of \
truncation errors at a small multiple of the run time and randomly \
accessed memory of the given function evaluation program."
LICENSE = "EPL-1.0 | GPL-2.0-or-later"

PV = "2.7.2"

RPM_NAME = "libadolc2-2.7.2-5.5.aarch64.rpm"
RPM_HASH = "78a912630bf67b79a7f5fea4019d95845b2b0d392514db9195d92e56e5363d8d73460d1ce2505ee2b3c07a7da71f2e740ae89a5cda85a9cd45e524f0fa61d920"

RPROVIDES:${PN} += "libadolc.so.2 \
libadolc2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libColPack.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
