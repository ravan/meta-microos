SUMMARY = "Control NetworkManager via dmenu"
DESCRIPTION = "Small script to manage NetworkManager connections with dmenu instead of \
nm-applet. It can connect to existing NetworkManager wifi or wired connections, \
connect to new wifi connections (requests passphrase if required), connect to \
existing VPN connections, enable/disable networking, launch \
nm-connection-editor GUI."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "nmcli-dmenu-1.0.0-1.26.noarch.rpm"
RPM_HASH = "2a79f5f4b199b36ab2d9414731a446747a119094602be778145318867c3cbadfcb48650a454a6505f853d5fcf7f3341a67c8818bff951553cf9147a51034822f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nmcli-dmenu"

RDEPENDS:${PN} += "/usr/bin/env \
NetworkManager \
dmenu"

inherit rpm
