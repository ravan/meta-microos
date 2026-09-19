SUMMARY = "Player for Atari ST Music Files"
DESCRIPTION = "This package allows you to play music from Atari ST games and demos on \
your PC. \
 \
You can find a comprehensive archive on the World Wide Web at \
http://www.nocrew.org/software/psgplay/tunes/"
LICENSE = "GPL-2.0-or-later"

PV = "0.6"

RPM_NAME = "psgplay-0.6-863.9.aarch64.rpm"
RPM_HASH = "dab8e1b74f83ae9df360e29be9f91560867514ef3ad898deaef6742623f5545bcde27e2a789489a4bf95fa2dbefa39a6620b18ffecb4e96807c61b0cec9b2348"

RPROVIDES:${PN} += "psgplay"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
