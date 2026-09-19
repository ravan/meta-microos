SUMMARY = "Library for parsing the Apple Keynote presentations"
DESCRIPTION = "Libetonyek is library providing ability to interpret and import Apple Keynote \
presentations into various applications."
LICENSE = "MPL-2.0"

PV = "0.1.13"

RPM_NAME = "libetonyek-0_1-1-0.1.13-2.3.aarch64.rpm"
RPM_HASH = "2ad4acddeaea816acdac4192f0163c9fee09a6f2fa960b6917af0a396146678a1771cf8f7437bae8f5c20f11bb815797c44494d8fbeeb6ad8b346785c548bd3b"

RPROVIDES:${PN} += "libetonyek-0-1-1 \
libetonyek-0.1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblangtag.so.1 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libxml2.so.16 \
libz.so.1"

inherit rpm
