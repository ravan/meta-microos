SUMMARY = "Several Text-Mode Games"
DESCRIPTION = "This package provides these games: arithmetic, atc, \
backgammon, battlestar, bcd, bog, caesar, canfield, cfscores, cribbage, \
fish, fortune, hangman, hunt, mille, monop, morse, number, \
paranoia, pom, ppt, primes, rain, robots, sail, snake, snscore, \
teachgammon, trek, wargames, worm, worms, and wump."
LICENSE = "BSD-3-Clause"

PV = "2.17"

RPM_NAME = "bsd-games-2.17-125.4.aarch64.rpm"
RPM_HASH = "df65b111293556186db8db85e943c021e8cf4e1128db365145f2f01a96ab594e7c404c778b11bd86e1436786f74b4507177e2c4b0e48c65006bfc04c21af037b"

RPROVIDES:${PN} += "bsd-games"

RDEPENDS:${PN} += "/usr/bin/sh \
group-games \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfl.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libncursesw.so.6 \
libstdc++.so.6 \
libtinfo.so.6 \
user-games"

inherit rpm
