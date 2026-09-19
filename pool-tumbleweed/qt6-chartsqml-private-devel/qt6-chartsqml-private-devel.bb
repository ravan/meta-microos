SUMMARY = "Non-ABI stable API for the Qt 6 ChartsQml Library"
DESCRIPTION = "This package provides private headers of libQt6ChartsQml that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-chartsqml-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "6d7bd48ba61e97a66c2d161970f057802c231e056f54a5f235b158b0f49fb1a64116aafca1d4dcffcf03a5af9858cc360ca20788ffa7f91a543eea0a52b9f39e"

RPROVIDES:${PN} += "cmake-Qt6ChartsQmlPrivate \
qt6-chartsqml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6ChartsQml"

inherit rpm
