SUMMARY = "Library for AES encryption"
DESCRIPTION = "libcaes is a library for AES encryption."
LICENSE = "LGPL-3.0-or-later"

PV = "20260905"

RPM_NAME = "python314-libcaes-20260905-1.1.aarch64.rpm"
RPM_HASH = "290f98bedd88b66207b822010a0929651aeb25f90408e96ce2b0793b6c6354480a77fc6ff250a60107bef7b461cdf96ee6118014def7cebb31a23e9b2f09cf13"

RPROVIDES:${PN} += "python314-libcaes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcaes.so.1 \
libcerror.so.1 \
python-abi"

inherit rpm
