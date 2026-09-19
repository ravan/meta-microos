SUMMARY = "An open source implementation of ITU-T Rec.814 | ISO 15444-15 (a.k.a. HTJ2K)"
DESCRIPTION = "OpenHTJ2K is an open source implementation of ITU-T Rec.814 | ISO/IEC 15444-15 (a.k.a. JPEG 2000 Part 15, High-Throughput JPEG 2000; HTJ2K)."
LICENSE = "BSD-3-Clause"

PV = "0.19.0"

RPM_NAME = "openhtj2k-0.19.0-1.3.aarch64.rpm"
RPM_HASH = "16d6752a704368927a2091fc176eb7efd78e70f9589016ec63bf7460f8cc220b253faf1279ca24069b8e91c75d136e0032e09c957efb76df309bed0b179fc16b"

RPROVIDES:${PN} += "openhtj2k"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopenhtj2k.so.0 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
