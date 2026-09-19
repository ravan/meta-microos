SUMMARY = "Pattern for Cockpit, a web based remote system management interface"
DESCRIPTION = "Packages required to run the Cockpit system management service."
LICENSE = "MIT"

PV = "16.0"

RPM_NAME = "patterns-cockpit-16.0-7.1.aarch64.rpm"
RPM_HASH = "e41f4ca0cc8d27fa1dbe1b949a779312903994cf4abe7c4c8beba49e274004bb3e6883092fdaf7ef6e93dfcb01ecf0cc01019faab24013edd96618cbd9dd316d"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-cockpit \
patterns-cockpit \
patterns-microos-cockpit"

RDEPENDS:${PN} += "cockpit \
cockpit-bootloader \
cockpit-networkmanager \
cockpit-repos \
cockpit-storaged \
cockpit-system \
cockpit-ws \
sudo"

inherit rpm
