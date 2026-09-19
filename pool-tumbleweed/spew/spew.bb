SUMMARY = "An I/O performance measurement and load generation tool"
DESCRIPTION = "Spew is used to measure I/O performance of character devices, block devices, \
and regular files. It can also be used to generate high I/O loads to stress \
systems while verifying data integrity. \
 \
Spew is easy to use and is flexible. No configuration files or complicated \
client/server configurations are needed. Spew also generates its own data \
patterns that are designed to make it easy to find and debug data integrity \
problems."
LICENSE = "GPL-2.0-only"

PV = "1.0.8"

RPM_NAME = "spew-1.0.8-5.21.aarch64.rpm"
RPM_HASH = "18a536093c2edb284ba356a08b1c64671b1760f14a659d2db1b4c09c098694e956cc7b58c5aaf03d37de26162eab33483bca7be1332a11e08d47d1f3af66a773"

RPROVIDES:${PN} += "config-spew \
spew"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libncurses.so.6 \
libpopt.so.0 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
