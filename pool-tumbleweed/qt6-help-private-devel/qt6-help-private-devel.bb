SUMMARY = "Non-ABI stable API for the Qt 6 Help library"
DESCRIPTION = "This package provides private headers of libQt6Help that do not have any \
ABI or API guarantees."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "qt6-help-private-devel-6.11.2-2.3.aarch64.rpm"
RPM_HASH = "2e55fba536365b26e1eddcd7edcfbf6d2dbb303384614e73ca1279a0622ade6aeccd5361a7336727c32a0cb92de4a4127e87d330b1708702df66124b9e8c1d3c"

RPROVIDES:${PN} += "cmake-Qt6HelpPrivate \
qt6-help-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6Help"

inherit rpm
