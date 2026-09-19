SUMMARY = "Program to hide the mouse cursor when typing"
DESCRIPTION = "xbanish hides the mouse cursor when you start typing, and shows it again when \
the mouse cursor moves or a mouse button is pressed.  This is similar to \
xterm's pointerMode setting, but xbanish works globally in the X11 session. \
 \
unclutter's -keystroke mode is supposed to do this, but it's broken[0].  I \
looked into fixing it, but the unclutter source code is terrible, so I wrote \
xbanish in a few hours. \
 \
The name comes from ratpoison's 'banish' command that sends the cursor to the \
corner of the screen."
LICENSE = "ISC"

PV = "1.8"

RPM_NAME = "xbanish-1.8-1.18.aarch64.rpm"
RPM_HASH = "321cac00787c9d9bbfaa65c6024d5a86367bf26400acc3b069e576c0eba8d58dcf22ce53f3b28628db33dd04ef9a0a2405ec9bbefb70fb7d1900a131bc2e1bb1"

RPROVIDES:${PN} += "xbanish"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libc.so.6"

inherit rpm
