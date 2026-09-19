SUMMARY = "Non-ABI stable API for the Qt 6 WaylandClient library"
DESCRIPTION = "This package provides private headers of libQt6WaylandClient that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-waylandclient-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "cdbe05132c0c5e6773ee02bd16fd3af376dd1234174629054fced42fdc717655d7d23b6969b2b8131bdb16e0101160df658fee03f659a2adb79c898ed611a2ad"

RPROVIDES:${PN} += "cmake-Qt6WaylandClientPrivate \
qt6-waylandclient-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6WaylandClient"

inherit rpm
