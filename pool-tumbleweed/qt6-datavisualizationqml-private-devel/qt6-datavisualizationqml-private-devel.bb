SUMMARY = "Non-ABI stable API for the Qt 6 DataVisualizationQml Library"
DESCRIPTION = "This package provides private headers of libQt6DataVisualizationQml that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-datavisualizationqml-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "f53c2dc228ee2d9b1567568920f91766e0a733a5b13556b6cfc570d844bfc15258b086d7badbfe8acdaf7b64fb1306f0adf1ecd54206ab450ea701e595c29e50"

RPROVIDES:${PN} += "cmake-Qt6DataVisualizationQmlPrivate \
qt6-datavisualizationqml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6DataVisualizationQml"

inherit rpm
