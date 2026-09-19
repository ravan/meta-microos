SUMMARY = "3D printer control software"
DESCRIPTION = "Communication library between internal components for Ultimaker software"
LICENSE = "LGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "libArcus3-4.13.1-9.14.aarch64.rpm"
RPM_HASH = "bc8f42be8bb5c0f97eed4a34c0b97d198b642366d6254a4d37d6e3965962b01d02cb82b0e62c3025d210e508bf5ee4ecef7e40b60886fb4354ad2226aaa39f53"

RPROVIDES:${PN} += "libArcus-Ultimaker \
libArcus.so.3 \
libArcus3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf.so.36.1.0 \
libstdc++.so.6"

inherit rpm
