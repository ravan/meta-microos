SUMMARY = "Qt5 API bindings/wrapper for GPGME"
DESCRIPTION = "QGpgme provides a very high level Qt API around GpgMEpp. \
 \
This package contains the shared library built for Qt5."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.0"

RPM_NAME = "libqgpgme15-2.2.0-1.1.aarch64.rpm"
RPM_HASH = "d158f9b7a6b71150039d6abd9c08054935168645f7b3be2952b9483871db73aa60a5e03d66f88d25890da2e24c4d5a4ac92e6448c992b342b18910781cd419e1"

RPROVIDES:${PN} += "libqgpgme.so.15 \
libqgpgme15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgpgmepp.so.7 \
libstdc++.so.6"

inherit rpm
