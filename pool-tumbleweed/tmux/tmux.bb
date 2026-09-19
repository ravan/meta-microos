SUMMARY = "Terminal multiplexer"
DESCRIPTION = "tmux is a terminal multiplexer: it enables a number of terminals (or windows), \
each running a separate program, to be created, accessed, and controlled from a \
single screen. tmux may be detached from a screen and continue running in the \
background, then later reattached. tmux is intended to be a modern, \
BSD-licensed alternative to programs such as GNU screen. \
 \
tmux uses a client-server model. The server holds multiple sessions and each \
window is a independent entity which may be freely linked to multiple sessions, \
moved between sessions and otherwise manipulated. Each session may be attached \
to (display and accept keyboard input from) multiple clients."
LICENSE = "ISC & BSD-3-Clause & BSD-2-Clause"

PV = "3.7b"

RPM_NAME = "tmux-3.7b-1.2.aarch64.rpm"
RPM_HASH = "7a8582128b1bd68d1e53cc8b0d0ef73439173184119b62d12c2fc8bed5589cbd49c596f2f7aeba31fad3a4f0bbff61e7fdd9463e02a5573392ba9b6d7f794e83"

RPROVIDES:${PN} += "tmux"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libm.so.6 \
libresolv.so.2 \
libsystemd.so.0 \
libtinfo.so.6"

inherit rpm
