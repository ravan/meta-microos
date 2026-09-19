SUMMARY = "C++ binding for the OpenGL API"
DESCRIPTION = "glbinding is a C++ binding for the OpenGL API. \
 \
This package provides the shared library for glbinding."
LICENSE = "MIT"

PV = "3.5.0"

RPM_NAME = "libglbinding3-3.5.0-2.5.aarch64.rpm"
RPM_HASH = "98f63f166353c8602a152df63105791261f5d4891f64f2e6fdb1b7d2bae1ff88452c9af3d288e8ff40b27a7942358d7992e279b349bac0739941415c34a223c1"

RPROVIDES:${PN} += "libglbinding.so.3 \
libglbinding3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
