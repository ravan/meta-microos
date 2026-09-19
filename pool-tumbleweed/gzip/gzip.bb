SUMMARY = "GNU Zip Compression Utilities"
DESCRIPTION = "Gzip reduces the size of the named files using Lempel-Ziv coding LZ77. \
Whenever possible, each file is replaced by one with the extension .gz, \
while keeping the same ownership modes and access and modification \
times."
LICENSE = "GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "gzip-1.14-3.1.aarch64.rpm"
RPM_HASH = "cf8c1030b5d1cc88c5ae500d448705dddbea8ee1c6d438f0a0a1fc06865bd50995a61f5e47997c5c1ee89cd5ca3971ff3b1464562aa53e0235621e2d3d6c9db5"

RPROVIDES:${PN} += "alternative-gzip \
gzip"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
