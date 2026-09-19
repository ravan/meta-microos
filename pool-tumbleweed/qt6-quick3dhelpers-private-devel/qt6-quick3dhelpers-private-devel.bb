SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DHelpers library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DHelpers that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3dhelpers-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "59e0470f7d2ddcf76ea5246af0445042edafde5890db8004163daafde4dfdccf9472f118fbb9cd29136cf629dd1e95ed5a7cf287b93d2477d7163041c9a941d6"

RPROVIDES:${PN} += "cmake-Qt6Quick3DHelpersPrivate \
qt6-quick3dhelpers-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DHelpers"

inherit rpm
