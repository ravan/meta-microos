SUMMARY = "MinGW Windows compiler for C shared libraries"
DESCRIPTION = "MinGW Windows compiler for C shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw64-libgomp1-16.2.0-1.1.noarch.rpm"
RPM_HASH = "d5fc6d2004a27322a41c78cc1a6a2f51f0528762ade3bb19b3711192caa2ca3844ed09b4618e9eed08b889d305d2a00123d5177f746b5cf0e5b6c2e8285e1396"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-libgomp \
mingw64-libgomp-1.dll \
mingw64-libgomp1"

RDEPENDS:${PN} += "mingw64-libgcc-s-seh-1.dll \
mingw64-libwinpthread-1.dll"

inherit rpm
