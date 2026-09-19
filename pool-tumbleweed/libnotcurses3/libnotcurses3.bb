SUMMARY = "Character graphics and TUI library"
DESCRIPTION = "notcurses facilitates the creation of modern TUI programs, making \
full use of Unicode and 24-bit TrueColor. Its API is similar \
to that of NCURSES, but extends that with z-buffering, rendering \
of images and video using ffmpeg, alpha blending, widgets, palette \
fades, resize awareness, and multithreading support. \
 \
This subpackage contains shared library part of libnotcurses."
LICENSE = "Apache-2.0"

PV = "3.0.17"

RPM_NAME = "libnotcurses3-3.0.17-1.6.aarch64.rpm"
RPM_HASH = "6c83da033911cfbe1cbd6381a96866763d16e1eda009fa7b6d83cb0e47e7560b52cdee3eb1eedd8a8ae1845ec030a193beece42bd4bdefee8f5ea8ffc76e4900"

RPROVIDES:${PN} += "libnotcurses.so.3 \
libnotcurses3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavcodec.so.62 \
libavdevice.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libnotcurses-core.so.3 \
libswscale.so.9"

inherit rpm
