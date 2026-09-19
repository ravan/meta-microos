SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libotf."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.16"

RPM_NAME = "libotf-devel-0.9.16-2.9.aarch64.rpm"
RPM_HASH = "d3861865681b009e0d245a815805f6834aed1a10a4670a5f88a59cd1028a1184d92876ae6cd4a73a649040f272e6b8847a9594fc8fdc12cb4572f3f7819bd337"

RPROVIDES:${PN} += "libotf-devel \
pkgconfig-libotf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libotf \
pkgconfig-freetype2"

inherit rpm
