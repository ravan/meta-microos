SUMMARY = "Simple userland wrapper around kernel tap devices (developer files)"
DESCRIPTION = "This is an over-engineered commodity library to manage a pool \
of tap devices and provides the basic \
pre-up.d/up.d/down.d/post-down.d infrastructure."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.33"

RPM_NAME = "libnozzle-devel-1.33-2.2.aarch64.rpm"
RPM_HASH = "c6cd3696c255db720d1437b29f9896cfcaefd68e3f14319703649b8020d3d1f201582c689e9c5b265c22c7a980b33d8c56647ed50c1c13676474b717d1ca5e1c"

RPROVIDES:${PN} += "libnozzle-devel \
libnozzle1-devel \
pkgconfig-libnozzle"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnozzle1 \
pkgconfig"

inherit rpm
