SUMMARY = "A library to decode digital camera RAW files"
DESCRIPTION = "libopenraw is a library that aim at decoding digital camera RAW files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.7"

RPM_NAME = "libopenraw9-0.3.7-1.14.aarch64.rpm"
RPM_HASH = "faceedf801f43c2cc2f660654d5884e5db46590e466ab50992ab9d42be9c6032a27b634d8e828322fe7a4b0d343e61084c026813b57dd44a29fb1147e0a33a59"

RPROVIDES:${PN} += "libopenraw.so.9 \
libopenraw9 \
libopenrawgnome.so.9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libstdc++.so.6"

inherit rpm
