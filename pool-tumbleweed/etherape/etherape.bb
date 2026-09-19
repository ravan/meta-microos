SUMMARY = "A Graphical Network Monitor"
DESCRIPTION = "EtherApe is a graphical network monitor for Unix, modeled after \
etherman. Featuring link layer, IP, and TCP modes, it displays network \
activity graphically. Hosts and links change in size with traffic. \
Various protocols are color coded in the display. It supports ethernet, \
FDDI, token ring, ISDN, PPP, and SLIP devices. It can filter traffic to \
show and can read traffic from a file as well as live from the network."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.22"

RPM_NAME = "etherape-0.9.22-1.4.aarch64.rpm"
RPM_HASH = "807f1a49c60cb4b7dcdbc03ce45ead7bad416f1070c7ecbbf89e7bf416c33b5c85754fe0f8dc2a3bc3f2e22c089fc23e79c6727297c8455ec053ff8399575431"

RPROVIDES:${PN} += "etherape"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpcap.so.1 \
libpopt.so.0 \
xdg-utils"

inherit rpm
