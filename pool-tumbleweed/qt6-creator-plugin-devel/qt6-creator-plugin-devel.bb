SUMMARY = "Qt Creator Plugin Development Files"
DESCRIPTION = "This package contains all files from the Qt Creator source directory \
(aka QTC_SOURCE) necessary to compile plugins."
LICENSE = "BSD-3-Clause & GPL-3.0-only & GPL-3.0-with-Qt-Company-Qt-exception-1.1 & (LGPL-2.1-only | LGPL-3.0-only) & LGPL-3.0-only"

PV = "20.0.1"

RPM_NAME = "qt6-creator-plugin-devel-20.0.1-1.3.aarch64.rpm"
RPM_HASH = "99974aff9d880312d1aa92a2efbd0fc0f54bc40f8ae6d5d8fa433c25707829a8594416df4cc889ccaf70fe24c4b11986d9588a630b967a48702325c2dd2a9594"

RPROVIDES:${PN} += "cmake-QtCreator \
libqt5-creator-plugin-devel \
qt5-creator-plugin-devel \
qt6-creator-plugin-devel"

RDEPENDS:${PN} += "qt6-base-devel \
qt6-creator"

inherit rpm
