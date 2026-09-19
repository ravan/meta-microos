SUMMARY = "IP packet filter administration utilities"
DESCRIPTION = "iptables is used to set up, maintain, and inspect the rule tables of \
the various Netfilter packet filter engines inside the Linux kernel."
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.13"

RPM_NAME = "iptables-1.8.13-1.4.aarch64.rpm"
RPM_HASH = "2d33ff8006c5c55c5691c07b0dd56f5ee4b51954073c699aab9230c11d190d9b032a73da0c80a230f57820da9b90cf8c76f2784538a872ea8866b8f6a2201c3f"

RPROVIDES:${PN} += "iptables"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libip4tc.so.2 \
libip6tc.so.2 \
libmnl.so.0 \
libnftnl.so.11 \
libnss-usrfiles2 \
libxtables.so.12 \
netcfg \
xtables-plugins"

inherit rpm
