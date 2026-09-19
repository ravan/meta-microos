SUMMARY = "ProtonVPN daemon package"
DESCRIPTION = "python314-proton-vpn-daemon ontains all daemons that are required for the CLI and GUI App of ProtonVPN"
LICENSE = "GPL-3.0-only"

PV = "0.13.6"

RPM_NAME = "python314-proton-vpn-daemon-0.13.6-1.2.noarch.rpm"
RPM_HASH = "c8095d50f09879784d5efa143b5329c9db2179d496f809b6e9ef3bd48cbbaa7a3823bfbc856e43f272123d4797480b9caeeb8209f40593a9e2677e9e76f6da5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-proton-vpn-daemon \
python314-proton-vpn-daemon \
python3dist-proton-vpn-daemon"

RDEPENDS:${PN} += "python-abi"

inherit rpm
