SUMMARY = "Character graphics and TUI library"
DESCRIPTION = "notcurses facilitates the creation of modern TUI programs, making \
full use of Unicode and 24-bit TrueColor. Its API is similar \
to that of NCURSES, but extends that with z-buffering, rendering \
of images and video using ffmpeg, alpha blending, widgets, palette \
fades, resize awareness, and multithreading support. \
 \
This subpackage contains shared library part of libnotcurses++."
LICENSE = "Apache-2.0"

PV = "3.0.17"

RPM_NAME = "libnotcurses++3-3.0.17-1.6.aarch64.rpm"
RPM_HASH = "514d3967afe834b8e0f2b78141397fc5fec797dac11327dd4e01b52e700d1b732c0ee0693e468908b6101b23149eb59e4bf0c4d143b6e7dc2a7774ee5961ac00"

RPROVIDES:${PN} += "libnotcurses++.so.3 \
libnotcurses++3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnotcurses-core.so.3 \
libnotcurses.so.3 \
libstdc++.so.6"

inherit rpm
