SUMMARY = "Non-ABI stable API for the Qt 6 Location Library"
DESCRIPTION = "This package provides private headers of libQt6Location that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-location-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "65cc5c8538ec9750bd122f1c2ce08c720b5e62f77b25f7841bceab10329ca1e0468b1651273d8efd1099727af3879f81fa5c4457203fe74ca26ce770f3f190b7"

RPROVIDES:${PN} += "cmake-Qt6LocationPrivate \
qt6-location-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6Location \
cmake-Qt6PositioningPrivate \
cmake-Qt6PositioningQuickPrivate \
cmake-Qt6QuickPrivate"

inherit rpm
