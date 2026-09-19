SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickLogic library"
DESCRIPTION = "This package provides private headers of libQt63DQuickLogic that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3dquicklogic-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "b83d1f21ad28cdacfa1d5d4858642884dd205f12840003ed04493b9d0ab100467f517ded600287dbbe6b12fb3cdff0f1a163139a5d82bd64cdfcbc4bce834398"

RPROVIDES:${PN} += "cmake-Qt63DQuickLogic \
cmake-Qt63DQuickLogicPrivate \
pkgconfig-Qt63DQuickLogic \
qt6-3dquicklogic-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt63DQuickLogic6"

inherit rpm
