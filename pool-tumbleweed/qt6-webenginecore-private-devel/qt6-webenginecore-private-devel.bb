SUMMARY = "Non-ABI stable API for the Qt 6 WebEngineCore library"
DESCRIPTION = "This package provides private headers of libQt6WebEngineCore that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-webenginecore-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "110d9b65295fea88e044e69abaadd076e35025518de5baf4e81aeb98ada250d8385e1b427b2bac0ff8c1c038763c272536fb31811ab4dc6a2eb4170a92b6228e"

RPROVIDES:${PN} += "cmake-Qt6WebEngineCorePrivate \
qt6-webenginecore-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebEngineCore"

inherit rpm
