SUMMARY = "Package compiler and linker metadata toolkit"
DESCRIPTION = "pkgconf is a program which helps to configure compiler and linker flags \
for development frameworks. It is similar to pkg-config from freedesktop.org \
and handles .pc files in a similar manner as pkg-config."
LICENSE = "ISC"

PV = "1.6.3"

RPM_NAME = "mingw64-pkgconf-1.6.3-5.9.noarch.rpm"
RPM_HASH = "98e4815b4a3af8938835840f8cfecd1a75fabe5e65afaaa5f4d4ca6138c2f53ceb2a6444d37841a21a32c7bc475b1787d839af3086376b6ad413fc0ca92fe06e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-lib-pkgconf \
mingw64-libpkgconf-3.dll \
mingw64-pkg-config \
mingw64-pkg-libpkgconf \
mingw64-pkgconf"

RDEPENDS:${PN} += ""

inherit rpm
