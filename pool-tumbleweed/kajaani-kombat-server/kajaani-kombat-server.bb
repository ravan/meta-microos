SUMMARY = "Dedicated server for kajaani-kombat, a remake of the arcade game Rampart"
DESCRIPTION = "A remake of the classis arcade game Rampart, with the change \
of the medieval world to a space-world. \
Playable on one machine but also over the net with 2-4 players (2 players \
may always use the same machine). \
 \
This subpackage includes the server binary."
LICENSE = "GPL-2.0-only"

PV = "0.7"

RPM_NAME = "kajaani-kombat-server-0.7-5.4.aarch64.rpm"
RPM_HASH = "eddd7038f536b99d3d0548c2ee7f2328dfa15a5fdf77becf9b7709b91e57504654a7a779b8b04b1ac1b82a8beda6fceac115c9ed69b8c406b8574c8e807ca143"

RPROVIDES:${PN} += "kajaani-kombat-server"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-net-1.2.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
