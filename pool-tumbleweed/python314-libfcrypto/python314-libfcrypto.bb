SUMMARY = "Library for encryption formats"
DESCRIPTION = "libfcrypto is a library for encryption formats. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260521"

RPM_NAME = "python314-libfcrypto-20260521-1.6.aarch64.rpm"
RPM_HASH = "4a915abf45d4d852aa952b056a4fca7df4e6d6ca72ddb169adade9727c4728322c73d97f77b4c991af30e276602bb138ea6b0a8219c6761530cf4b3d048863b8"

RPROVIDES:${PN} += "python314-libfcrypto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfcrypto.so.1 \
python-abi"

inherit rpm
