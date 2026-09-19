SUMMARY = "Orderly set"
DESCRIPTION = "Orderly set"
LICENSE = "MIT"

PV = "5.5.0"

RPM_NAME = "python313-orderly-set-5.5.0-1.2.noarch.rpm"
RPM_HASH = "e8bc1c5b32ade9612b67bb8ea9b46ac1912dbc73fa80d639f132589cc2c39cddda2c87a59aa3ef87b869b6d3e33ef02ab355f0017592b858373a4471a9a6ee41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-orderly-set \
python3.13dist-orderly-set \
python313-orderly-set \
python3dist-orderly-set"

RDEPENDS:${PN} += "python-abi"

inherit rpm
