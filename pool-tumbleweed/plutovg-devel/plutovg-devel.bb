SUMMARY = "Development files for plutovg, a vector graphics library"
DESCRIPTION = "The plutovg-devel package contains header files for \
developing application that use plutovg. \
PlutoVG is a standalone 2D vector graphics library in C."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "plutovg-devel-1.3.2-1.3.aarch64.rpm"
RPM_HASH = "2db2bf4a5c12539a9b0d2fa33b2d6c2747a216b6d3396d6839442cdebc04aaeb105ec5dc0f1bbd38f98b684f6f2812a530387bb53708f9036cacf89103251406"

RPROVIDES:${PN} += "cmake-plutovg \
pkgconfig-plutovg \
plutovg-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libplutovg1"

inherit rpm
