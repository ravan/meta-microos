SUMMARY = "Development Files for Qt Quick Controls 2 Desktop Style"
DESCRIPTION = "This file contains cmake files to be used by projects that depend on \
qqc2-desktop-style. \
Usually not needed as it is only a runtime dependency."
LICENSE = "GPL-2.0-or-later"

PV = "5.116.1"

RPM_NAME = "qqc2-desktop-style-devel-5.116.1-1.13.aarch64.rpm"
RPM_HASH = "560058b86b6141cf3bc6c81e731484391d6d35d7f4c207f25920dc359b8207a1a814dec7a5108493455147ad8710d452e672b57073c8af3c8eb2a786ddd9e96c"

RPROVIDES:${PN} += "cmake-KF5QQC2DeskopStyle \
cmake-KF5QQC2DesktopStyle \
qqc2-desktop-style-devel"

RDEPENDS:${PN} += "qqc2-desktop-style"

inherit rpm
