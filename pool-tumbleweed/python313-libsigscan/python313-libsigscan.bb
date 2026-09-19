SUMMARY = "Library for binary signature scanning"
DESCRIPTION = "libsigscan is a library for binary signature scanning \
 \
libsigscan is part of the libyal family of libraries"
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "python313-libsigscan-20260902-1.1.aarch64.rpm"
RPM_HASH = "3e964b6df2ce5f83687100678b7baf5b5df02312f0641cd91d539cd57cb883eb85a200dc0e0ef67a3ff6a44160610a6335beaeeceff8a4bec40ba44d82a5cce2"

RPROVIDES:${PN} += "python3-libsigscan \
python313-libsigscan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libsigscan.so.1 \
python-abi"

inherit rpm
