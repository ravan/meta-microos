SUMMARY = "Non-ABI stable API for the Qt 6 3DAnimation library"
DESCRIPTION = "This package provides private headers of libQt63DAnimation that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3danimation-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "301583c083670c8b37ae78609a3e7a49645716c6e9ba8066cc95b4039dee1438cadcc26e36a05cb10bb6b9db616a95b8a1131c7dd3fd97d9135535e96f022aae"

RPROVIDES:${PN} += "cmake-Qt63DAnimationPrivate \
qt6-3danimation-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DAnimation \
cmake-Qt63DCorePrivate \
cmake-Qt63DRenderPrivate \
cmake-Qt6CorePrivate"

inherit rpm
