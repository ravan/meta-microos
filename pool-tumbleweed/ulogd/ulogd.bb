SUMMARY = "Userspace logging for Netfilter"
DESCRIPTION = "ulogd is a userspace logging daemon for netfilter/iptables related \
logging. This includes per-packet logging of security violations, \
per-packet logging for accounting purpose as well as per-flow \
logging."
LICENSE = "GPL-2.0-only"

PV = "2.0.9"

RPM_NAME = "ulogd-2.0.9-1.6.aarch64.rpm"
RPM_HASH = "37a315f61a34f74e0bb0f4f4c24175696d1e6514263313d1bca4b7ee2a94788d1cbc351db1a1ed298e4730373384cffb96991918f5a3642a6030a58d4c49f853"

RPROVIDES:${PN} += "config-ulogd \
group-ulogd \
ulogd \
user-ulogd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0 \
libnetfilter-acct.so.1 \
libnetfilter-conntrack.so.3 \
libnetfilter-log.so.1 \
libnfnetlink.so.0 \
sysuser-shadow"

inherit rpm
