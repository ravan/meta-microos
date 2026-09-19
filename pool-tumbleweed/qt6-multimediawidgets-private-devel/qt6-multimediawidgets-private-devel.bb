SUMMARY = "Non-ABI stable API for the Qt 6 MultimediaWidgets Library"
DESCRIPTION = "This package provides private headers of libQt6MultimediaWidgets that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-multimediawidgets-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "6580787543591098d196af931221b3aede215d88ad7c04e59ca111c200f7a4dfd507274e1361febd9badb5c2d2db2650123c2cee78a9b2bddab23047bfa265f5"

RPROVIDES:${PN} += "cmake-Qt6MultimediaWidgetsPrivate \
qt6-multimediawidgets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6MultimediaPrivate \
cmake-Qt6MultimediaWidgets \
cmake-Qt6WidgetsPrivate"

inherit rpm
