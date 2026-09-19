SUMMARY = "Computer algebra interface"
DESCRIPTION = "Xcas is an interface to perform computer algebra, function graphs, \
interactive geometry (2D and 3D), spreadsheet and statistics \
programmation. It may be used as a replacement for graphic calculators \
for example on netbooks."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "xcas-2.0.0-2.6.aarch64.rpm"
RPM_HASH = "0debdb0811b327cfc41a067198560448f3be4009491d768b20a3a9d40a39f64f53823f386a71e2382c6c35ad5b949376ebdef8cd66bc289fb12ab9faf7d0cd11"

RPROVIDES:${PN} += "xcas"

RDEPENDS:${PN} += "giac \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfltk-gl.so.1.3 \
libfltk-images.so.1.3 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libgiac.so.0 \
libgsl.so.28 \
libstdc++.so.6 \
libxcas.so.0"

inherit rpm
