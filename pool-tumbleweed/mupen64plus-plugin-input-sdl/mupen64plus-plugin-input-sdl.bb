SUMMARY = "SDL Input Plugin for the Mupen64plus Nintendo 64 Emulator"
DESCRIPTION = "This package contains the SDL input plugin for the Mupen64plus Nintendo 64 \
Emulator. It has LIRC Infrared remote control interface and Rumble Pak support."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.0"

RPM_NAME = "mupen64plus-plugin-input-sdl-2.6.0-3.6.aarch64.rpm"
RPM_HASH = "06e28a277b0ea327ca11f8af6356f3e6aff96ae39c3a473db396b989cba4f3bae604d40f81cbd178707727878441bd3e5c5e10a6ce8edda1c59d6f1134b15414"

RPROVIDES:${PN} += "mupen64plus-plugin-input \
mupen64plus-plugin-input-sdl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6"

inherit rpm
