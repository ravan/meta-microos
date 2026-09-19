SUMMARY = "Qt 6 Positioning library - Development files"
DESCRIPTION = "Development files for the Qt 6 Positioning library."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-positioning-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "bf5364bf077e253d6159d6f8325ee16eb944c9ce0f08b36fcc94440a622de5b3e6d56c44d435ab453f13bb050f5f716307ca139733e43db816220f4991fccabf"

RPROVIDES:${PN} += "cmake-Qt6Positioning \
pkgconfig-Qt6Positioning \
qt6-positioning-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Positioning6 \
pkgconfig-Qt6Core"

inherit rpm
