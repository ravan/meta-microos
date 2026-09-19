SUMMARY = "Qt 6 3D development meta package"
DESCRIPTION = "This meta-package requires all the qt6-3d development packages."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3d-devel-6.11.2-1.1.noarch.rpm"
RPM_HASH = "351a97d96ee93106d0ca764f8e221ddf5a3b6793f87a7fb575d2d82df8c6fe24b3a779177ca33261aefb7a89cdc9a64808f75e808a5a9161818a062ad3f08ca2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-3d-devel"

RDEPENDS:${PN} += "cmake-Qt63DAnimation \
cmake-Qt63DCore \
cmake-Qt63DExtras \
cmake-Qt63DInput \
cmake-Qt63DLogic \
cmake-Qt63DQuick \
cmake-Qt63DQuickAnimation \
cmake-Qt63DQuickExtras \
cmake-Qt63DQuickInput \
cmake-Qt63DQuickRender \
cmake-Qt63DQuickScene2D \
cmake-Qt63DQuickScene3D \
cmake-Qt63DRender"

inherit rpm
