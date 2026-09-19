SUMMARY = "Non-ABI stable API for the Qt 6 CanvasPainter Library"
DESCRIPTION = "This package provides private headers of libQt6CanvasPainter that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-canvaspainter-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "9d2cf2c81d8ba7c33c01f4fc7e0bfd46ea16cdb8773b860ff794ad7196d1758a937aa0141bbc2c98acca14a59aeeb91fd66ac3b5375e5e74203bc77d9107725e"

RPROVIDES:${PN} += "cmake-Qt6CanvasPainterPrivate \
qt6-canvaspainter-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CanvasPainter \
cmake-Qt6GuiPrivate"

inherit rpm
