SUMMARY = "Python bindings for the LZO data compression library"
DESCRIPTION = "This module provides Python bindings for the LZO data compression library. \
 \
LZO is a lossless data compression library. Decompression requires no \
memory. Different compression levels can be used to achieve better \
ratios at the expense of time."
LICENSE = "GPL-2.0-only"

PV = "1.15"

RPM_NAME = "python314-python-lzo-1.15-1.14.aarch64.rpm"
RPM_HASH = "7f7a509ef3564d2312cdb9267b3d2f8ca6dcdf356404d9c84c5deef1e8f85e9ff5faf056722d77bec3eb0f1c06fa7fe6899e27a7d9b5cd7fae485fc85c63dbd5"

RPROVIDES:${PN} += "python3.14dist-python-lzo \
python314-python-lzo \
python3dist-python-lzo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblzo2.so.2 \
python-abi"

inherit rpm
