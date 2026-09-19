SUMMARY = "ipdb/pdb statement checker plugin for flake8"
DESCRIPTION = "ipdb/pdb statement checker plugin for flake8"
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "python313-flake8-debugger-4.1.2-3.5.noarch.rpm"
RPM_HASH = "5182a65e7488fc46b233eecec19f5857566b6c1cedbcf34d77a6cf8a1d821fa04d9c18cc9c9218925dac5f62ae38f7552771ddaa07fbc4700ccb263e67b980a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-debugger \
python3.13dist-flake8-debugger \
python313-flake8-debugger \
python3dist-flake8-debugger"

RDEPENDS:${PN} += "python-abi \
python313-flake8 \
python313-pycodestyle"

inherit rpm
