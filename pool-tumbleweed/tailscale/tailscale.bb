SUMMARY = "The easiest, most secure way to use WireGuard and 2FA"
DESCRIPTION = "Tailscale is a modern VPN built on top of Wireguard. It works like an overlay \
network between the computers of your networks using NAT traversal."
LICENSE = "BSD-3-Clause"

PV = "1.102.3"

RPM_NAME = "tailscale-1.102.3-1.1.aarch64.rpm"
RPM_HASH = "ba81435dd148f4d04e7331deadd2da609e9cbc8e2d26324372251e51029586e41d8074327066cf86bc25f783b1acb73a6a1fac2f0d86491f24d310791ec75b8e"

RPROVIDES:${PN} += "config-tailscale \
tailscale"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
nftables \
systemd"

inherit rpm
