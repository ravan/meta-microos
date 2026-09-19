SUMMARY = "Qt6 QmlTypeRegistrar static library"
DESCRIPTION = "The Qt6 QmlTypeRegistrar static library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-qmltyperegistrar-devel-static-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "5236d49ec067ad21cfcfd432cb0baa096e5094c532514ccc564c6a7fbd9b05e47405b643f96fb3f07c93f5441ff90869fa4dccf9caf360b3d300c99455126449"

RPROVIDES:${PN} += "cmake-Qt6QmlTypeRegistrarPrivate \
qt6-qmltyperegistrar-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
