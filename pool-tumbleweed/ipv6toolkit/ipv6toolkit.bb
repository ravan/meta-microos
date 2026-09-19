SUMMARY = "Security assessment and troubleshooting tool for the IPv6 protocols"
DESCRIPTION = "SI6 Networks's IPv6 toolkit is a set of IPv6 security and \
trouble-shooting tools that can send arbitrary IPv6-based \
packets. \
 \
List of tools: \
 * addr6: An IPv6 address analysis and manipulation tool. \
 * flow6: A tool to perform a security asseessment of the IPv6 Flow \
   Label. \
 * frag6: A tool to perform IPv6 fragmentation-based attacks and to \
   perform a security assessment of a number of fragmentation-related \
   aspects. \
 * icmp6: A tool to perform attacks based on ICMPv6 error messages. \
 * jumbo6: A tool to assess potential flaws in the handling of IPv6 \
   Jumbograms. \
 * na6: A tool to send arbitrary Neighbor Advertisement messages. \
 * ni6: A tool to send arbitrary ICMPv6 Node Information messages, \
    and assess possible flaws in the processing of such packets. \
 * ns6: A tool to send arbitrary Neighbor Solicitation messages. \
 * ra6: A tool to send arbitrary Router Advertisement messages. \
 * rd6: A tool to send arbitrary ICMPv6 Redirect messages. \
 * rs6: A tool to send arbitrary Router Solicitation messages. \
 * scan6: An IPv6 address scanning tool. \
 * tcp6: A tool to send arbitrary TCP segments and perform a variety \
   of TCP-based attacks."
LICENSE = "GPL-3.0-or-later"

PV = "2.2"

RPM_NAME = "ipv6toolkit-2.2-1.4.aarch64.rpm"
RPM_HASH = "e717cacc5cc80cf576496505e2a65de61db2c52f98fc15c369045eaed71455dcc9f0471e78ba6257aad76ddf328f301d0486e3c739791f0d8f73745f1af7265f"

RPROVIDES:${PN} += "config-ipv6toolkit \
ipv6toolkit"

RDEPENDS:${PN} += "/usr/bin/perl \
libc.so.6 \
libm.so.6 \
libpcap.so.1"

inherit rpm
