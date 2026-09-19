SUMMARY = "Deftly Guide a Rolling Ball through Many Slick 3D Levels"
DESCRIPTION = "Tilt the floor to roll a ball through an obstacle course within the \
given time. If the ball falls or time expires, a ball is lost. \
 \
Collect 100 coins to save your progress and earn an extra ball. \
Red coins are worth 5. Blue coins are worth 10. \
 \
In the grand tradition of Marble Madness and Super Monkey Ball, \
Neverball has you guide a rolling ball through dangerous territory. \
Balance on narrow bridges, navigate mazes, ride moving platforms, \
and dodge pushers and shovers to get to the goal. \
Race against the clock to collect coins to earn extra balls."
LICENSE = "GPL-2.0-or-later"

PV = "1.6+git.20240820"

RPM_NAME = "neverball-1.6+git.20240820-1.2.aarch64.rpm"
RPM_HASH = "40b5991a5a4ef2b03dcdbbad3fb3dfa5181c0278d4e9624dd16c34f7b9597cbd030d4060f98351a36e4b6fa2db2e7c073e6ed9ecc81968386da7d19398d63df5"

RPROVIDES:${PN} += "neverball"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libcurl.so.4 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libvorbisfile.so.3 \
opengl-games-utils"

inherit rpm
