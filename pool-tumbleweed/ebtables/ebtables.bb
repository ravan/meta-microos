SUMMARY = "Ethernet Bridge Tables"
DESCRIPTION = "A firewalling tool to transparently filter network traffic passing a \
bridge. The filtering possibilities are limited to link layer filtering \
and some basic filtering on higher network layers. The ebtables tool \
can be used together with the other Linux filtering tools, like \
iptables. There are no incompatibility issues."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.11"

RPM_NAME = "ebtables-2.0.11-5.19.aarch64.rpm"
RPM_HASH = "1c71a04ed5bfef7af6af0836f3ba8ef4924153f4a891abd14c87ae8b562458856af4dc441886603cf193224ae4a26c2d472c7c05f039d2bd2f96aa8c018a25f7"

RPROVIDES:${PN} += "ebtables"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
alts \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libebtc.so.0 \
libnss-usrfiles2 \
netcfg"

inherit rpm
