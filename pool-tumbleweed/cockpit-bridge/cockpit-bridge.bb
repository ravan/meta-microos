SUMMARY = "Cockpit bridge server-side component"
DESCRIPTION = "The Cockpit bridge component installed server side and runs commands on the \
system on behalf of the web based user interface."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-or-later & MIT & CC-BY-SA-3.0 & BSD-3-Clause"

PV = "365"

RPM_NAME = "cockpit-bridge-365-2.1.noarch.rpm"
RPM_HASH = "808ec03c6ecfd06f059accf8dc3d7d980333a20e9d52edc8abb77430b5b5382e36ecf1cf834c307d15129f54e711c33c7758886c5ba051ae4d30ed6e610c4dcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-bridge \
python3.13dist-cockpit \
python3dist-cockpit"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
