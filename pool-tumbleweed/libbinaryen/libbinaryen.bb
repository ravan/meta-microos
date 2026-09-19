SUMMARY = "Library for binaryen"
DESCRIPTION = "Library for binaryen."
LICENSE = "Apache-2.0"

PV = "123"

RPM_NAME = "libbinaryen-123-1.6.aarch64.rpm"
RPM_HASH = "8f74639c18222b949f47e79d7cdb8e6a9c4c3ef4b87ab6072f58ff107628a14395ddae8b3e3871dd57527abc92a8d4c784c1b2d2f79e168325c9ce1eb6cf46c2"

RPROVIDES:${PN} += "libbinaryen \
libbinaryen.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
