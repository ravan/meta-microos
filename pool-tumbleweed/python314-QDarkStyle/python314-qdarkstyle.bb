SUMMARY = "A dark stylesheet for Python and Qt applications"
DESCRIPTION = "QDarkStyle is a dark stylesheet for Python and Qt applications."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "python314-QDarkStyle-3.2.3-1.2.noarch.rpm"
RPM_HASH = "b0d91b004738392f4795b6d05308b241bbf03359075124af5bb03b5b12f27f79889672750c9155547e0d3001f25c6b659a6df93b6a41dfa346a1a81f7e7b9ce8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-qdarkstyle \
python314-QDarkStyle \
python3dist-qdarkstyle"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-QtPy"

inherit rpm
