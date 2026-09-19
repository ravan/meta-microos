SUMMARY = "Development files for opencsg, a CSG rendering library"
DESCRIPTION = "OpenCSG is a library that does image-based Constructive Solid \
Geometry rendering using OpenGL. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of opencsg."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.2"

RPM_NAME = "opencsg-devel-1.8.2-1.3.aarch64.rpm"
RPM_HASH = "b287e0b665ac8f834fa2735cf09b6c568481fc8d6f9f4665781d74768a6abe50389b99ed924ffa79f862718c8ee69889dc5b3e7850c091f443005eafeac3d904"

RPROVIDES:${PN} += "opencsg-devel"

RDEPENDS:${PN} += "libopencsg1"

inherit rpm
