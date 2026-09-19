SUMMARY = "Utilities for core application functionality and accessing the OS"
DESCRIPTION = "KCoreAddons provides classes built on top of QtCore to perform various tasks \
such as manipulating mime types, autosaving files, creating backup files, \
generating random sequences, performing text manipulations such as macro \
replacement, accessing user information and many more. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kcoreaddons-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "c85e6a1e4d5ac7c36807beb487501dd0ea4ea0825fdfcdae6d20fc1f099b4f61df8db6a110b5c997a4b5b2eb650cedbdc7b2ca91b5324ca7345e95167123acdf"

RPROVIDES:${PN} += "cmake-KF6CoreAddons \
kf6-kcoreaddons-devel \
pkgconfig-KF6CoreAddons"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libKF6CoreAddons6 \
pkgconfig-Qt6Core"

inherit rpm
