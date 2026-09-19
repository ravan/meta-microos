SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickAnimation library"
DESCRIPTION = "This package provides private headers of libQt63DQuickAnimation that do not \
have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3dquickanimation-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "bcf2a9590574a619312ee3461a134a51d549ccde23c509bd0fe2a3c809d69465e6ef8f82a2da7deb0e31be1c5a69ddf6c9755920fd229a6f93b0a41b9c59060d"

RPROVIDES:${PN} += "cmake-Qt63DQuickAnimationPrivate \
qt6-3dquickanimation-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DCorePrivate \
cmake-Qt63DQuickAnimation \
cmake-Qt63DQuickPrivate \
cmake-Qt63DRenderPrivate \
cmake-Qt6CorePrivate \
cmake-Qt6QmlPrivate"

inherit rpm
