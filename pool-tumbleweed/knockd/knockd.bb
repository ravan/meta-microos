SUMMARY = "A port-knocking server"
DESCRIPTION = "It listens to all traffic on an ethernet (or PPP) interface, looking \
for special 'knock' sequences of port-hits. A client (package knock) \
makes these port-hits by sending a TCP (or UDP) packet to a port on the \
server. This port need not be open -- since knockd listens at the \
link-layer level, it sees all traffic even if it's destined for a \
closed port. When the server detects a specific sequence of port-hits, \
it runs a command defined in its configuration file. This can be used \
to open up holes in a firewall for quick access."
LICENSE = "GPL-2.0-or-later"

PV = "0.8"

RPM_NAME = "knockd-0.8-4.7.aarch64.rpm"
RPM_HASH = "f60b013981066b45e19ff882405eabec15c20a93de7500fef7fdf130021dec6d0b706d12e2421e6e120959d073a3f1f377686104f2b07dd7b7e9995e665bc458"

RPROVIDES:${PN} += "config-knockd \
knockd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcap.so.1 \
systemd"

inherit rpm
