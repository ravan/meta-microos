SUMMARY = "Ncurses based arcade game with only 64 lines of code"
DESCRIPTION = "Ambassador of Pain is a curses based arcade game for Linux/UNIX \
with only 64 lines of sourcecode. \
 \
The goal is to drive the hoovercraft (O) trough the level into \
the 'at' sign (@) and reach as much points as possible by reducing \
the number of moves and don't losing any time. \
Lost lifes (0) can easily be picked up by simply drive over them."
LICENSE = "GPL-2.0-or-later"

PV = "0.6"

RPM_NAME = "aop-0.6-2.20.aarch64.rpm"
RPM_HASH = "7da5b0cd9e7119de6265803a2e07eefb63d9dc7e03a8f7611f9829e78a1a8ec599a745281fcf1a113875c42b206799eddb0963f0c322193c169a04d8cab69842"

RPROVIDES:${PN} += "aop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
