SUMMARY = "A space invaders-like game using ncurses"
DESCRIPTION = "A Space Invaders type game with text-only graphics."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.1"

RPM_NAME = "ninvaders-0.1.1-4.5.aarch64.rpm"
RPM_HASH = "f818cc87dc9564eb1be7da63235270ca13fc46ccc479a93ce6e03d8bf407b8a963614d4d0f542cedfc892e993bf88b75c294d111b3af8d414409002bb0b66262"

RPROVIDES:${PN} += "ninvaders"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
