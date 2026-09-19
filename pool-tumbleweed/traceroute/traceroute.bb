SUMMARY = "Packet route path tracing utility"
DESCRIPTION = "Traceroute tracks the route packets taken from an IP network on their way to a given host. \
It utilizes the IP protocol's time to live (TTL) field and attempts to elicit an ICMP TIME_EXCEEDED \
response from each gateway along the path to the host."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.6"

RPM_NAME = "traceroute-2.1.6-1.5.aarch64.rpm"
RPM_HASH = "1de0e404ca29a8654a1813271efe2da4b194414e905fd8ee1e23696241112130f498f2f954adb780e140987f5695cff1aa97877a2750a2765e7b419dff1797a1"

RPROVIDES:${PN} += "net-tools-/usr/sbin/traceroute \
tcptraceroute \
traceroute"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
