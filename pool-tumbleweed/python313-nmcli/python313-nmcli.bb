SUMMARY = "A python wrapper library for the network-manager cli client"
DESCRIPTION = " \
nmcli is a python wrapper library for the network-manager cli client."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python313-nmcli-1.8.0-1.1.noarch.rpm"
RPM_HASH = "b733cc2eb6effcc91b8bd65d1d6ff41512f14fb4140e65840ec00d29303596f6d0804db7d3040e9a6950eb9fa42d50e16e855470fa00dab8aa5452475b0110fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nmcli \
python3.13dist-nmcli \
python313-nmcli \
python3dist-nmcli"

RDEPENDS:${PN} += "NetworkManager \
python-abi"

inherit rpm
