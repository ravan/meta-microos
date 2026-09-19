SUMMARY = "Helper functions for pytest"
DESCRIPTION = "Helper functions for pytest."
LICENSE = "MIT"

PV = "0.6.6"

RPM_NAME = "python314-coincidence-0.6.6-2.7.noarch.rpm"
RPM_HASH = "04ab2cecd628987f59b728f03d5559a030f590e554d72141de3016c9723c9950c451401889ef8805b2665add7162b0a061082779afaa652963a85fb48b5ded31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-coincidence \
python314-coincidence \
python3dist-coincidence"

RDEPENDS:${PN} += "python-abi \
python314-domdf-python-tools \
python314-pytest \
python314-pytest-regressions \
python314-typing-extensions"

inherit rpm
