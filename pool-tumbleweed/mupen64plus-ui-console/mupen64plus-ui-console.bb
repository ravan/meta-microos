SUMMARY = "Command Line Frontend for the Mupen64plus Nintendo 64 Emulator"
DESCRIPTION = "Mupen64Plus is a plugin-based N64 emulator which is capable of accurately \
playing many games. \
 \
This package contains a command line frontend."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.0"

RPM_NAME = "mupen64plus-ui-console-2.6.0-3.6.aarch64.rpm"
RPM_HASH = "c6088dc8af89f687e4d5432ccd0cc0bdb44d5f7879510556b38a704fcda11585fc3f4e4f17b5c23469b03dd662429e6add5a7289d3d293ca20332d272f155806"

RPROVIDES:${PN} += "mupen64plus-ui-console"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libmupen64plus2 \
mupen64plus-plugin-audio \
mupen64plus-plugin-input \
mupen64plus-plugin-rsp \
mupen64plus-plugin-video"

inherit rpm
