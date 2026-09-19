SUMMARY = "Development files for the Qt 5 Linguist tools"
DESCRIPTION = "The Qt 5 Linguist Tools - development files."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.19+kde3"

RPM_NAME = "libqt5-linguist-devel-5.15.19+kde3-1.8.aarch64.rpm"
RPM_HASH = "9a8602f36404c5a46e1628180359755b3d6a173bd93cf2d933f5526db48b08b65a55ceb249b11a3afff2d0b3e6371274db4d869b3a6ea4f3fd0488f4aacd48c4"

RPROVIDES:${PN} += "cmake-Qt5LinguistTools \
libqt5-linguist-devel"

RDEPENDS:${PN} += "libqt5-linguist \
pkgconfig-Qt5Core"

inherit rpm
