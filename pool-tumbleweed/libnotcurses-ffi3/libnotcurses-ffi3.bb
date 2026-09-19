SUMMARY = "Character graphics and TUI library (FFI version)"
DESCRIPTION = "notcurses facilitates the creation of modern TUI programs, making \
full use of Unicode and 24-bit TrueColor. Its API is similar \
to that of NCURSES, but extends that with z-buffering, rendering \
of images and video using ffmpeg, alpha blending, widgets, palette \
fades, resize awareness, and multithreading support. \
 \
This subpackage contains shared library part of libnotcurses (FFI \
version)."
LICENSE = "Apache-2.0"

PV = "3.0.17"

RPM_NAME = "libnotcurses-ffi3-3.0.17-1.6.aarch64.rpm"
RPM_HASH = "543d99a4c78b3535753bfb64eddcf2be803f2551726193afaeec2f15159b58b65dd3a5c5faaba60db7581368e85d7de52f6d593f5a529104871907ffcbfe691f"

RPROVIDES:${PN} += "libnotcurses-ffi.so.3 \
libnotcurses-ffi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnotcurses-core.so.3"

inherit rpm
