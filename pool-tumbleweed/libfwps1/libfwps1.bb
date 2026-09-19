SUMMARY = "Library for Windows Property Store data types"
DESCRIPTION = "libfwps is a library for Windows Property Store data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260522"

RPM_NAME = "libfwps1-20260522-1.9.aarch64.rpm"
RPM_HASH = "2383625589dcce01f8d656506e6f1a25d1dd693a90fc2ffbb4cbda27c7dd474150a62bd3eb9785d7c1d671c71e86b86ffca86f8a79597095862ca70b2aad1a01"

RPROVIDES:${PN} += "libfwps.so.1 \
libfwps1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcnotify.so.1 \
libuna.so.1"

inherit rpm
