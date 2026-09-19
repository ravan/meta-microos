SUMMARY = "Character graphics and TUI library"
DESCRIPTION = "notcurses facilitates the creation of modern TUI programs, making \
full use of Unicode and 24-bit TrueColor. Its API is similar \
to that of NCURSES, but extends that with z-buffering, rendering \
of images and video using ffmpeg, alpha blending, widgets, palette \
fades, resize awareness, and multithreading support. \
 \
This subpackage contains shared library part of libnotcurses-core."
LICENSE = "Apache-2.0"

PV = "3.0.17"

RPM_NAME = "libnotcurses-core3-3.0.17-1.6.aarch64.rpm"
RPM_HASH = "dba73a836205d8bb6aba4e8be0f56d0bbee95f1094104bc2d79423f7fb67c14013e06ce7fdab3d176f9ef96020d29578fe4c9211eb2038916db9cd5ab7b8d068"

RPROVIDES:${PN} += "libnotcurses-core.so.3 \
libnotcurses-core3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdeflate.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libqrcodegen.so.1 \
libtinfo.so.6 \
libunistring.so.5"

inherit rpm
