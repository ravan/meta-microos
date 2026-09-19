SUMMARY = "Library to parse EBML files"
DESCRIPTION = "libebml is a C++ library to parse EBML files. See the EBML RFC at \
http://www.matroska.org/technical/specs/rfc/index.html ."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.7"

RPM_NAME = "libebml5-1.4.7-1.1.aarch64.rpm"
RPM_HASH = "a932375c5f417d1c55f5d304fa5b68e0885452fbb132804a11a9410dbdcc3279f6fec306d6d6d36b0185aa6ec83dc9d104da321c5c531d4f6e63c7e505d26c33"

RPROVIDES:${PN} += "libebml.so.5 \
libebml5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
