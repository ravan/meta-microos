SUMMARY = "Validation library and CLI tool for checking on 'pyprojecttoml'"
DESCRIPTION = "Validation library and CLI tool for checking on 'pyproject.toml' files using JSON Schema"
LICENSE = "BSD-3-Clause & MIT & MPL-2.0"

PV = "0.25"

RPM_NAME = "python313-validate-pyproject-0.25-1.2.noarch.rpm"
RPM_HASH = "dfa22e61feb48bc743f62a7d0312de3dbf55828ad58966fc5f85c72f068f89e63600a2168a9ab48bd8924dce9c0009cac6fe06bf0905a0d69e7332bb3ac284e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-validate-pyproject \
python3.13dist-validate-pyproject \
python313-validate-pyproject \
python3dist-validate-pyproject"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-fastjsonschema"

inherit rpm
