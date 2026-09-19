SUMMARY = "Link-Local Multicast Resolution (LLMNR) Daemon"
DESCRIPTION = "llmnrd is a daemon implementing the Link-Local Multicast Name Resolution (LLMNR) \
protocol according to RFC 4795. It uses the Netlink kernel interface. \
 \
llmnrd will respond to name resolution queries sent by Windows clients in \
networks where no DNS server is available. It supports both IPv4 and IPv6."
LICENSE = "GPL-2.0-only"

PV = "0.7"

RPM_NAME = "llmnrd-0.7-5.9.aarch64.rpm"
RPM_HASH = "6c2aca0f22fb6d9693c8414366c9ea69702593043269636ab8428937728427ded976be53df11ab8a841d5724ecce83f0606923c30b1f1a9ce4790316306a4bd8"

RPROVIDES:${PN} += "config-llmnrd \
llmnrd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
