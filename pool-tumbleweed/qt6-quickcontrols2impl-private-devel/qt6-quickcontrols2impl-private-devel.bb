SUMMARY = "Non-ABI stable API for the Qt 6 QuickControls2Impl library"
DESCRIPTION = "This package provides private headers of libQt6QuickControls2Impl that do not \
have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quickcontrols2impl-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "067b0093610c74fdd682ca170c4be183d4813f6cf2ed9a273743afbd2561768407c5487e825ca9cea56d2551ca7a13fceca2c2e1317f300cb0149d94d7e9cdd1"

RPROVIDES:${PN} += "cmake-Qt6QuickControls2BasicStyleImplPrivate \
cmake-Qt6QuickControls2FluentWinUI3StyleImplPrivate \
cmake-Qt6QuickControls2FusionStyleImplPrivate \
cmake-Qt6QuickControls2ImplPrivate \
cmake-Qt6QuickControls2MaterialStyleImplPrivate \
cmake-Qt6QuickControls2UniversalStyleImplPrivate \
qt6-quickcontrols2impl-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickControls2Impl"

inherit rpm
