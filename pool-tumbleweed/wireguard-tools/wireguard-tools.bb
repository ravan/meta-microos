SUMMARY = "WireGuard userspace tools"
DESCRIPTION = "WireGuard is a novel VPN that runs inside the Linux Kernel and uses \
state-of-the-art cryptography (the 'Noise' protocol). It aims to be \
faster, simpler, leaner, and more useful than IPSec, while avoiding \
the massive headache. It intends to be considerably more performant \
than OpenVPN. WireGuard is designed as a general purpose VPN for \
running on embedded interfaces and super computers alike, fit for \
many different circumstances. It runs over UDP. \
 \
This package contains command-line tools to interact with the \
WireGuard kernel module.  Currently, it provides only a single tool: \
 \
wg: set and retrieve configuration of WireGuard interfaces"
LICENSE = "GPL-2.0-only"

PV = "1.0.20260223"

RPM_NAME = "wireguard-tools-1.0.20260223-2.3.aarch64.rpm"
RPM_HASH = "72ae8b80757c6e6e4cd668d968c08e27d3c4d9f01d951eacaae0c8aabf1bbe735b6aea7fb4b38588e1543fccc097d9a38421de8bac454e92f3bfa4542f751f9b"

RPROVIDES:${PN} += "wireguard-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
