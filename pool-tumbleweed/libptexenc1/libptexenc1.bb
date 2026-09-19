SUMMARY = "Libraries of Kanji code convert library for pTeX"
DESCRIPTION = "The ptexenc is a useful library for Japanese pTeX \
(which stands for publishing TeX, and is an extension of \
TeX by ASCII Co.) and its surrounding tools."
LICENSE = "BSD-3-Clause"

PV = "1.5.2"

RPM_NAME = "libptexenc1-1.5.2-120.4.aarch64.rpm"
RPM_HASH = "e58ec8fe79613f7fe98e8b4777f1be283bfbf77e05e057e63d4994b29333b2cada79ed4af9c2f7d23cc3f4a864c23df686765fed7d9509a12cc09e31053bc77a"

RPROVIDES:${PN} += "libptexenc.so.1 \
libptexenc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6"

inherit rpm
