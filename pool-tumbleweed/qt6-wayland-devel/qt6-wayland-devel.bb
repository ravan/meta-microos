SUMMARY = "Qt6 Wayland development meta package"
DESCRIPTION = "This meta-package requires all the qt6-wayland development packages."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-or-later) & GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-wayland-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "9473da049d19c5db09ff205c2c0af730339a9524ad5426f423151eb7020409d9d3badf55d45377fdd2953fdd6ccc83877e2195e4edcda628808e859f39b920a4"

RPROVIDES:${PN} += "qt6-wayland-devel"

RDEPENDS:${PN} += "cmake-Qt6WaylandCompositor"

inherit rpm
