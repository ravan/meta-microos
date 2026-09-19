SUMMARY = "Official Proton VPN CLI"
DESCRIPTION = "The Proton VPN CLI is intended for every Proton VPN service user."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.7"

RPM_NAME = "proton-vpn-cli-0.1.7-1.2.noarch.rpm"
RPM_HASH = "b9338c7bb1c9955c0ae306d78adaf46e5ad63ac6c7a5af61b9fe2fedeae98e2eaf1dd065f1d0891ae93d8e5d6b13e7e47b6a66893f060a9fac3dd0ace0cef32d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proton-vpn-cli \
python3.13dist-proton-vpn-cli \
python3dist-proton-vpn-cli"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-click \
python3-dbus-fast \
python3-packaging \
python3-proton-core \
python3-proton-keyring-linux \
python3-proton-vpn-api-core \
python3-proton-vpn-daemon \
python3-proton-vpn-local-agent \
python3-tabulate"

inherit rpm
