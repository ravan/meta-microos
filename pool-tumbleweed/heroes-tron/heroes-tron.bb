SUMMARY = "Game Like Tron and Nibbles Games"
DESCRIPTION = "Heroes is similar to the 'Tron' and 'Nibbles' games of yore, but \
includes many graphical improvements and new game features.  In it, you \
must maneuver a small vehicle around a world and collect powerups while \
avoiding obstacles, your opponents' trails, and even your own trail. \
Several modes of play are available, including 'get-all-the-bonuses', \
death match, and 'squish-the-pedestrians'."
LICENSE = "GPL-2.0-or-later"

PV = "0.21"

RPM_NAME = "heroes-tron-0.21-1.5.aarch64.rpm"
RPM_HASH = "d7dd2a3810eef005312165b47a675ae6b7d345e6b2fdc925af11486f10ea47ce3cefd168244f0182931b0db3a461dc0680c7d764af600550298a5e41b039aace"

RPROVIDES:${PN} += "heroes-tron"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libm.so.6 \
libmvec.so.1"

inherit rpm
