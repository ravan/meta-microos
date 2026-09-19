SUMMARY = "Flake8 plugin for checking PEP-8 naming conventions"
DESCRIPTION = "Check the PEP-8 naming conventions. \
 \
This module provides a plugin for ``flake8``, the Python code checker. \
 \
(It replaces the plugin ``flint-naming`` for the ``flint`` checker.)"
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "python314-pep8-naming-0.15.1-1.4.noarch.rpm"
RPM_HASH = "b9b37d4f5cbc0b39db15d2bd299c3d74de97a3bc5454ee8d00a6e615b13f72e3ecf43563ca9795080a76fecff2c59a440de2ddd623dc5d331c3d6f665918b586"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pep8-naming \
python314-pep8-naming \
python3dist-pep8-naming"

RDEPENDS:${PN} += "python-abi \
python314-flake8"

inherit rpm
