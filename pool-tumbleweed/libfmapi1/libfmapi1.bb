SUMMARY = "Library for MAPI data types"
DESCRIPTION = "A library for MAPI data types. \
 \
libfmapi is part of the libyal library collection"
LICENSE = "LGPL-3.0-or-later"

PV = "20260521"

RPM_NAME = "libfmapi1-20260521-1.8.aarch64.rpm"
RPM_HASH = "996af30600c1b70db104235cf15346389e67f48d10c11f1fd91224066d06242501bdc24ad3967ee5aed8a221efff2546248e45f83629843ad97ec995e2d51ec5"

RPROVIDES:${PN} += "libfmapi.so.1 \
libfmapi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libuna.so.1"

inherit rpm
