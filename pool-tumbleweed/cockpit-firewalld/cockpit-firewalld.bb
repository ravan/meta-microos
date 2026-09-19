SUMMARY = "Allows Cockpit access through the firewall"
DESCRIPTION = "This package allows Cockpit access through the firewall"
LICENSE = "LGPL-2.1-or-later & GPL-3.0-or-later & MIT & CC-BY-SA-3.0 & BSD-3-Clause"

PV = "365"

RPM_NAME = "cockpit-firewalld-365-2.1.noarch.rpm"
RPM_HASH = "8ff192b84824be81cfea412c3dafd9fa3fafa65de234f5ad532e3644c1cbe221a7510a8b8bbc007eb4b4e5fdb1231eb22890000d65dcc332cc49966dc03ce4ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-firewalld"

RDEPENDS:${PN} += "/usr/bin/sh \
cockpit-bridge \
firewalld"

inherit rpm
