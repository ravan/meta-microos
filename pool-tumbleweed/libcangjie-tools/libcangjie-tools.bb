SUMMARY = "Tools for the libcangjie IME"
DESCRIPTION = "libcangjie is a C library implementing the Cangjie input method, which \
is mainly used on Traditional Chinese inputing. \
 \
This package provides tools for libcangjie."
LICENSE = "LGPL-3.0+"

PV = "1.3"

RPM_NAME = "libcangjie-tools-1.3-1.33.aarch64.rpm"
RPM_HASH = "b857836c6e87e6a94a52aa609e126c4d4703a9691958e75618e2413298b2e118143dcbd1c8cadeaa7ca721cace5f733287ef4e4bd11150dfdb65b1d35e33ba35"

RPROVIDES:${PN} += "libcangjie-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcangjie.so.2 \
libcangjie2 \
libsqlite3.so.0"

inherit rpm
