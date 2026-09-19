SUMMARY = "Neighbor Discovery Protocol Proxy Daemon"
DESCRIPTION = "ndppd is a daemon that proxies certain IPv6 NDP messages between two or more \
interfaces. It currently supports proxying Neighbor Solicitation Messages \
and Neighbor Advertisement messages in order to allow IPv6 routing without \
relying on Linux 'proxy_ndp'. \
 \
The daemon is partially compliant with (experimental) RFC4389."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.5.43"

RPM_NAME = "ndppd-0.2.5.43-5.9.aarch64.rpm"
RPM_HASH = "edf21c7c3e5738d9b3478a17744a4550083ddd44eb79cd1ba8f6e7f4000b0e4dbcedc452171bb6b0aeda7eb834d02670cf43ca6157597ab18511e0188be6e5fc"

RPROVIDES:${PN} += "config-ndppd \
ndppd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
systemd"

inherit rpm
