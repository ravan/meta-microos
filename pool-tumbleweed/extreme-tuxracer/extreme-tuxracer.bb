SUMMARY = "Racing game featuring Tux the Linux Penguin"
DESCRIPTION = "Extreme Tux Racer is a racing game featuring Tux \
the Linux Penguin. Extreme Tux Racer continues in the tracks \
of Tux Racer and its forks."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.4"

RPM_NAME = "extreme-tuxracer-0.8.4-1.9.aarch64.rpm"
RPM_HASH = "c6bf32a53e67194d9c924eb7e5e5c4354bf6aeaf86b98c8b0593901552106c007bd7f82755381e2ed359777d771801121d2b6776ea2687730b4d535525cc31dd"

RPROVIDES:${PN} += "extreme-tuxracer"

RDEPENDS:${PN} += "extreme-tuxracer-data \
ld-linux-aarch64.so.1 \
libGLU.so.1 \
libOpenGL.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsfml-audio.so.2.6 \
libsfml-graphics.so.2.6 \
libsfml-system.so.2.6 \
libsfml-window.so.2.6 \
libstdc++.so.6"

inherit rpm
