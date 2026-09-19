SUMMARY = "Command line interface for Redmine"
DESCRIPTION = "A command line interface for Redmine."
LICENSE = "CECILL-B"

PV = "1.3.0"

RPM_NAME = "redminecli-1.3.0-1.19.noarch.rpm"
RPM_HASH = "2cf0b2e42664fdc066a24dc45a6b793b0bb59c592e076ad23b4e1815e95281b566b572f2c49dc002b024946e65b102bdfe3868681a920ab6c53f9b018ca654b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-redminecli \
python3dist-redminecli \
redminecli"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-click \
python3-requests"

inherit rpm
