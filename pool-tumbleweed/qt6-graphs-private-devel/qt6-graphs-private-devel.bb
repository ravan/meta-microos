SUMMARY = "Non-ABI stable API for the Qt 6 Graphs Library"
DESCRIPTION = "This package provides private headers of libQt6Graphs that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-graphs-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "797b3f2c7b22c067226fc42d11ab1ae9c3e4ac7118f86a37322794269f4b8bea555d3219d0c950f0c3ccfa8d4d975b4c1a691cee9566321bd64815c1fe548ebd"

RPROVIDES:${PN} += "cmake-Qt6GraphsPrivate \
cmake-Qt6GraphsWidgetsPrivate \
qt6-graphs-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Graphs"

inherit rpm
