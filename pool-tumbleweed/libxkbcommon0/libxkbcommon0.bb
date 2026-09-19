SUMMARY = "Library for handling xkb descriptions"
DESCRIPTION = "xkbcommon is a keymap handling library, which can parse XKB \
descriptions (e.g. from xkeyboard-config), and use this to help its \
users make sense of their keyboard input. Unfortunately, X11's \
requirements mean this is not actually usable for the X server, but it \
should be perfectly usable for client toolkits, as well as alternative \
windowing systems, compositors and system-level clients such as \
Wayland and kmscon."
LICENSE = "MIT"

PV = "1.13.2"

RPM_NAME = "libxkbcommon0-1.13.2-1.3.aarch64.rpm"
RPM_HASH = "c741df89d565fbdfb815394fea3b6eef8604f9ec5413953308af5d04c1c731f0144a8c446a697341b2b9d039ca85cb6950406892509e35238567e6c5ce2d97b6"

RPROVIDES:${PN} += "libxkbcommon.so.0 \
libxkbcommon0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
xkeyboard-config"

inherit rpm
