SUMMARY = "Library for accessing CMIS-enabled servers"
DESCRIPTION = "libcmis is a C++ client library for the CMIS (Content Management \
Interoperability Services) interface. This library allows C++ \
applications to connect to any CMIS-enabled repositories."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "0.6.2"

RPM_NAME = "libcmis-0_6-6-0.6.2-3.16.aarch64.rpm"
RPM_HASH = "8b523ebbd41fa95733b851a03c7d1f1659807c89738b97f29b49d14218076582b64a08c75d4145a00de7fca7702df6ee9b73e2ce23a91db7ca05f068d7d34779"

RPROVIDES:${PN} += "libcmis-0-6-6 \
libcmis-0.6.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
