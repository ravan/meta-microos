SUMMARY = "Deflate64 compression/decompression library"
DESCRIPTION = "A python package to provide compression and decompression feature with Enhanced Deflate algorithm."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.4"

RPM_NAME = "python314-inflate64-1.0.4-1.6.aarch64.rpm"
RPM_HASH = "c2bc342a8578c0ef0886d5e14a135ebb77a76b1813de4ba54b0cc89ef9dbdeef2694e3a5a41a45738260f273fa7cc2baafa5653f2119c2654916670179fc7102"

RPROVIDES:${PN} += "python3.14dist-inflate64 \
python314-inflate64 \
python3dist-inflate64"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
