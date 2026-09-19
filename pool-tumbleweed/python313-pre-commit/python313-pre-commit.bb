SUMMARY = "Multi-language pre-commit hooks"
DESCRIPTION = "A framework for managing and maintaining multi-language pre-commit hooks."
LICENSE = "MIT"

PV = "4.6.2"

RPM_NAME = "python313-pre-commit-4.6.2-1.1.noarch.rpm"
RPM_HASH = "932f11adfe7c45f9d35104bb3ad6a8f2adff0b8514b4cfa86c9908ea4e5409b4065fe858ff3cb3dbe6f2c0142fe3ca32fcbc8178ec134d93070be764de7e6d3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pre-commit \
python3.13dist-pre-commit \
python313-pre-commit \
python3dist-pre-commit"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-cfgv \
python313-identify \
python313-nodeenv \
python313-virtualenv \
update-alternatives"

inherit rpm
