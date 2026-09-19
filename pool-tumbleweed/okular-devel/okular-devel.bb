SUMMARY = "Development files for the Okular document viewer"
DESCRIPTION = "Document viewing program; supports document in various formats"
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "okular-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "0c58c842874e3a2498fb71aba0caeaaf768b6b2585aed74f8d79befc009f4a6d616864470b7d641c680d4a1027ebf0743882526bcbde6c57c231fdf8bd727100"

RPROVIDES:${PN} += "cmake-Okular6 \
okular-devel \
okular5-devel"

RDEPENDS:${PN} += "cmake-KF6Config \
cmake-KF6CoreAddons \
cmake-KF6XmlGui \
cmake-Qt6Core \
cmake-Qt6PrintSupport \
cmake-Qt6Widgets \
okular"

inherit rpm
