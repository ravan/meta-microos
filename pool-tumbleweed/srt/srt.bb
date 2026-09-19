SUMMARY = "Secure Reliable Transport (SRT)"
DESCRIPTION = "SRT is a video transport protocol and technology stack \
that optimizes streaming performance across unpredictable networks \
with secure streams and firewall traversal."
LICENSE = "MPL-2.0"

PV = "1.5.7"

RPM_NAME = "srt-1.5.7-1.1.aarch64.rpm"
RPM_HASH = "1555aaaeba7b35cfc495ed064dd82b93bb31c2daebe664fa566f81a778cc534798e8e36fab2ff4e31c6a84a63971bb5ddea6e70edcc5611c67e78ef7a3a832e5"

RPROVIDES:${PN} += "srt"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsrt.so.1.5 \
libstdc++.so.6"

inherit rpm
