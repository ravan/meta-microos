SUMMARY = "Library for linear arithmetic over GF(2^e)"
DESCRIPTION = "M4RIE is a library for arithmetic with dense matrices over the \
Galois Field GF(2^e)."
LICENSE = "GPL-2.0-or-later"

PV = "20250128"

RPM_NAME = "libm4rie1-20250128-1.7.aarch64.rpm"
RPM_HASH = "f23c75451effb2f646ac7145b366cfc3ca64d13a9322b6881d90a301c36af561151f3be55efcd38e51c9f386827ee73a007d7315a1d3fd0bb9021c4d4ed690c2"

RPROVIDES:${PN} += "libm4rie.so.1 \
libm4rie1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libm4ri.so.2"

inherit rpm
