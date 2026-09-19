SUMMARY = "A python wrapper library for the network-manager cli client"
DESCRIPTION = " \
nmcli is a python wrapper library for the network-manager cli client."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python314-nmcli-1.8.0-1.1.noarch.rpm"
RPM_HASH = "cac279211be5d478c6e0b4707dd57cccc40a3d4f8bb2ca36e883e54e42faa9fca04f7d067b59bb7f2b71e53d8c41ce9b1c35a18657a318d885f2558f33fe7d76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nmcli \
python314-nmcli \
python3dist-nmcli"

RDEPENDS:${PN} += "NetworkManager \
python-abi"

inherit rpm
