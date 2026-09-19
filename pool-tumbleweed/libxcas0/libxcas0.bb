SUMMARY = "Component library for the icas/xcas frontends"
DESCRIPTION = "Xcas is an interface to perform computer algebra, function graphs, \
interactive geometry (2D and 3D), spreadsheet and statistics \
programmation. It may be used as a replacement for graphic calculators \
for example on netbooks."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "libxcas0-2.0.0-2.6.aarch64.rpm"
RPM_HASH = "e66b8c238f0d1fbf99ddda028319208fa201e66751d6d32977b2a46900bf0757b57817154782e0d06a55bbbac4df281c221a637d0193b4502dd94f7227c78c54"

RPROVIDES:${PN} += "libxcas.so.0 \
libxcas0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libc.so.6 \
libfltk-gl.so.1.3 \
libfltk-images.so.1.3 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libgiac.so.0 \
libgmp.so.10 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
