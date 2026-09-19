SUMMARY = "Very High Ratio and Speed Compression Designed for Large Files"
DESCRIPTION = "LRZIP is a compression program that can achieve very high compression \
ratios and speed when used with large files. It uses the combined compression \
algorithms of lzma for maximum compression, lzo for maximum speed, and the long \
range redundancy reduction of rzip. It is designed to scale with increases \
with RAM size, improving compression further. A choice of either size or \
speed optimizations allows for either better compression than even lzma can \
provide, or better speed than gzip, but with bzip2 sized compression levels."
LICENSE = "GPL-2.0-only"

PV = "0.702"

RPM_NAME = "lrzip-0.702-1.1.aarch64.rpm"
RPM_HASH = "8f0f333dccfe0cc728073a4390f4eb38a3f43d8ceb8649cf72419e91e2b561546fb912968f6c2e269230cb5ef85d929ce751456fd901461f5a297ac445afd882"

RPROVIDES:${PN} += "lrzip"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblz4.so.1 \
liblzo2.so.2 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
