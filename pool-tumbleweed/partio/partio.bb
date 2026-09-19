SUMMARY = "Library for reading/writing/manipulating common animation particle"
DESCRIPTION = "C++ (with python bindings) library for easily reading/writing/manipulating \
common animation particle formats such as PDB, BGEO, PTC."
LICENSE = "BSD-3-Clause"

PV = "1.20.0"

RPM_NAME = "partio-1.20.0-1.4.aarch64.rpm"
RPM_HASH = "303908528c22893dc23a3172c2c6439bd955e25accde73720ad14e00af1d0fd7e853f317a07eb72f7f7769e4cafa1202ba9cb42c7a2ddf97dc5ef9681542d836"

RPROVIDES:${PN} += "partio"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libGLU.so.1 \
libGLX.so.0 \
libOpenGL.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libglut.so.3 \
libm.so.6 \
libpartio.so.1 \
libstdc++.so.6"

inherit rpm
