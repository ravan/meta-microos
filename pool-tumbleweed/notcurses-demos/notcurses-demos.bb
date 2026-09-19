SUMMARY = "Character graphics and TUI library demos"
DESCRIPTION = "notcurses facilitates the creation of modern TUI programs, making \
full use of Unicode and 24-bit TrueColor. Its API is similar \
to that of NCURSES, but extends that with z-buffering, rendering \
of images and video using ffmpeg, alpha blending, widgets, palette \
fades, resize awareness, and multithreading support. \
 \
This subpackage contains the demo binaries for the notcurses \
library."
LICENSE = "Apache-2.0"

PV = "3.0.17"

RPM_NAME = "notcurses-demos-3.0.17-1.6.aarch64.rpm"
RPM_HASH = "1390019b667de978abafd92c2d496b27a037919d9098658f3e0ac7ac64a60fe448f784a4e6c756a0c535ab3d8ab3a933045c7e155e567e182b25021dbcb4ad10"

RPROVIDES:${PN} += "notcurses-demos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdeflate.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libnotcurses++.so.3 \
libnotcurses-core.so.3 \
libnotcurses.so.3 \
libstdc++.so.6 \
libtinfo.so.6 \
libunistring.so.5"

inherit rpm
