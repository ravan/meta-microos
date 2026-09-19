SUMMARY = "NUMA Policy Control"
DESCRIPTION = "Control NUMA policy for individual processes. Offer libnuma for \
individual NUMA policy in applications."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.19.27.gc9475de"

RPM_NAME = "libnuma-devel-2.0.19.27.gc9475de-1.3.aarch64.rpm"
RPM_HASH = "b890ec68c93dc888a9c689ae7e9f0296cf8ae89bb5832fc5e78aaa07293b609d0dc724174de1ea5f601f14d11818134ba5dfe87a03eea0854749cfd166d2c94f"

RPROVIDES:${PN} += "libnuma-devel \
pkgconfig-numa"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnuma1"

inherit rpm
