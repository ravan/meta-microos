SUMMARY = "Checks for old string formatting"
DESCRIPTION = "Checks for old string formatting."
LICENSE = "GPL-2.0-only"

PV = "3.0.0"

RPM_NAME = "python313-flake8-pep3101-3.0.0-1.5.noarch.rpm"
RPM_HASH = "4dd5ef2f309921ac88e15c9ff8775cba572d37f212b6401e56ac46da8e4390f373256aec5fc15310fbb6d45f62e145b7dd457364283310fc4e0f7e7c03a391e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-pep3101 \
python3.13dist-flake8-pep3101 \
python313-flake8-pep3101 \
python3dist-flake8-pep3101"

RDEPENDS:${PN} += "python-abi \
python313-flake8"

inherit rpm
