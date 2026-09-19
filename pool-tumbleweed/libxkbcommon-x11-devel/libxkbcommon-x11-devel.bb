SUMMARY = "Development files for the libxkbcommon-x11 library"
DESCRIPTION = "xkbcommon is a keymap handling library, which can parse XKB \
descriptions (e.g. from xkeyboard-config), and use this to help its \
users make sense of their keyboard input. \
 \
This package contains the development headers for the library found \
in libxkbcommon-x11-0."
LICENSE = "MIT"

PV = "1.13.2"

RPM_NAME = "libxkbcommon-x11-devel-1.13.2-1.3.aarch64.rpm"
RPM_HASH = "cb088ce2cece976ee41fa89622f94a6b511cbc22e3d5fdc5cfc26eb1e8c3da75cf834e9900b6ee2950520b0c0700e6117f4e7b5b61544e0d6cff0eb121f8e481"

RPROVIDES:${PN} += "libxkbcommon-x11-devel \
pkgconfig-xkbcommon-x11"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxkbcommon-x11-0 \
pkgconfig-xcb \
pkgconfig-xcb-xkb \
pkgconfig-xkbcommon"

inherit rpm
