SUMMARY = "Development files for KSaneCore, a Qt library for scanner hardware"
DESCRIPTION = "KSaneCore is a Qt-based interface for SANE library to control scanner hardware. \
This package contains the development files required to use KSaneCore in other \
applications."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "ksanecore-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "13ede84774c23bc5f6d84a490903572b4e3c871758a6f20f91eef30a2af8635ba997ed6ec4d6e73cb882b8c845403a3b77c845d606ca5d402dc5aa96b55cd69b"

RPROVIDES:${PN} += "cmake-KSaneCore6 \
ksanecore-devel"

RDEPENDS:${PN} += "cmake-Qt6Gui \
libKSaneCore6-1"

inherit rpm
