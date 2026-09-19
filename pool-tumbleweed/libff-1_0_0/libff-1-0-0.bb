SUMMARY = "C++ library for finite fields and elliptic curves"
DESCRIPTION = "libff is a C++ library for finite fields and elliptic curves."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "libff-1_0_0-1.0.0-3.7.aarch64.rpm"
RPM_HASH = "87a076d8b1490af7bde1edf2136c26d386ff6ae88c18dd5e4137888fd6541e0804eaf9244f230f1015cf6e29ee944db18700236afaa389be6e5b12cdabba6e74"

RPROVIDES:${PN} += "libff-1-0-0 \
libff-1.0.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
