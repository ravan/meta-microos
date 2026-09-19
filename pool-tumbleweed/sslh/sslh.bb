SUMMARY = "SSL/SSH multiplexer"
DESCRIPTION = "sslh lets one accept both HTTPS and SSH connections on the same port. It makes \
it possible to connect to an SSH server on port 443 (e.g. from inside a \
corporate firewall) while still serving HTTPS on that port."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.1"

RPM_NAME = "sslh-2.3.1-1.4.aarch64.rpm"
RPM_HASH = "8cb2e477f306fa0d7eeb5e871229ac6f8872358fc272ac62626f13557e37589ad9b1f6b445b1457c99695c87d375a286418acc7b53274cce0ee28002f737a794"

RPROVIDES:${PN} += "config-sslh \
sslh"

RDEPENDS:${PN} += "/usr/bin/sh \
group-nobody \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libconfig.so.15 \
libpcre2-8.so.0 \
openssh \
openssl \
systemd"

inherit rpm
