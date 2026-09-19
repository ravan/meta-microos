SUMMARY = "Python Parser for VDF Files"
DESCRIPTION = "Library for working with Valve's VDF text format"
LICENSE = "MIT"

PV = "4.0"

RPM_NAME = "python313-vdf-4.0-3.2.noarch.rpm"
RPM_HASH = "eb4212af52656ed89525f4cc3976ec64ca106fc7f70a01aee58bf0c5a7441b1289718ee394aa110b0180d8bcbd921f1d1bb00d098c2ee5302be5d257475b2732"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vdf \
python3.13dist-vdf \
python313-vdf \
python3dist-vdf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
