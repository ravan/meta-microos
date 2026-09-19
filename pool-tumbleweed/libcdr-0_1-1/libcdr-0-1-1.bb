SUMMARY = "Library for parsing the Corel Draw file format structure"
DESCRIPTION = "libcdr is a library for parsing the Corel Draw file format structure."
LICENSE = "MPL-2.0"

PV = "0.1.9"

RPM_NAME = "libcdr-0_1-1-0.1.9-1.3.aarch64.rpm"
RPM_HASH = "1c646baa28fcf622adc17cb2fede1d4a4809c6230a4612ae82d9693340dd8201f1d27d0bbfe41890f173482d79b24b34a32fd510c9cc4a041d41732772a1b064"

RPROVIDES:${PN} += "libcdr-0-1-1 \
libcdr-0.1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.78 \
libicuuc.so.78 \
liblcms2.so.2 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
