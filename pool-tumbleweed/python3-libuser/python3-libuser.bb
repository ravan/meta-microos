SUMMARY = "Python library for libuser"
DESCRIPTION = "Python library for libuser."
LICENSE = "LGPL-2.0-or-later"

PV = "0.64"

RPM_NAME = "python3-libuser-0.64-2.7.aarch64.rpm"
RPM_HASH = "952f1525e9d41a86b470c33eaa4d91e2bbfbcb0eb083e03b7ba2958d2f2fb1915d32b7715f362f02d1059aa8ecb6218b1996f84f586a5a3f6b11473073b1c4f8"

RPROVIDES:${PN} += "libuser.so \
python3-libuser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libuser.so.1 \
libuser1 \
python-abi"

inherit rpm
