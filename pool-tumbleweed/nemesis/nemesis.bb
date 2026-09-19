SUMMARY = "TCP/IP Packet Injection Suite"
DESCRIPTION = "A commandline-based IP stack for Linux. The suite is broken down by \
protocol and allows for scripting of injected packet streams from \
shell scripts. \
 \
Key features: \
 * support for ARP, DNS, ICMP, IGMP, OSPF, RIP, TCP, UDP protocols \
 * layer 2 or layer 3 injection \
 * packet payload from file"
LICENSE = "BSD-4-Clause"

PV = "1.8"

RPM_NAME = "nemesis-1.8-1.17.aarch64.rpm"
RPM_HASH = "3f9ec3f698bf560a75f84841d7820f9a221d581105f1085426b3d8cffa0ddc0cea0cbf039681fbb9e999a53d7676bff4b1b8aa7f329b3aa847c38ce5ba7f2537"

RPROVIDES:${PN} += "nemesis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libnet.so.9"

inherit rpm
