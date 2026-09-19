SUMMARY = "Line clipping tool"
DESCRIPTION = "Line clipping: Cohen-Sutherland"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-pylineclip-1.0.0-3.5.noarch.rpm"
RPM_HASH = "b60a1543ff6fbc1bb4bc3dc089df7fbccc5fc539acc80607f45580ec3054e66a002cd7f3aae364291584b197075433a677f1c92dba0bf708c3fbf03b8ab8643c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylineclip \
python3.13dist-pylineclip \
python313-pylineclip \
python3dist-pylineclip"

RDEPENDS:${PN} += "python-abi"

inherit rpm
