SUMMARY = "Package compiler and linker metadata toolkit"
DESCRIPTION = "pkgconf is a program which helps to configure compiler and linker flags \
for development frameworks. It is similar to pkg-config from freedesktop.org \
and handles .pc files in a similar manner as pkg-config."
LICENSE = "ISC"

PV = "1.6.3"

RPM_NAME = "mingw32-pkgconf-1.6.3-5.9.noarch.rpm"
RPM_HASH = "020df31eb0eee06a60e971e9ad19f83e6e531ef841086b4944bb7ee73a4fd988ed3d43737bed7d73647e8070d662bb13a320321d4bc1d1bb4dd774a7efe84052"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-lib-pkgconf \
mingw32-libpkgconf-3.dll \
mingw32-pkg-config \
mingw32-pkg-libpkgconf \
mingw32-pkgconf"

RDEPENDS:${PN} += ""

inherit rpm
