SUMMARY = "Client authentication protocol for python-requests"
DESCRIPTION = "Client authentication protocol for python-requests"
LICENSE = "Apache-2.0"

PV = "2.0.5"

RPM_NAME = "python314-edgegrid-python-2.0.5-1.2.noarch.rpm"
RPM_HASH = "e86d315086b3f53d8cd705cc5996ee059012865ef94c21f33a5b19ee7a3acedefbfebe10e459fc4955a873ceb84def0abe85604c82484c82509184b4953f10ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-edgegrid-python \
python314-edgegrid-python \
python3dist-edgegrid-python"

RDEPENDS:${PN} += "python-abi \
python314-requests \
python314-requests-toolbelt"

inherit rpm
