SUMMARY = "Tunneling server for IPv6 over UDP through NATs"
DESCRIPTION = "Miredo is an implementation of the 'Teredo: Tunneling IPv6 over UDP \
through NATs' proposed Internet standard (RFC4380). This offers the server \
part of miredo. Most people will need only the client part."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.6"

RPM_NAME = "miredo-server-1.2.6-5.19.aarch64.rpm"
RPM_HASH = "7502741a2021ca3a2bc35ac537cac7b22b23b73853d6fc3bf2aceede26cce0eff2161b0eec53493e4219b4807dc7a9fc312da6730467784574a5e73495669a94"

RPROVIDES:${PN} += "config-miredo-server \
miredo-server"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libteredo.so.5 \
miredo-common \
systemd"

inherit rpm
