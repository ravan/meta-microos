SUMMARY = "Network Traffic Monitor"
DESCRIPTION = "vnStat is a network traffic monitor for Linux that keeps a log of \
daily network traffic for the selected interface(s). vnStat isn't a \
packet sniffer. The traffic information is analyzed from the /proc \
filesystem, so vnStat can be used without root permissions."
LICENSE = "GPL-2.0-only"

PV = "2.13"

RPM_NAME = "vnstat-2.13-1.9.aarch64.rpm"
RPM_HASH = "bfe478667d71e0c5dfdf7deff7667ee103a7ee48f9e98a20fc06995c0cca108f3ffbd6727b97cc78da1cbcad41bcb386bd824cb1639fb2b4342e4a89dffd6470"

RPROVIDES:${PN} += "config-vnstat \
group-vnstat \
user-vnstat \
vnstat"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/killall \
/usr/bin/ls \
/usr/bin/sh \
/usr/bin/su \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsqlite3.so.0"

inherit rpm
