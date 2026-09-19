SUMMARY = "Multi-format unarchiver"
DESCRIPTION = "The Unarchiver is originally a Mac OS X application. This package \
contains a command-line variant of it. Unarchiver handles ZIP, ZIPX, \
RAR, 7z, tar, gzip, bzip2, lzma, xz, CAB, MSI, NSIS, some \
self-extracting EXEs, cpio, and further obscure and old formats, as \
well as disc images in ISO, BIN, MDF, NRG, CDI. It supports filenames \
in foreign character sets."
LICENSE = "LGPL-2.1-or-later"

PV = "1.10.8"

RPM_NAME = "unar-1.10.8-3.9.aarch64.rpm"
RPM_HASH = "f9554fc8b3dfe225fb132cee2a9899ee1084e781c6c8d234582e6736bde359bc4bf9ed54ec2deb638ac24f429759e84e88482371b7c9dd98f8fab1298bc725d8"

RPROVIDES:${PN} += "unar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnustep-base.so.1.31 \
libicuuc.so.78 \
libm.so.6 \
libobjc.so.4 \
libstdc++.so.6 \
libwavpack.so.1 \
libz.so.1"

inherit rpm
