SUMMARY = "Monitors network traffic and bandwidth usage"
DESCRIPTION = "nload is a console application which monitors network traffic and bandwidth \
usage in real time. It visualizes the in- and outgoing traffic using two graphs \
and provides additional info like total amount of transfered data and min/max \
network usage."
LICENSE = "GPL-2.0+"

PV = "0.7.4"

RPM_NAME = "nload-0.7.4-2.10.aarch64.rpm"
RPM_HASH = "715ba2a85ab3dd3d018c98883fbeefb13fcdc91637a1032a0be2fa32c99d97beff1fc0430ecec564cd3828abd843fae64338657c795fae40e4febbb479c698e5"

RPROVIDES:${PN} += "nload"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libform.so.6 \
libgcc-s.so.1 \
libncurses.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
