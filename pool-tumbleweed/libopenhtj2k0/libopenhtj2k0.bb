SUMMARY = "An open source implementation of ITU-T Rec.814 | ISO 15444-15 (a.k.a. HTJ2K)"
DESCRIPTION = "OpenHTJ2K is an open source implementation of ITU-T Rec.814 | ISO/IEC 15444-15 (a.k.a. JPEG 2000 Part 15, High-Throughput JPEG 2000; HTJ2K)."
LICENSE = "BSD-3-Clause"

PV = "0.19.0"

RPM_NAME = "libopenhtj2k0-0.19.0-1.3.aarch64.rpm"
RPM_HASH = "0adfaf68c6de65971e3c52c0e9f307a2abf1c09decc31f61efff347074b6dd4ae5dcbf27c41028527f5be72311165c357300f8f39583ac5bb672a44cf53351fe"

RPROVIDES:${PN} += "libopenhtj2k.so.0 \
libopenhtj2k0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
