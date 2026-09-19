SUMMARY = "Take actions when specific devices appear/disappear from your LAN"
DESCRIPTION = "lapdog is a service that monitors the presence/absence of the devices \
on your LAN and executes some actions accordingly. \
 \
It pings the devices to discover if they are connected or not. \
And uses their MAC address and not their IP, so it works on networks \
with DHCP."
LICENSE = "GPL-3.0+"

PV = "1.1"

RPM_NAME = "lapdog-1.1-4.9.aarch64.rpm"
RPM_HASH = "1974e543e1f48c4da5917e5a1fbc706f9e094ac1c2c8a27d35c6c6ef249df8abdac589c772b6f934b97924973ab05bef4cda62c4133fecb2c71ccef1f6d638f3"

RPROVIDES:${PN} += "config-lapdog \
lapdog"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liboping.so.0 \
libstdc++.so.6 \
systemd"

inherit rpm
