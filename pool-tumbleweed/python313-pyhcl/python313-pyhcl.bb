SUMMARY = "HCL configuration parser for python"
DESCRIPTION = "HCL configuration parser for python"
LICENSE = "MPL-2.0"

PV = "0.4.5"

RPM_NAME = "python313-pyhcl-0.4.5-2.5.noarch.rpm"
RPM_HASH = "587f71ff817f30c7645a7dbc6d0c152b9ffffd796ab393f11071d116b03521794b016813dd3d2d2938dc912a179738e3dfe38a6530e0a2d56ef19a90973c0d08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyhcl \
python3.13dist-pyhcl \
python313-pyhcl \
python3dist-pyhcl"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
