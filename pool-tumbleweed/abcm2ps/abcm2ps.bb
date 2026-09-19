SUMMARY = "A program to typeset abc tunes into Postscript"
DESCRIPTION = "abcm2ps is a package which converts music tunes from ABC format to \
PostScript. Based on abc2ps version 1.2.5, it was developed mainly to print \
barock organ scores which have independent voices played on one or many \
keyboards and a pedal board. abcm2ps introduces many extensions to the ABC \
language that make it suitable for classical music."
LICENSE = "LGPL-3.0-or-later"

PV = "8.14.18"

RPM_NAME = "abcm2ps-8.14.18-1.4.aarch64.rpm"
RPM_HASH = "1d94a7f755b4f87aa2dc525d3ef08efe19b192604585c2df9d7afd0bead11ab13d0b6beac9e7bc2b27ba5d3a6581d2d865801251ba0e3270db363b9f910f4ef6"

RPROVIDES:${PN} += "abcm2ps"

RDEPENDS:${PN} += "libc.so.6 \
libfreetype.so.6 \
libglib-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0"

inherit rpm
