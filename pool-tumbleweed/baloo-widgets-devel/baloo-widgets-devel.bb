SUMMARY = "Development package for baloo-widgets"
DESCRIPTION = "Development package for baloo-widgets"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "baloo-widgets-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "275092829e28709f9e2d41eee1946d13070436f25e22b33971a6a91b01f18e18e86b59c01b8c3eeb34ce44888e0bb1992bbb56d364d12bcb826b0b9a36baa86a"

RPROVIDES:${PN} += "baloo-widgets-devel \
cmake-KF6BalooWidgets"

RDEPENDS:${PN} += "baloo-widgets \
cmake-KF6KIO \
cmake-Qt6Widgets"

inherit rpm
