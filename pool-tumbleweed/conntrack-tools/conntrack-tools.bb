SUMMARY = "Userspace tools for interacting with the Connection Tracking System"
DESCRIPTION = "The conntrack/nfct utilities provide the userspace interface to the \
Netfilter connection tracking, replacing \
/proc/net/ip_conntrack. The tools can be used to search, list, \
inspect and maintain the connection tracking subsystem of the Linux \
kernel."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.9"

RPM_NAME = "conntrack-tools-1.4.9-1.4.aarch64.rpm"
RPM_HASH = "7c193aa0ab3c88f263e3756f20580eb9f3611cf908a981e4da134ffb48b817f1ae0b3f98ba73baf631b6e8aa6d7296f227ca7375b2e179dd8ea4c03c9aa74759"

RPROVIDES:${PN} += "conntrack-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0 \
libnetfilter-conntrack.so.3 \
libnetfilter-cthelper.so.0 \
libnetfilter-cttimeout.so.1"

inherit rpm
