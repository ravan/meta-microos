SUMMARY = "Python module for reading TDMS files produced by LabView"
DESCRIPTION = "NumPy based module for reading TDMS files produced by LabView."
LICENSE = "LGPL-3.0-only"

PV = "1.10.0"

RPM_NAME = "python314-npTDMS-1.10.0-1.3.noarch.rpm"
RPM_HASH = "46070401737a208cf608963d14a9c58c39181972a1c3eb43d848c6dd6b3ad775fbf8412f1cd03073081667c0ce7db03660cecce5f618ebe8e559ed1c73a9e413"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nptdms \
python314-npTDMS \
python3dist-nptdms"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-numpy \
update-alternatives"

inherit rpm
