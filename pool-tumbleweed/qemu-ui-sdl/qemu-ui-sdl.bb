SUMMARY = "SDL based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing SDL based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-ui-sdl-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "3d745b28b3e953ae833cab2bef3b3f456a95b40d9e095ac85d8136a7447541019d66bead37caef454318b7be495423ca40e7cbb767d1bd1ad3a68260bb9dd75b"

RPROVIDES:${PN} += "qemu-ui-sdl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libX11.so.6 \
libc.so.6 \
libepoxy.so.0 \
libglib-2.0.so.0 \
libpixman-1.so.0"

inherit rpm
