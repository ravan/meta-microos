SUMMARY = "Utility to repair broken lzip files"
DESCRIPTION = "Lziprecover is a data recovery tool and decompressor for files in the \
lzip compressed data format (.lz) able to repair slightly damaged \
files, recover badly damaged files from two or more copies, extract \
undamaged members from multi-member files, decompress files and test \
integrity of files. \
 \
Lziprecover is able to recover or decompress files produced by any of \
the compressors in the lzip family; lzip, plzip, minilzip/lzlib, \
clzip and pdlzip. This recovery capability contributes to make the \
lzip format one of the best options for long-term data archiving. \
 \
Lziprecover is able to efficiently extract a range of bytes from a \
multi-member file, because it only decompresses the members \
containing the desired data. \
 \
Lziprecover can print correct total file sizes and ratios even for \
multi-member files."
LICENSE = "GPL-2.0-or-later"

PV = "1.25"

RPM_NAME = "lziprecover-1.25-2.7.aarch64.rpm"
RPM_HASH = "531a342447a7f05ed5f10c4a68520fe4eefef996d65c602a7883273bc6ba38d56bb4b75663c5fbca42acf8a884229ef996aec1e14f765a148ce924e7e089509e"

RPROVIDES:${PN} += "lziprecover"

RDEPENDS:${PN} += "/usr/bin/sh \
info \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
