SUMMARY = "Qt 6 WlShellIntegration library - Development files"
DESCRIPTION = "Development files for the Qt 6 WlShellIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-wlshellintegration-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "a5507bdef8e4704c389779d464590a53d425ee87838047a0bf01513220726a47e0bd3e9ce7bc0a823ac9f1562bf3e5f9ed82cb531df88da9ad047fbe5c7b5c43"

RPROVIDES:${PN} += "cmake-Qt6WlShellIntegrationPrivate \
qt6-wlshellintegration-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Gui \
cmake-Qt6WaylandClient \
libQt6WlShellIntegration6"

inherit rpm
