SUMMARY = "Validation library and CLI tool for checking on 'pyprojecttoml'"
DESCRIPTION = "Validation library and CLI tool for checking on 'pyproject.toml' files using JSON Schema"
LICENSE = "BSD-3-Clause & MIT & MPL-2.0"

PV = "0.25"

RPM_NAME = "python314-validate-pyproject-0.25-1.2.noarch.rpm"
RPM_HASH = "2954ad7cc3ade0e4b50ff0013c104bc06a3fbbbdc4dbb8937e2be0b032b4654ca5ab4b9e797f0e282a9eee4f40a34320af2bcb4a285677957e624a0c797d8123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-validate-pyproject \
python314-validate-pyproject \
python3dist-validate-pyproject"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-fastjsonschema"

inherit rpm
