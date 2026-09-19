SUMMARY = "Python bindings for the LZO data compression library"
DESCRIPTION = "This module provides Python bindings for the LZO data compression library. \
 \
LZO is a lossless data compression library. Decompression requires no \
memory. Different compression levels can be used to achieve better \
ratios at the expense of time."
LICENSE = "GPL-2.0-only"

PV = "1.15"

RPM_NAME = "python313-python-lzo-1.15-1.14.aarch64.rpm"
RPM_HASH = "aaf34d71dc6656f96b69b9a521c15cb68a261d98b1de20de951ff9a10fde912b7b4ec437c71a1cd30c7f26343b64a635b7792bf1a9b738ec16f9d8d1fe3c4789"

RPROVIDES:${PN} += "python3-python-lzo \
python3.13dist-python-lzo \
python313-python-lzo \
python3dist-python-lzo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblzo2.so.2 \
python-abi"

inherit rpm
