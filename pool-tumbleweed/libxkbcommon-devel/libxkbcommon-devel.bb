SUMMARY = "Development files for the libxkbcommon library"
DESCRIPTION = "xkbcommon is a keymap handling library, which can parse XKB \
descriptions (e.g. from xkeyboard-config), and use this to help its \
users make sense of their keyboard input. Unfortunately, X11's \
requirements mean this is not actually usable for the X server, but it \
should be perfectly usable for client toolkits, as well as alternative \
windowing systems, compositors and system-level clients such as \
Wayland and kmscon. \
 \
This package contains the development headers for the library found \
in libxkbcommon."
LICENSE = "MIT"

PV = "1.13.2"

RPM_NAME = "libxkbcommon-devel-1.13.2-1.3.aarch64.rpm"
RPM_HASH = "6fc1f729ff9b79e73231d3568c735219608a6cc28ea894df1e7a55463467f37c7156eb82f0e11792c21fede3817d47a36f43a89fff2621d71e6db6a28f1fd868"

RPROVIDES:${PN} += "libxkbcommon-devel \
pkgconfig-xkbcommon"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxkbcommon0"

inherit rpm
