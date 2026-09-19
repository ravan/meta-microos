SUMMARY = "Thrift Zlib API"
DESCRIPTION = "A shared library from the Thrift software framework."
LICENSE = "Apache-2.0"

PV = "0.24.0"

RPM_NAME = "libthriftz-0_24_0-0.24.0-2.1.aarch64.rpm"
RPM_HASH = "e30093d4db373ebc5a5284f3f58d06cdaef59a99538c7784e5de7c58092474cd6a0fbdec09285bdfa965503fc5cfd282fdd1d361c8c5a477328194bde7763c27"

RPROVIDES:${PN} += "libthriftz-0-24-0 \
libthriftz-0.24.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
