SUMMARY = "Development Files for Qt Quick Controls 2 Desktop Style"
DESCRIPTION = "This file contains cmake files to be used by projects that depend on \
qqc2-desktop-style. \
Usually not needed as it is only a runtime dependency."
LICENSE = "GPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-qqc2-desktop-style-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "4addfcaeb17770f69fd82d6ab9d6ba50a846c92f4b907d7f622b9758ce8f0579c03d297d30f7139597f174b7113bc8a59c3adb95410810e4edf97b7160a5fa14"

RPROVIDES:${PN} += "cmake-KF6QQC2DesktopStyle \
kf6-qqc2-desktop-style-devel"

RDEPENDS:${PN} += "kf6-qqc2-desktop-style"

inherit rpm
