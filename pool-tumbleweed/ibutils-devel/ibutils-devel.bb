SUMMARY = "SDK for OpenIB Mellanox InfiniBand Diagnostic Tools"
DESCRIPTION = "ibutils provides IB network and path diagnostics."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.5.7.0.2"

RPM_NAME = "ibutils-devel-1.5.7.0.2-12.9.aarch64.rpm"
RPM_HASH = "3c9b7e558a63d4beb91311a76f65b326bec22407f9fe1852711cdf445dfde3114adf7a51d927053964c0285bd4dd73e99c1d738ec87169851bff659ceec019d3"

RPROVIDES:${PN} += "ibutils-devel"

RDEPENDS:${PN} += "ibutils \
libibdm1"

inherit rpm
