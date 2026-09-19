SUMMARY = "Tools to build stateful firewalls and traffic shaping"
DESCRIPTION = "FireHOL is a language (and a program to run it) which builds stateful firewalls \
from human-readable configuration files. \
 \
FireQOS is a program which sets up traffic shaping from human-readable \
configuration files. \
 \
Both programs abstract away the differences between IPv4 and IPv6, and rules \
for each protocol can be applied as needed."
LICENSE = "GPL-2.0-only"

PV = "3.1.8"

RPM_NAME = "firehol-3.1.8-1.4.noarch.rpm"
RPM_HASH = "f81ae49958f9e99f1d7d20b126fc00ccfc81254b9ac04b2f40dc38a462a1ffe3e38ff366cf97d44ceeaafe2fc53f94b71cb95d758c35b669c7a68ea5324be6ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-firehol \
firehol"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
iprange \
iproute2 \
ipset \
iptables \
iputils \
kmod-compat \
nfacct \
procps \
screen \
tcpdump \
traceroute \
util-linux-systemd"

inherit rpm
