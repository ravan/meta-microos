SUMMARY = "Open Source Software Image Map libraries"
DESCRIPTION = "The OSSIM shared library files. \
Open Source Software Image Map (OSSIM) is an engine for \
remote sensing, image processing, geographical information systems and \
photogrammetry."
LICENSE = "LGPL-3.0-only"

PV = "2.12.1"

RPM_NAME = "libossim2-2.12.1-1.1.aarch64.rpm"
RPM_HASH = "4a40e7429c71e254a1c16c529915dd107f96dd0367f75354e0029901d14f071a52186312617843b462a0f2a4a50825fc59bb58da0b05f31cd9018a392626ce8c"

RPROVIDES:${PN} += "libossim.so.2 \
libossim2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgeos-c.so.1 \
libgeotiff.so.5 \
libhdf5-cpp.so.310 \
libhdf5.so.310 \
libjpeg.so.8 \
libjsoncpp.so.27 \
libm.so.6 \
libstdc++.so.6 \
libtiff.so.6 \
libuuid.so.1 \
libz.so.1"

inherit rpm
