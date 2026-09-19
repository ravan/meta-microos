SUMMARY = "MinGW Windows compiler for C shared libraries"
DESCRIPTION = "MinGW Windows compiler for C shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw64-libssp0-16.2.0-1.1.noarch.rpm"
RPM_HASH = "9f96f260fa62abea16f0c10033f33ed66b15060f416894e42cc75bbe5e54922857ea6b198d3bab5b3f20ebed6c38f0b67c45eb03ea69f6875d235060c20f9c5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-libssp \
mingw64-libssp-0.dll \
mingw64-libssp0"

RDEPENDS:${PN} += ""

inherit rpm
