SUMMARY = "Network injection and capture"
DESCRIPTION = "Packit (Packet toolkit) is a network auditing tool. It \
can customize, inject, monitor, and manipulate IP traffic. \
By being able to construct nearly all TCP, UDP, ICMP, IP, ARP, \
RARP, and Ethernet header options, Packit can be useful in testing \
firewalls, intrusion detection/prevention systems, port scanning, \
simulating network traffic, and general TCP/IP auditing."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.1"

RPM_NAME = "packit-1.8.1-3.1.aarch64.rpm"
RPM_HASH = "31319820b1c07c932bc4cedb86354326985fe6e74855d5518c32e7e23546baad88ff3662b2c0a8d794284774a359a9d32179416e51e2d7425672432f7c9b650a"

RPROVIDES:${PN} += "packit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnet.so.9 \
libpcap.so.1"

inherit rpm
