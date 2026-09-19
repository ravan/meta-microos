SUMMARY = "Library for fingerprint reader support"
DESCRIPTION = "The fprint project provides a central system to support fingerprint \
readers. libfprint is the component which does the work of talking to \
fingerprint reading devices, and processing fingerprint data."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.10+tod1"

RPM_NAME = "libfprint-2-2-1.94.10+tod1-3.1.aarch64.rpm"
RPM_HASH = "b209bde0b2fd1826bd494788c126436b0dace6b78e50eea68dc4d6dca1142186fb41af267bc2169bb37e1f0a8fe0cab45d5416c8a478ba57aa3fb6c912f2f6c0"

RPROVIDES:${PN} += "libfprint \
libfprint-2-2 \
libfprint-2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfprint-2-tod.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libgusb.so.2 \
libm.so.6"

inherit rpm
