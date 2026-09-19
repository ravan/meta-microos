SUMMARY = "Non-ABI stable API for the Qt 6 Charts Library"
DESCRIPTION = "This package provides private headers of libQt6Charts that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-charts-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "2656ba65bf4afa41a8bf1fcf6179c7e4c49300ce1405ab613b1d0794670cc76b4d5d1f5635920a28d56c778760f0ac9835981c375d54b009043c5f55d976e15c"

RPROVIDES:${PN} += "cmake-Qt6ChartsPrivate \
qt6-charts-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Charts"

inherit rpm
