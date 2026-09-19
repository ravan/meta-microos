SUMMARY = "Parallel LZMA Data Compressor"
DESCRIPTION = "Plzip is a parallel version of the lzip data compressor. The files \
produced by plzip are fully compatible with lzip-1.4 or newer. Plzip \
is intended for faster compression/decompression of big files on \
multiprocessor machines. \
 \
Lzip is a lossless data compressor based on the LZMA algorithm, with \
very safe integrity checking and a user interface similar to the one \
of gzip or bzip2. Lzip decompresses almost as fast as gzip and \
compresses better than bzip2, which makes it well suited for software \
distribution and data archiving."
LICENSE = "GPL-2.0-or-later"

PV = "1.13"

RPM_NAME = "plzip-1.13-1.4.aarch64.rpm"
RPM_HASH = "ec050dee9452d4765215ba0b268655cbfb32531b1d0ca7bd6ec5b70a1fb33787183c118258b4107d83d2f87074fb203e0e1a131210776010ea92de73dbc45af6"

RPROVIDES:${PN} += "plzip"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblz.so.1 \
libstdc++.so.6"

inherit rpm
