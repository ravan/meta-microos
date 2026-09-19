SUMMARY = "After trial comes virtue. A test runner for good"
DESCRIPTION = "After trial comes virtue. A test runner for good."
LICENSE = "MIT"

PV = "2025.7.1"

RPM_NAME = "python314-virtue-2025.7.1-2.6.noarch.rpm"
RPM_HASH = "e1fec14ba9ccc8a666321ecc180a165d72582bc0f057fb5ed56080fde8f7bd7631582b210af37f1aed138ebba15cad07fc6919a6dd7228b87b5af07d3c9a3c7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-virtue \
python314-virtue \
python3dist-virtue"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Twisted \
python314-attrs \
python314-click \
python314-colorama \
python314-pyrsistent"

inherit rpm
