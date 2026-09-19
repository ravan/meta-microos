SUMMARY = "Package compiler and linker metadata toolkit"
DESCRIPTION = "pkgconf is a program which helps to configure compiler and linker flags \
for development frameworks. It is similar to pkg-config from freedesktop.org \
and handles .pc files in a similar manner as pkg-config."
LICENSE = "ISC"

PV = "1.6.3"

RPM_NAME = "mingw64-cross-pkgconf-1.6.3-5.13.aarch64.rpm"
RPM_HASH = "09706b352879a63509c64749cd94617356fe65a0df31803baed375ef6f85019c073d2c50b87eeea61bcfe413fa12168fa49db20987fae0b542b21f8b72a35308"

RPROVIDES:${PN} += "mingw64-cross-pkg-config \
mingw64-cross-pkgconf \
mingw64-cross-pkgconf-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
mingw64-filesystem \
pkg-config"

inherit rpm
