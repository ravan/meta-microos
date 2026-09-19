SUMMARY = "CLI app for managing GitHub labels"
DESCRIPTION = "CLI app for managing GitHub labels."
LICENSE = "MIT"

PV = "20.1.0"

RPM_NAME = "python314-labels-20.1.0-3.5.noarch.rpm"
RPM_HASH = "301b408835391d9e0a8b5b205e103716cf7ad8e8fbf5bc3472b73b24ac9c9275709a796b0749546074171ff0f0f0bc8870bacb2c7b4fcdf0bc9920b3625f966f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-labels \
python314-labels \
python3dist-labels"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-attrs \
python314-click \
python314-pytoml \
python314-requests"

inherit rpm
