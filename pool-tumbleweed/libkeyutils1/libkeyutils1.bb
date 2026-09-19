SUMMARY = "Key utilities library"
DESCRIPTION = "This package provides a wrapper library for the key management facility \
system calls."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.3"

RPM_NAME = "libkeyutils1-1.6.3-7.10.aarch64.rpm"
RPM_HASH = "9c21d57a4873888cb71ec798122f744adc5d8d3c50bb19e1ce5cde964dedab6bbd57111204f2b41b7656a789699bc02b84945a26d3012fdb3461f02321090115"

RPROVIDES:${PN} += "keyutils-libs \
libkeyutils.so.1 \
libkeyutils1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
