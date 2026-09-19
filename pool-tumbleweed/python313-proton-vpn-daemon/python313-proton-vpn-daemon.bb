SUMMARY = "ProtonVPN daemon package"
DESCRIPTION = "python313-proton-vpn-daemon ontains all daemons that are required for the CLI and GUI App of ProtonVPN"
LICENSE = "GPL-3.0-only"

PV = "0.13.6"

RPM_NAME = "python313-proton-vpn-daemon-0.13.6-1.2.noarch.rpm"
RPM_HASH = "be2c93e54d3e4e049e3a5d01dc9e0d946d1656dbc90d48a736497c9b9e4786f7d091f2562569a8f06c0a73747eea3f561d24c397d39d32b9fa3dabfa61cebf33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-proton-vpn-daemon \
python3.13dist-proton-vpn-daemon \
python313-proton-vpn-daemon \
python3dist-proton-vpn-daemon"

RDEPENDS:${PN} += "python-abi"

inherit rpm
