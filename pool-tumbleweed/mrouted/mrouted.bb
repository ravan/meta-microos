SUMMARY = "An implementation of the DVMRP multicast routing protocol"
DESCRIPTION = "Mrouted is an implementation of the Distance-Vector Multicast Routing \
Protocol (DVMRP), an earlier version of which is specified in RFC-1075. \
 \
Mrouted turns a UNIX workstation into a DVMRP multicast router with tunnel \
support, in order to cross non-multicast-aware routers.  The tunnels are \
virtual point-to-point, IP-IP tunnel, links between a pair of mrouted routers."
LICENSE = "BSD-3-Clause & BSD-4-Clause"

PV = "4.7"

RPM_NAME = "mrouted-4.7-1.1.aarch64.rpm"
RPM_HASH = "08514ad24cf02cdcf92d77e14b5b59c84deb174f3f331a19f734f38f266035ddfd88889e6aa692e1075d3a84a7f79e203d0e094fa5ef6ae526e87f3a022ed6bf"

RPROVIDES:${PN} += "config-mrouted \
mrouted"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
