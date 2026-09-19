SUMMARY = "Example Applications for the id3lib Library"
DESCRIPTION = "This package contains simple example applications that make use of \
id3lib, a software library for ID3v1 and ID3v2 tag manipulation."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.3"

RPM_NAME = "id3lib-examples-3.8.3-271.5.aarch64.rpm"
RPM_HASH = "4c7ed1be0345b476fb78bc0fbf995a033a63867b0a87ab6fbac7c5ef74f2b633a637e863cd7069e806447d20a88572d13043e1c79d0fae868104b4815980b12b"

RPROVIDES:${PN} += "id3lib-examples"

RDEPENDS:${PN} += "id3lib \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libid3-3.8.so.3 \
libstdc++.so.6"

inherit rpm
