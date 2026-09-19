SUMMARY = "Vector/matrix library for OpenEXR"
DESCRIPTION = "Vector/matrix library for OpenEXR."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "libImath-3_2-30-3.2.3-1.1.aarch64.rpm"
RPM_HASH = "2abb756d05ed3b0ad5b01cc60206c72f008793fb830cc391a710ebff4b6e1e94b2eb78778f5a3ec52f95005b5d406544bdf6948d5a2e21b05a57237bbc17b59d"

RPROVIDES:${PN} += "libImath-3-2-30 \
libImath-3-2.so.30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
