SUMMARY = "Electromagnetic field solver using the EC-FDTD method"
DESCRIPTION = "Electromagnetic field solver using the EC-FDTD method."
LICENSE = "GPL-3.0-only"

PV = "0.0.36"

RPM_NAME = "openEMS-0.0.36-4.8.aarch64.rpm"
RPM_HASH = "06855cdc9d38835ff5c40b40594e8c06bc2b07f3563c321f82f4c7514020ae39ae456b2137c9f7d6c68df5249d0da463f94c880d7a6209b4ec301aacc34f2994"

RPROVIDES:${PN} += "openEMS"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnf2ff.so.0 \
libopenEMS.so.0 \
libstdc++.so.6"

inherit rpm
