SUMMARY = "Method collection to manipulate strings using various encodings"
DESCRIPTION = "KCodecs provides a collection of methods to manipulate strings using various \
encodings."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Codecs6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "88c91e355e78d5667259c8dda89327b6c45fa51e290b66c0262b467eafa63222bbe11cdd8529a0ce70e7a72d14da10a7c5adf45a8f2a02577610e0bd81963da9"

RPROVIDES:${PN} += "libKF6Codecs.so.6 \
libKF6Codecs6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kcodecs \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
