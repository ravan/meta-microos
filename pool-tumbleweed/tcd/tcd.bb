SUMMARY = "Ncurses-based CD-DA player"
DESCRIPTION = "tcd is a tiny cd player for a text terminal. It uses ncurses for \
drawing and SDL for playing audio CDs."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.0"

RPM_NAME = "tcd-2.2.0-7.13.aarch64.rpm"
RPM_HASH = "7e44d19423181208ee6e8df5055435af90a0802cf9fbc4bdd9e0e6b6190cb7a443499bf419bc6fe5d0a06b3caa2d0e0cdf138ea12f46c47c6987565eb3eacab8"

RPROVIDES:${PN} += "tcd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
