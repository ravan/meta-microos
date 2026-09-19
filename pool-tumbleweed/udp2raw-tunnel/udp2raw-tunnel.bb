SUMMARY = "UDP over TCP/ICMP/UDP tunnel"
DESCRIPTION = "A tunnel which turns UDP traffic into encrypted UDP/FakeTCP/ICMP traffic \
by using raw sockets that can help bypass UDP firewalls (or \
unstable UDP environments)."
LICENSE = "MIT"

PV = "20230206.0"

RPM_NAME = "udp2raw-tunnel-20230206.0-1.3.aarch64.rpm"
RPM_HASH = "a02cee414f1ec3685704b9b38f41e3167b9ddfb41c51a78e8113be5c4d044a2eaa809a0ee328d38dd6719b532c00a5c7a906e0cbf60e3af52db6b92989da2fd0"

RPROVIDES:${PN} += "config-udp2raw-tunnel \
udp2raw-tunnel"

RDEPENDS:${PN} += "iptables \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
