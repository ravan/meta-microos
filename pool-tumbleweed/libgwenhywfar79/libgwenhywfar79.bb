SUMMARY = "Multiplatform Helper Library for Other Libraries"
DESCRIPTION = "Gwenhywfar is a base library used to provide OS abstraction functions \
for Linux, FreeBSD, OpenBSD, NetBSD, and Windows. It also includes \
some often needed functions (for example, for handling and parsing of \
configuration files, reading and writing of XML files, and interprocess \
communication)."
LICENSE = "LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "libgwenhywfar79-5.14.1-1.3.aarch64.rpm"
RPM_HASH = "ce64a66fe4f5c65d59b75f5cf35f2190dd1e45ce28c7e607db0de434a7e30e94341e7e53a265cbb6922e807bb409ac30331e30dd3ae3129487d0ac755fcaaaaa"

RPROVIDES:${PN} += "libgwenhywfar.so.79 \
libgwenhywfar79"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgnutls.so.30 \
libgpg-error.so.0"

inherit rpm
