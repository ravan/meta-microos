SUMMARY = "Package compiler and linker metadata toolkit"
DESCRIPTION = "pkgconf is a program which helps to configure compiler and linker flags \
for development frameworks. It is similar to pkg-config from freedesktop.org \
and handles .pc files in a similar manner as pkg-config."
LICENSE = "ISC"

PV = "1.6.3"

RPM_NAME = "mingw32-cross-pkgconf-1.6.3-5.13.aarch64.rpm"
RPM_HASH = "ecdf870c44551b292c6fd92f7fd9a97b238527e0be0a535ae6e9f3bf248210a6890c2498fe9695f697e010248d71c03cea8cc3072cce7e8f5eace9454df67c4e"

RPROVIDES:${PN} += "mingw32-cross-pkg-config \
mingw32-cross-pkgconf \
mingw32-cross-pkgconf-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
mingw32-filesystem \
pkg-config"

inherit rpm
