SUMMARY = "NetworkManager config file for 'server-like' defaults"
DESCRIPTION = "This package adds a configuration file to disable automatic (DHCP/SLAAC) \
configuration on ethernet devices with no other matching connections. \
 \
This package is intended to be installed by default for server deployments."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.56.1"

RPM_NAME = "NetworkManager-config-server-1.56.1-4.1.noarch.rpm"
RPM_HASH = "d38bdde04a6fc678d535e4ed2837e19ada42c73ddb0786db99fce9d41e4882e42c6cf832559c4448975024dd4e3cb85aa212614cc2d40076ea5677aed830349f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-config-server"

RDEPENDS:${PN} += "NetworkManager"

inherit rpm
