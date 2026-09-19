SUMMARY = "Userspace utility to access the nf_tables packet filter"
DESCRIPTION = "nf_tables is a firewalling mechanism in the Linux kernel, running \
independently of and parallel to ip_tables, ip6_tables, \
arp_tables and ebtables. nftables is the corresponsing userspace \
frontend. \
 \
The nftables frontend features support for sets and dictionaries of arbitrary \
types, meta data types, atomic incremental and full ruleset updates, and, \
similar to iptables, support for different protocols, access to connection \
tracking and NAT and logging."
LICENSE = "GPL-2.0-only"

PV = "1.1.7"

RPM_NAME = "nftables-1.1.7-1.1.aarch64.rpm"
RPM_HASH = "d53d0f55d810b258454fd7952af81f0b7941e68cec8926115143b85585c1256500f1918ab6d6c578e50933642566dd10edef82cbaf8f7ae5640163678c6979c7"

RPROVIDES:${PN} += "nftables"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libedit.so.0 \
libnftables.so.1"

inherit rpm
