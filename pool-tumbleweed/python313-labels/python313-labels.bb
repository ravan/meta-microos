SUMMARY = "CLI app for managing GitHub labels"
DESCRIPTION = "CLI app for managing GitHub labels."
LICENSE = "MIT"

PV = "20.1.0"

RPM_NAME = "python313-labels-20.1.0-3.5.noarch.rpm"
RPM_HASH = "6a053cd99f7f63937345cbac4167b8fb1c3b2a3f850d9e0c18c8d4e9f55f604c20b796c179b8767836157a24511a7328410cee37cb4dd9762633c20fd6ac30d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-labels \
python3.13dist-labels \
python313-labels \
python3dist-labels"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-attrs \
python313-click \
python313-pytoml \
python313-requests"

inherit rpm
