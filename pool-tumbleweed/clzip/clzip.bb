SUMMARY = "Lossless Data Compressor based on LZMA"
DESCRIPTION = "Clzip is a lossless data compressor based on the LZMA algorithm, with \
very safe integrity checking and a user interface similar to that of \
gzip or bzip2. Clzip decompresses almost as fast as gzip and \
compresses better than bzip2, which makes it well suited for software \
distribution and data archiving. Clzip uses the lzip file format; the \
files produced by clzip are fully compatible with lzip-1.4 or newer. \
Clzip is, in fact, a C language implementation of lzip, intended for \
embedded devices or systems lacking a C++ compiler."
LICENSE = "GPL-2.0-or-later"

PV = "1.16"

RPM_NAME = "clzip-1.16-1.3.aarch64.rpm"
RPM_HASH = "1be6d923f170cf2a6457c25af1a0089c6c6e1f1014bb0f588d153df4a7a2e8e3fde3e2afe0cc43ca538eee0162980e15e12cb55e30d9fd9775aa4a5db12776ff"

RPROVIDES:${PN} += "clzip"

RDEPENDS:${PN} += "/usr/bin/sh \
info \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
