SUMMARY = "Multiple video game console emulator"
DESCRIPTION = "Mednafen is a command-line-driven multi-system emulator utilizing \
OpenGL and SDL. Mednafen has the ability to remap hotkey functions \
and virtual system inputs to a keyboard, a joystick, or both \
simultaneously. Save states are supported, as is real-time game \
rewinding. Screen snapshots may be taken, in the PNG file format, at \
the press of a button. Mednafen can record audiovisual movies in the \
QuickTime file format, with several different lossless codecs \
supported. \
 \
Nintendo: NES, FDS, Game Boy (Color|Advance), Super Nintendo, Virtual Boy. \
Sega: Master System, Game Gear, Genesis/MegaDrive, Saturn. \
Nec: TurboGrafx-16/PC Engine (CD), SuperGrafx, PC-FX. \
Sony: PlayStation. \
Apple: II/II+. \
Atari: Lynx. \
SNK: Neo Geo Poket (Color). \
Bandai: Wonderswan (Color)."
LICENSE = "GPL-2.0-only"

PV = "1.32.1"

RPM_NAME = "mednafen-1.32.1-1.12.aarch64.rpm"
RPM_HASH = "d41a7ae5efcc02157a8704c48451ad390b97451c23a3f8f1a79814813f01f1fb7bad3fbcad61bf3e410dca3546ab4ce6e66d8bb0959696960be46deba1d5c84a"

RPROVIDES:${PN} += "mednafen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libSDL2-2.0.so.0 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
