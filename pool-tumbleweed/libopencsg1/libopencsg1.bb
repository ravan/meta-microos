SUMMARY = "Constructive Solid Geometry rendering library"
DESCRIPTION = "OpenCSG is a library that does image-based Constructive Solid \
Geometry rendering using OpenGL. CSG denotes an approach to model 3D \
shapes by applying operations such as union, intersection or \
subtraction to so-called primtives, the latter of which are solid \
(i.e. have a clearly defined interior and exterior)."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.2"

RPM_NAME = "libopencsg1-1.8.2-1.3.aarch64.rpm"
RPM_HASH = "c428fee45bfc62055709c13810477a52c3309de99c353c391cd3912d2a07c39c294148e8c56e58e700e6e078e3a6ca42438755b6a8b280a67303a7c20ce89bdb"

RPROVIDES:${PN} += "libopencsg.so.1 \
libopencsg1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
