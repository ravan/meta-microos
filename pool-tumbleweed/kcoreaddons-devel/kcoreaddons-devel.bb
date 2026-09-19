SUMMARY = "Utilities for core application functionality and accessing the OS"
DESCRIPTION = "KCoreAddons provides classes built on top of QtCore to perform various tasks \
such as manipulating mime types, autosaving files, creating backup files, \
generating random sequences, performing text manipulations such as macro \
replacement, accessing user information and many more. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kcoreaddons-devel-5.116.0-1.9.aarch64.rpm"
RPM_HASH = "78dad1eccdbd7e2da782f5c8cbd0cc6d484723146e775355c270408ec507735270d7c2b782817bf2dd022bcb436b53cb0cc15b7985eb0d2bc6d314da9e0f66e7"

RPROVIDES:${PN} += "cmake-KF5CoreAddons \
kcoreaddons-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
kcoreaddons \
ld-linux-aarch64.so.1 \
libKF5CoreAddons5 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
