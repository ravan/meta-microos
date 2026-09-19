SUMMARY = "Wavefront .obj file loader"
DESCRIPTION = "A single-file Wavefront .obj loader written in C++. \
It can parse over 10M polygons with moderate memory and time."
LICENSE = "MIT"

PV = "2.0.0rc9"

RPM_NAME = "libtinyobjloader2-2.0.0rc9-3.5.aarch64.rpm"
RPM_HASH = "2ec468da42b8be6a33a3a5a9b9fae363a2196274d82412cf3f672f003ca46c54cfe07025a476d1fc2b9665e85a6f01f52e5ae0191167b8d09d5496df406ffb36"

RPROVIDES:${PN} += "libtinyobjloader.so.2 \
libtinyobjloader2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
