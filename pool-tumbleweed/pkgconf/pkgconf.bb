SUMMARY = "Package compiler and linker metadata toolkit"
DESCRIPTION = "pkgconf is a program which helps to configure compiler and linker flags \
for development frameworks. It is similar to pkg-config from freedesktop.org \
and handles .pc files in a similar manner as pkg-config."
LICENSE = "ISC"

PV = "2.5.1"

RPM_NAME = "pkgconf-2.5.1-1.5.aarch64.rpm"
RPM_HASH = "db4fce9f70f793c24829997fa68125a0c56d49fb9c0a2eb246979ec587a264a534dc8a8cb7dc5bb3fe3646a3baf9da694d3e8cc5a7c9eb4d4e5de4bf291830f6"

RPROVIDES:${PN} += "pkgconf \
pkgconfig-pkgconf \
rpm-macro-pkgconfig-personalitydir"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpkgconf.so.7 \
libpkgconf7"

inherit rpm
