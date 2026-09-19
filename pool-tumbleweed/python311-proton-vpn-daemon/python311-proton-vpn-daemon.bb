SUMMARY = "ProtonVPN daemon package"
DESCRIPTION = "python311-proton-vpn-daemon ontains all daemons that are required for the CLI and GUI App of ProtonVPN"
LICENSE = "GPL-3.0-only"

PV = "0.13.6"

RPM_NAME = "python311-proton-vpn-daemon-0.13.6-1.1.noarch.rpm"
RPM_HASH = "587036293e61f66f0296501d9bbe9adc76c9dd5a2a9640c444a30b7a5c68098b4404bdc34da10cbe05b75db3a56a05281bdedffa0bdb9c7ed05f566ee896fbf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-proton-vpn-daemon \
python311-proton-vpn-daemon \
python3dist-proton-vpn-daemon"

RDEPENDS:${PN} += "python-abi"

inherit rpm
