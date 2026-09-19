SUMMARY = "Library for Transactional NTFS (TxF) data types"
DESCRIPTION = "libftxf is a library for Transactional NTFS (TxF) data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260521"

RPM_NAME = "libftxf1-20260521-1.6.aarch64.rpm"
RPM_HASH = "c2e6d6a05406d9611660e712fc04266e43329befd408fec3587323baca84cb52f002901e13b6fde3e2a030a629530df90a60f33bde90ad974d1dd44ec5e9cc9f"

RPROVIDES:${PN} += "libftxf.so.1 \
libftxf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfusn.so.1"

inherit rpm
