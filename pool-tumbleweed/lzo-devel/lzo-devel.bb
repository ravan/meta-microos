SUMMARY = "Development files for lzo"
DESCRIPTION = "LZO is a portable lossless data compression library written in ANSI C. \
Decompression requires no memory. LZO is suitable for data \
de-/compression in real-time. This means it favours speed over \
compression ratio."
LICENSE = "GPL-2.0-or-later"

PV = "2.10"

RPM_NAME = "lzo-devel-2.10-9.10.aarch64.rpm"
RPM_HASH = "b5f3207809da26b78a4cfeb479a3493b0024c9d5f3c687141e02db6e676e940a10553283be0f3b73423c69169e9d25783d9f34661b72560c5a5a5b4585dd65ea"

RPROVIDES:${PN} += "lzo-devel \
pkgconfig-lzo2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblzo2-2"

inherit rpm
