SUMMARY = "Non-ABI stable API for the Qt 6 PositioningQuick Library"
DESCRIPTION = "This package provides private headers of libQt6PositioningQuick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-positioningquick-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "b1c14904698828a19cc53fc4ccb1a72931f0948ea89345ec253bb666b4f5fb171d86b889ff8cdf6e159788566fcbce8ab1484a9ab12dba429c94925398396140"

RPROVIDES:${PN} += "cmake-Qt6PositioningQuickPrivate \
qt6-positioningquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6PositioningPrivate \
cmake-Qt6PositioningQuick \
cmake-Qt6QuickPrivate"

inherit rpm
