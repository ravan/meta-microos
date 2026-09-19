SUMMARY = "Documentation for openconnect"
DESCRIPTION = "This package provides a multi-protocol client for a number of SSL \
VPNs, including Cisco's 'AnyConnect' VPN. \
 \
This packages provides documentation and help files for openconnect."
LICENSE = "LGPL-2.1-or-later"

PV = "9.21"

RPM_NAME = "openconnect-doc-9.21-1.3.noarch.rpm"
RPM_HASH = "683c04c478b4ade7f179f0e30e378503ec673b694e69175ee9af19221062aadc7195a4181d4582d5edf40e6a1047c6ac5023298d310f0c539638eeb82c45a9d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openconnect-doc"

RDEPENDS:${PN} += ""

inherit rpm
