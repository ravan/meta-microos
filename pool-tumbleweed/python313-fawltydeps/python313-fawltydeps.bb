SUMMARY = "Find undeclared and unused 3rd-party dependencies in your Python project"
DESCRIPTION = "Find undeclared and unused 3rd-party dependencies in your Python project."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python313-fawltydeps-0.20.0-2.6.noarch.rpm"
RPM_HASH = "8bef6615af21de32e3aeaecce8e52657d0eb7c8aa5d6aaa86ad83b1d89715a9d090b17350ebe0d869d577509b0c88346b646f67567e71c3b3e378886352d12b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fawltydeps \
python3.13dist-fawltydeps \
python313-fawltydeps \
python3dist-fawltydeps"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-PyYAML \
python313-importlib-metadata \
python313-isort \
python313-packaging \
python313-pip-requirements-parser \
python313-pydantic"

inherit rpm
