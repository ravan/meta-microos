SUMMARY = "Tunnel–terrain-hybrid ship-based shooter fighting robots"
DESCRIPTION = "The game takes place in a science fiction setting of the Solar System \
where the player is a mercenary and must stop robots infected by an \
alien virus. \
 \
The player controls a flying ship in zero gravity with a six degrees \
of freedom movement scheme. The game features both indoor and outdoor \
environments, made possible with the use of a hybrid engine that \
combines the capabilities of a portal rendering engine with those of \
a flight simulator-like terrain engine. \
 \
There is a single-player campaign mode and an an online multiplayer \
mode where numerous players can compete against each other in \
different game types."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0~git632.c68f6b0"

RPM_NAME = "descent3-1.6.0~git632.c68f6b0-1.13.aarch64.rpm"
RPM_HASH = "5bb5945d930440540445bca8a3443ddd2df417c65e3ca37a24f9de2302c28b3007f0b55317de949c8c51548121c474e7c691a58fd3700c9b17a7816f89d0809e"

RPROVIDES:${PN} += "bundled-stb-image-write \
descent3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL3.so.0 \
libacm.so.1 \
libc.so.6 \
libcpp-httplib.so.0.49 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
