SUMMARY = "A Real-Time Data Compression Library"
DESCRIPTION = "LZO is a portable lossless data compression library written in ANSI C. \
Decompression requires no memory. LZO is suitable for data compression \
and decompression in real-time. This means it favors speed over \
compression ratio."
LICENSE = "GPL-2.0-or-later"

PV = "2.10"

RPM_NAME = "liblzo2-2-2.10-9.10.aarch64.rpm"
RPM_HASH = "3d37c6e00db855ab7d5badee969fe69c8184a9fca5d9367ffadc94dcf265d84233164e8c21d27ad394201df806803de46dab79117f56bdf7a4a15385f3cefc74"

RPROVIDES:${PN} += "liblzo2-2 \
liblzo2.so.2 \
lzo"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
