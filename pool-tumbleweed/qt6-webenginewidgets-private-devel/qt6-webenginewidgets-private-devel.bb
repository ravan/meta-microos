SUMMARY = "Non-ABI stable API for the Qt 6 WebEngineWidgets library"
DESCRIPTION = "This package provides private headers of libQt6WebEngineWidgets that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-webenginewidgets-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "5464fc56c77247e53185022c08299fc567411863fd970eb7f58e408be1000dc9570f394ddb4bd600502378ab61f37e875b5bb785f6feae529e8857d926fbb5c0"

RPROVIDES:${PN} += "cmake-Qt6WebEngineWidgetsPrivate \
qt6-webenginewidgets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebEngineWidgets"

inherit rpm
