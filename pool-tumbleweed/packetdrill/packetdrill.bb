SUMMARY = "Testing tool for kernel networking stack"
DESCRIPTION = "The packetdrill scripting tool enables quick, precise tests for entire \
TCP/UDP/IPv4/IPv6 network stacks, from the system call layer down to the \
NIC hardware. packetdrill currently works on Linux, FreeBSD, OpenBSD, and \
NetBSD. It can test network stack behavior over physical NICs on a LAN, or \
on a single machine using a tun virtual network device."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "2.0+git.20260514"

RPM_NAME = "packetdrill-2.0+git.20260514-2.2.aarch64.rpm"
RPM_HASH = "61607ffa83e3ee38e09a0a8d1c7e7fd22ce28d841532bb9bb951eb2f97a33c3d79a092524ac196f638022d9c8a63667de58634341869c2d9dbe6e87ea605d53d"

RPROVIDES:${PN} += "packetdrill"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
