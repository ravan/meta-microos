SUMMARY = "Turn-based role-playing game"
DESCRIPTION = "NetHack is a turn-based role-playing game with complex game mechanics. \
Descent into the Mazes of Menace and retrieve the Amulet of Yendor. Play \
as different character classes, such as fighter, wizard, rogue and others. \
Persist against various monsters and defeat the Wizard of Yendor. \
 \
This package contains the text interface."
LICENSE = "NGPL"

PV = "3.6.7"

RPM_NAME = "nethack-3.6.7-1.4.aarch64.rpm"
RPM_HASH = "b4451ca6e1253d1ae300096047f6a09f0f4c1b5c6ecf3c5454a760590bcd8364220de580e3b2eb153e7d2d7f3f1ce304b1d98c7adf10a4889f2b808eb92ee9e5"

RPROVIDES:${PN} += "config-nethack \
nethack"

RDEPENDS:${PN} += "/usr/bin/sh \
group-games \
gzip \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6 \
permissions \
user-games"

inherit rpm
