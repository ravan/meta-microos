SUMMARY = "Systemd Network Manager"
DESCRIPTION = "systemd-networkd is a system service that manages networks. It detects and \
configures network devices as they appear, as well as manages network addresses \
and routes for any link for which it finds a .network file, see \
systemd.network(5). It can also create virtual network devices based on their \
description given by systemd.netdev(5) files. It may be controlled by \
networkctl(1)."
LICENSE = "LGPL-2.1-or-later"

PV = "261.2"

RPM_NAME = "systemd-networkd-261.2-1.2.aarch64.rpm"
RPM_HASH = "6e115aa556e4eada8ca02694f8bfb56dc64f2b4b3dace16947f886223d947a8ca997378360ff49f666829ea877c9f501f4874463ad8a47681b1b8b6703700972"

RPROVIDES:${PN} += "group-systemd-network \
systemd-network \
systemd-network-/usr/lib/systemd/systemd-networkd \
systemd-networkd \
user-systemd-network"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd-shared-261.2-1.2.so \
systemd \
sysuser-shadow"

inherit rpm
