SUMMARY = "Web based remote system management"
DESCRIPTION = "Packages required to run the Cockpit system management service."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-cockpit-5.0-111.1.aarch64.rpm"
RPM_HASH = "a74e5e1977ad8819b52ca25c5200ab426888ff3c9b6523a84dd12e4a6e021009e12443bcd95dd196eeb0d4cfd5c5cab3200fb9ee060d8e5ca025bae93417a57a"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-cockpit"

RDEPENDS:${PN} += "cockpit-networkmanager \
cockpit-system \
cockpit-ws"

inherit rpm
