SUMMARY = "SDL based audio support for QEMU"
DESCRIPTION = "This package contains a module for SDL based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-audio-sdl-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "abb6bded2f75061090ce67b67091795d22261a746a3df9946d047443d23f7c4491934467962248e89989924ceead49bd01b270a8a128948592c22a49390d49b3"

RPROVIDES:${PN} += "qemu-audio-sdl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6"

inherit rpm
