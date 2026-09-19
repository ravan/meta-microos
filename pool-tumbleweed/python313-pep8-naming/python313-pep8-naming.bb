SUMMARY = "Flake8 plugin for checking PEP-8 naming conventions"
DESCRIPTION = "Check the PEP-8 naming conventions. \
 \
This module provides a plugin for ``flake8``, the Python code checker. \
 \
(It replaces the plugin ``flint-naming`` for the ``flint`` checker.)"
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "python313-pep8-naming-0.15.1-1.4.noarch.rpm"
RPM_HASH = "3ea4454670aaadd8973a968ac461e3f0806653db35126a22214181f4a34e874ce94588e51714bab56588ebf18f6ca927f47ca4b393364bdf6bd7ad1ca51f33f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pep8-naming \
python3.13dist-pep8-naming \
python313-pep8-naming \
python3dist-pep8-naming"

RDEPENDS:${PN} += "python-abi \
python313-flake8"

inherit rpm
