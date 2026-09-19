SUMMARY = "Development files for lzo"
DESCRIPTION = "LZO is a portable lossless data compression library written in ANSI C. \
Decompression requires no memory. LZO is suitable for data \
de-/compression in real-time. This means it favours speed over \
compression ratio."
LICENSE = "GPL-2.0-or-later"

PV = "2.10"

RPM_NAME = "lzo-devel-static-2.10-9.10.aarch64.rpm"
RPM_HASH = "1d61beca7f39447a372f9a8adc6fdb440e105163efdd90a8b553530a03b87a82a21a627918a075afd2c42c8439c978d2e4487275b79a47cfc21e0cf172b6586b"

RPROVIDES:${PN} += "lzo-devel-/usr/lib64/liblzo.a \
lzo-devel-static"

RDEPENDS:${PN} += "lzo-devel"

inherit rpm
