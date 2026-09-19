SUMMARY = "Mesh VPN based on WireGuard"
DESCRIPTION = "NetBird combines a configuration-free peer-to-peer private network and a \
centralized access control system in a single platform, making it easy to \
create secure private networks for your organization or home."
LICENSE = "AGPL-3.0-only & BSD-3-Clause"

PV = "0.78.1"

RPM_NAME = "netbird-0.78.1-1.1.aarch64.rpm"
RPM_HASH = "718912a447b256db364dfe8e1027afafd08fc49011a928ba9ee67527a41b54177160ee7eaa8446c4221a30180c37e78f61ae7d9f742819de707608859f2a3227"

RPROVIDES:${PN} += "netbird"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
