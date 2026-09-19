SUMMARY = "Automatic generated to pep8 checked code"
DESCRIPTION = "Autopep8 is automatic generated to pep8 checked code. \
This is old style tool, wrapped pep8 via subprocess module."
LICENSE = "MIT"

PV = "2.3.2"

RPM_NAME = "python314-autopep8-2.3.2-2.5.noarch.rpm"
RPM_HASH = "b51406aaee1c8aa2a28fc4914732d2ecddc41cc029ff2e18fb13ec36f1a628ad6fa531478a094f0a47c6295f38c45c81512900f940263df74bd8f48bb877905a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-autopep8 \
python314-autopep8 \
python3dist-autopep8"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-pycodestyle"

inherit rpm
