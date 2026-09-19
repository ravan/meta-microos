SUMMARY = "Flexible python implementation of red black trees"
DESCRIPTION = "Flexible python implementation of red black trees"
LICENSE = "MIT"

PV = "1.22"

RPM_NAME = "python313-red-black-tree-mod-1.22-2.9.noarch.rpm"
RPM_HASH = "dfdb06a90a6fd7ee01654bff7f270e2ffca9bf6ffb1b8152d64c18d7fa3b78ea0336065c648d31d71d5731ab8fbaff87fcda31c74feb2c5640f363781cdb9119"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-red-black-tree-mod \
python3.13dist-red-black-tree-mod \
python313-red-black-tree-mod \
python3dist-red-black-tree-mod"

RDEPENDS:${PN} += "python-abi"

inherit rpm
