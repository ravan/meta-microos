SUMMARY = "Set of item models extending the Qt model-view framework"
DESCRIPTION = "KItemModels provides a set of item models extending the Qt model-view framework. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kitemmodels-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "965399ee6bac7851ccedfb51bc4083d9f325248cb144629bc08e0ad112b2bd6895f7568892f822c6116bb28037d1b6de3ded711beb5879b7a208d38af2f294bc"

RPROVIDES:${PN} += "cmake-KF5ItemModels \
kitemmodels-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
libKF5ItemModels5"

inherit rpm
