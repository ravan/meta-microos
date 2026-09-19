SUMMARY = "Tool to query for a screen region selection"
DESCRIPTION = "slop (Select Operation) queries for a selection from the user and prints \
the region to stdout. It grabs the mouse and turns it into a crosshair, \
lets the user click and drag to make a selection (or click on a window) \
while drawing a pretty box around it, then finally prints the selection's \
dimensions to stdout."
LICENSE = "GPL-3.0-or-later"

PV = "7.7"

RPM_NAME = "slop-7.7-1.6.aarch64.rpm"
RPM_HASH = "ecbf221cf96411a76663e3f057b7c11d040e25e00e0b1e15c900c66bf15fb0729a1c58794cb7fc58d3d8c3275442a755b78710140189542bae16b86ad03ed046"

RPROVIDES:${PN} += "slop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libslopy.so.7.7 \
libstdc++.so.6"

inherit rpm
