SUMMARY = "CMake config files for kf6-breeze-icons"
DESCRIPTION = "This package provides CMake config files for projects that wish to ensure \
the Breeze icons are available at build time."
LICENSE = "LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "kf6-breeze-icons-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "e97b4b92eb1553fdf40c841e03732f2745d67e3fde8120ebec2dc2f1f6f0958db3391089fb74572777e7959c7549b24b5d25f17aadb1f527b24903fc0793ee55"

RPROVIDES:${PN} += "cmake-KF6BreezeIcons \
kf6-breeze-icons-devel"

RDEPENDS:${PN} += "kf6-breeze-icons \
libKF6BreezeIcons6"

inherit rpm
