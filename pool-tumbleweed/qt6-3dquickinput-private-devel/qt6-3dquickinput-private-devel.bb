SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickInput library"
DESCRIPTION = "This package provides private headers of libQt63DQuickInput that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3dquickinput-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "01bb17b672a5d206675f971fbd8d264f4ee78cd0f1031e485badbd9daff876c463510cd7502a0e1e6c14d218a9d7933a7326a19e6bd5d27611c448afca1c2f59"

RPROVIDES:${PN} += "cmake-Qt63DQuickInputPrivate \
qt6-3dquickinput-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DCorePrivate \
cmake-Qt63DInputPrivate \
cmake-Qt63DQuickInput \
cmake-Qt63DQuickPrivate \
cmake-Qt6CorePrivate \
cmake-Qt6QmlPrivate"

inherit rpm
