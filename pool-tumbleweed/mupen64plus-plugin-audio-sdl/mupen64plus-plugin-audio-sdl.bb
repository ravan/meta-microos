SUMMARY = "SDL Audio Plugin for the Mupen64plus Nintendo 64 Emulator"
DESCRIPTION = "This package contains the SDL audio plugin for the Mupen64plus Nintendo 64 \
Emulator."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.0"

RPM_NAME = "mupen64plus-plugin-audio-sdl-2.6.0-3.6.aarch64.rpm"
RPM_HASH = "be86b44ddb7acdd4b7bc337fd5c15bc9627c5635ae9863de33b18d66b8eab3f43464e5aec328c51067bb0c35852268259ad640fe16a1d3a6b22f66e93ce75f99"

RPROVIDES:${PN} += "mupen64plus-plugin-audio \
mupen64plus-plugin-audio-sdl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libsamplerate.so.0"

inherit rpm
