SUMMARY = "Method collection to manipulate strings using various encodings"
DESCRIPTION = "KCodecs provides a collection of methods to manipulate strings using various \
encodings."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5Codecs5-5.116.0-1.9.aarch64.rpm"
RPM_HASH = "bf5a5ad14c6b3e4438a7bd8887c42a88f362cc05bde0317b17c21f0173b0918d8a981029eddd657130c53fc6ea64b96cd6ff50cea09693c5a4884cedff9975c9"

RPROVIDES:${PN} += "libKF5Codecs.so.5 \
libKF5Codecs5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
