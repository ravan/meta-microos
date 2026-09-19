SUMMARY = "Connection tracking daemon"
DESCRIPTION = "conntrackd is the user-space daemon for the Netfilter connection tracking \
system. This daemon synchronizes connection tracking states between several \
replica firewalls."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.9"

RPM_NAME = "conntrackd-1.4.9-1.4.aarch64.rpm"
RPM_HASH = "8f932bb41e4d6d139092b72976c095b19eb47d40e141a860704073aa8562ed02e6d1c9d3ab25e0051881c1b96bab78c98d4ac17876acd7895d5da3e8016b1cd7"

RPROVIDES:${PN} += "conntrack-tools-/usr/sbin/conntrackd \
conntrackd"

RDEPENDS:${PN} += "/usr/bin/sh \
conntrack-tools \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0 \
libnetfilter-conntrack.so.3 \
libnetfilter-cthelper.so.0 \
libnetfilter-queue.so.1 \
libnfnetlink.so.0 \
libsystemd.so.0"

inherit rpm
