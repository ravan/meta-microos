SUMMARY = "XBase Compatible C++ Class Library"
DESCRIPTION = "This is an XBase (dBase and FoxPro, for example) compatible C++ class \
library."
LICENSE = "LGPL-2.1+"

PV = "3.1.2"

RPM_NAME = "libxbase64-1-3.1.2-1.36.aarch64.rpm"
RPM_HASH = "c9b8a59609cadbfb2b0b571df877f7ea8117d7a17fe034aae178dab77c5bb6f4fdbdd98593b09a3f8f37924667f098f08a91f8b48e1cc7e7b660e08ac0689734"

RPROVIDES:${PN} += "libxbase64-1 \
libxbase64.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
