SUMMARY = "Library for binary signature scanning"
DESCRIPTION = "libsigscan is a library for binary signature scanning \
 \
libsigscan is part of the libyal family of libraries"
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "python314-libsigscan-20260902-1.1.aarch64.rpm"
RPM_HASH = "bd9b013822201e67345f3e43c159824e7c5608428a3ee56094a8496bf61ac64468b88ab2ab031c3b8665a0aa97d39469e3f1475288007b4f7b48c04dcf3577e2"

RPROVIDES:${PN} += "python314-libsigscan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libsigscan.so.1 \
python-abi"

inherit rpm
