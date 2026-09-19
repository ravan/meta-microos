SUMMARY = "Real-Time Interface Bandwidth Usage"
DESCRIPTION = "iftop does for network usage what top(1) does for CPU usage. It listens \
to network traffic on a named interface and displays a table of current \
bandwidth usage by pairs of hosts. It is handy for explaining why the \
network links slow."
LICENSE = "GPL-2.0-or-later"

PV = "0.99.4"

RPM_NAME = "iftop-0.99.4-12.1.aarch64.rpm"
RPM_HASH = "bf0f9fe75f592cfa1532f8f059a087a8b7355a8a156e1f23caeb911038832e86245aea99e57c0bfceac0cd883269abe4945d6292e3ce2fe336fbcf6ec81199c6"

RPROVIDES:${PN} += "iftop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libpcap.so.1 \
libtinfo.so.6"

inherit rpm
