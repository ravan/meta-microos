SUMMARY = "Development files for plutosvg, an SVG rendering library in C"
DESCRIPTION = "The plutosvg-devel package contains header files for \
developing application that use plutosvg. \
PlutoSVG is an SVG rendering library written in C."
LICENSE = "MIT"

PV = "0.0.7"

RPM_NAME = "plutosvg-devel-0.0.7-1.5.aarch64.rpm"
RPM_HASH = "3cc5579dd9b970958ffde0b808499849001b5b4c3cee48ac0960cf86748f19f582df9656992a7e1c634456fd3f016224a47fc6aa714b5f5c0dde8a427c95424d"

RPROVIDES:${PN} += "cmake-plutosvg \
pkgconfig-plutosvg \
plutosvg-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-plutovg \
libplutosvg0 \
pkgconfig-plutovg"

inherit rpm
