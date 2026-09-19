SUMMARY = "Find undeclared and unused 3rd-party dependencies in your Python project"
DESCRIPTION = "Find undeclared and unused 3rd-party dependencies in your Python project."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python311-fawltydeps-0.20.0-2.3.noarch.rpm"
RPM_HASH = "9cda8bf04d4cbc218176517f1eb35bf4fbbff29ff346a3c5d28f7722ed60dc991619165ab60b791c4398ed2fd5e1b8e86258d21114270a0bc41d69194fce7b4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-fawltydeps \
python311-fawltydeps \
python3dist-fawltydeps"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-PyYAML \
python311-importlib-metadata \
python311-isort \
python311-packaging \
python311-pip-requirements-parser \
python311-pydantic"

inherit rpm
