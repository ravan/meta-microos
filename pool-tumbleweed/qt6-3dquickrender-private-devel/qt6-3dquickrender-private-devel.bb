SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickRender library"
DESCRIPTION = "This package provides private headers of libQt63DQuickRender that do not have \
any ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3dquickrender-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "ac03984d5e3925064263fe142d048164c75e8c57a77ef6cc1aaa02fcda40b204ec533a56874efaa0abc936fbf8a62d8ba92d3cea8754a3a433d15717050a04eb"

RPROVIDES:${PN} += "cmake-Qt63DQuickRenderPrivate \
qt6-3dquickrender-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DCorePrivate \
cmake-Qt63DQuickPrivate \
cmake-Qt63DQuickRender \
cmake-Qt63DRenderPrivate \
cmake-Qt6CorePrivate \
cmake-Qt6QmlPrivate"

inherit rpm
