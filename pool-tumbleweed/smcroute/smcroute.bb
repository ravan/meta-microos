SUMMARY = "Static multicast routing for UNIX"
DESCRIPTION = "SMCRoute is a UNIX/Linux tool to manage and monitor multicast routes. \
It supports both IPv4 and IPv6 multicast routing. \
 \
SMCRoute can be used as an alternative to dynamic multicast routers like \
mrouted or pimd in setups where static multicast routes should be \
maintained and/or no proper IGMP or MLD signaling exists. \
 \
Multicast routes exist in the UNIX kernel as long as a multicast routing \
daemon runs. On Linux, multiple multicast routers can run simultaneously \
using different multicast routing tables."
LICENSE = "GPL-3.0-only"

PV = "2.6.0"

RPM_NAME = "smcroute-2.6.0-1.3.aarch64.rpm"
RPM_HASH = "04aa679c85046b9216b5b0f7c418a7812e6fdd660aa266f70125d5bb92cff2a94bf9f5d9aae008a293bfa13fa31a676edd598a74fa15eb183ca0f8e4cb5ba9b1"

RPROVIDES:${PN} += "config-smcroute \
smcroute"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2"

inherit rpm
