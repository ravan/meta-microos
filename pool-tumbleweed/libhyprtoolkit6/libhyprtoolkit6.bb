SUMMARY = "A C++ GUI toolkit for native Wayland applications"
DESCRIPTION = "Hyprtoolkit is a C++ toolkit for making Wayland GUI apps."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "libhyprtoolkit6-0.6.0-1.1.aarch64.rpm"
RPM_HASH = "9d2a663fec05a60610ced5d2ebfbe681322ef391e8d8da3390f6c7d1ce3273189e0b71c7e02e91d2209cd6dce366023189e69b67083705a164c8f392c3f127fa"

RPROVIDES:${PN} += "libhyprtoolkit.so.6 \
libhyprtoolkit6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libOpenGL.so.0 \
libabsl-hash.so.2608.0.0 \
libabsl-raw-hash-set.so.2608.0.0 \
libaquamarine.so.14 \
libc.so.6 \
libcairo.so.2 \
libdrm.so.2 \
libgbm.so.1 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libhyprgraphics.so.4 \
libhyprlang.so.2 \
libhyprutils.so.13 \
libiniparser.so.4 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpixman-1.so.0 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxkbcommon.so.0"

inherit rpm
