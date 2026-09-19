SUMMARY = "Documentation for strongSwan"
DESCRIPTION = "StrongSwan is an IPsec-based VPN solution for Linux. \
 \
This package provides the StrongSwan documentation."
LICENSE = "GPL-2.0-or-later"

PV = "6.1.0"

RPM_NAME = "strongswan-doc-6.1.0-1.1.noarch.rpm"
RPM_HASH = "9ce4586f22e358e74beb93cf45eb9d8c45ec7701be7b49796588925b042874ddc771e964ef778a8ba553e8e9f61dea8d87c527d997f2c9cbbeb65ea94de18f23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "strongswan-doc"

RDEPENDS:${PN} += ""

inherit rpm
