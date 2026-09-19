SUMMARY = "Shared library for for meshoptimizer"
DESCRIPTION = "Mesh optimization library that makes meshes smaller and faster to render \
 \
This package holds the shared library files."
LICENSE = "MIT"

PV = "1.2"

RPM_NAME = "libmeshoptimizer-1_2-1.2-1.2.aarch64.rpm"
RPM_HASH = "e89dd095127049b6e6469a793f75adb9281a855d77f85539185f105c263cf2cfeac6ac5e4d8f5474d4a201f9dcf2a2df6284169d26b54148c2c9ff0946b4f0b0"

RPROVIDES:${PN} += "libmeshoptimizer-1-2 \
libmeshoptimizer.so.1.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
