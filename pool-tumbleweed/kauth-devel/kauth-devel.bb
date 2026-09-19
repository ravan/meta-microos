SUMMARY = "Framework which lets applications perform actions as a privileged user"
DESCRIPTION = "KAuth is a framework to let applications perform actions as a privileged user. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kauth-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "e381e7e02d9de7a957910a96d9ee47f4fe64d43389819d8d98cb0f941e6f5cb4ab3d3a8eb74fcc561f7fc10b38e2e877b0c6b615060d3eb2d3e745284f6885c4"

RPROVIDES:${PN} += "cmake-KF5Auth \
kauth-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
libKF5Auth5"

inherit rpm
