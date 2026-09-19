SUMMARY = "Library for encryption formats"
DESCRIPTION = "libfcrypto is a library for encryption formats. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260521"

RPM_NAME = "python313-libfcrypto-20260521-1.6.aarch64.rpm"
RPM_HASH = "8ce4f8a1acd741b4bb5033ccd1ebd80a707536705fb624949f4994ab5b9f3b525268cd3484351ce0af59ceca6f56327ed856e868c17a621e0b9ed0435ba82417"

RPROVIDES:${PN} += "python3-libfcrypto \
python313-libfcrypto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfcrypto.so.1 \
python-abi"

inherit rpm
