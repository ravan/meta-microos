SUMMARY = "Library for encryption formats"
DESCRIPTION = "libfcrypto is a library for encryption formats. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260521"

RPM_NAME = "libfcrypto1-20260521-1.6.aarch64.rpm"
RPM_HASH = "271129b664232800a4f234c07750997ecfb1f68b4983684161d23b72417f2b6e8939e8b9181b3a2bf025c39e1cd308e079f22cdda2e353c2f211e601da6fb22d"

RPROVIDES:${PN} += "libfcrypto.so.1 \
libfcrypto1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm
