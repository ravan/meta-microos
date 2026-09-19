SUMMARY = "Development files for kimageformats"
DESCRIPTION = "This package contains development files for kimageformats, a framework \
to provide additional image format plugins for QtGui."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kimageformats-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "5d14f55559695d2ee7ce007b7f0a5530b8c35b1cba70de703475da1272fe784efbc1d144b3ddc7d9e0bda571afa8537581edd94ad194e759ade5ff32f8d3521c"

RPROVIDES:${PN} += "cmake-KF6ImageFormats \
kf6-kimageformats-devel"

RDEPENDS:${PN} += "kf6-kimageformats"

inherit rpm
