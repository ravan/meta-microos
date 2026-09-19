SUMMARY = "Shared library files for non-ntk"
DESCRIPTION = "This package contains shared libraries for non-ntk."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1001"

RPM_NAME = "libntk1-1.3.1001-5.7.aarch64.rpm"
RPM_HASH = "24c7b038f1e8a1157f20a056c94492b46889851b80c9826a57a0af5d065b6194c553af89e8a97c4f19a05ed8a5480f53d42849ffb84244811cdec4cae3d416d0"

RPROVIDES:${PN} += "libntk-gl.so.1 \
libntk-images.so.1 \
libntk.so.1 \
libntk1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenGL.so.0 \
libX11.so.6 \
libXft.so.2 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
