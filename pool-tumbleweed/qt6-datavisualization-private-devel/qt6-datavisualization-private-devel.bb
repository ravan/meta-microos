SUMMARY = "Non-ABI stable API for the Qt 6 DataVisualization Library"
DESCRIPTION = "This package provides private headers of libQt6DataVisualization that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-datavisualization-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "e5bc564c457a5a574da008d0ee7355bc7824ae0f6eb4108ccb6491e9898ff71bbac49982c7f466f5c49da856af11377bf0933cc14a5690891440ff3f7eee97de"

RPROVIDES:${PN} += "cmake-Qt6DataVisualizationPrivate \
qt6-datavisualization-private-devel"

RDEPENDS:${PN} += "cmake-Qt6DataVisualization"

inherit rpm
