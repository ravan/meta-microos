SUMMARY = "Non-binary asset user-installable package managing framework"
DESCRIPTION = "This framework lets applications to manage user installable packages of \
non-binary assets. \
 \
Development files."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kpackage-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "8f335523358b86a5267d737934d5d03aefc75ca5bbfe357ea3f0979a2516e2eae51f7b038afdc0269a82f17086590440d427e254b948a5d39951413c5d32a899"

RPROVIDES:${PN} += "cmake-KF6Package \
kf6-kpackage-devel"

RDEPENDS:${PN} += "cmake-KF6CoreAddons \
libKF6Package6"

inherit rpm
