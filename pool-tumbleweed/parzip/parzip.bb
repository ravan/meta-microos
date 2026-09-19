SUMMARY = "Parallel pkzip implementation"
DESCRIPTION = "A command line utility to pack and unpack zip archives using \
multiple threads. \
 \
Supports \
    both zipping and unzipping \
    multithreading \
    uncompressed (i.e. stored) files \
    deflate and lzma compression and decompression \
    ZIP64 extensions (i.e. >4 GB files) \
    unix file attributes \
 \
Does not support \
    modifying existing archives \
    encryption (zip encryption is broken, use GPG instead) \
    ancient compression methods \
    archives split to multiple files"
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "parzip-1.4.0-2.9.aarch64.rpm"
RPM_HASH = "e7d9b6be83113c5f7d215001d008ddc6fa3164d124f0a4022753703ed1360812d5685e27b01b2ce4b4dcdb03cef4f4201cd97cb52c440373bf201ab22f2f1a31"

RPROVIDES:${PN} += "parzip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblzma.so.5 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
