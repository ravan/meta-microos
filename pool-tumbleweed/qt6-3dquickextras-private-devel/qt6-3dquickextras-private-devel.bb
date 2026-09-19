SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickExtras library"
DESCRIPTION = "This package provides private headers of libQt63DQuickExtras that do not have \
any ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3dquickextras-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "80bce24fa60019b0d388ed418858db26475b1b433e9093ed9e6df95a57784dc97ea735c2cf5edecb4e0f5f3302c0a12abbd8c7cd7e2bbebad4ecc5d89b83b88e"

RPROVIDES:${PN} += "cmake-Qt63DQuickExtrasPrivate \
qt6-3dquickextras-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DExtras \
cmake-Qt63DQuickExtras \
cmake-Qt63DQuickPrivate \
cmake-Qt63DRenderPrivate \
cmake-Qt6CorePrivate \
cmake-Qt6QmlPrivate"

inherit rpm
