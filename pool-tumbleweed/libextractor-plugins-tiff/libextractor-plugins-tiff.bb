SUMMARY = "The 'tiff' libextractor plugin"
DESCRIPTION = "This package ships the 'tiff' plugin for libextractor."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "libextractor-plugins-tiff-1.14-1.2.aarch64.rpm"
RPM_HASH = "d0aa8fcd734abda4afe945f09c04ad11a0bbd858af4fc39047006b098c42b77e8787ac321b112acc79cdbed781b6a4c7becacb821986a974596e674ebacdfdf8"

RPROVIDES:${PN} += "libextractor-plugins-tiff \
libextractor-tiff.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtiff.so.6"

inherit rpm
