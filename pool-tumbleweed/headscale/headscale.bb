SUMMARY = "An open source, self-hosted implementation of the Tailscale control server"
DESCRIPTION = "Headscale aims to implement a self-hosted, open source alternative to the \
Tailscale control server. Headscale's goal is to provide self-hosters and \
hobbyists with an open-source server they can use for their projects and labs. \
It implements a narrow scope, a single Tailnet, suitable for a personal use, or \
a small open-source organisation."
LICENSE = "BSD-3-Clause"

PV = "0.29.3"

RPM_NAME = "headscale-0.29.3-1.1.aarch64.rpm"
RPM_HASH = "8d05cd517b16b95b5ec66114697796fb9f7064eb9cc47f9494f910b55a3c371b1106326bc2d8e2d4149b265eecb7c5b3dfc5cc096a186f23cb2cf491a681d7fb"

RPROVIDES:${PN} += "group-headscale \
headscale \
user-headscale"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
sysuser-shadow"

inherit rpm
