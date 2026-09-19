SUMMARY = "Python API and CLI for OpenStack Masakari"
DESCRIPTION = "Client library for Masakari built on the Masakari API. It provides a Python API \
(the masakariclient module) and a command-line tool (masakari)."
LICENSE = "Apache-2.0"

PV = "8.9.0"

RPM_NAME = "python313-masakariclient-8.9.0-1.1.noarch.rpm"
RPM_HASH = "38263958ee9e0faf537f301ab438a5fe17b5ad86c7bfccf17dd70214b7a1e74b5d32ceefb6cecd3cdb8426b49492db0b57654f6ee62f3f2bd3fcba4252d9da72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-masakariclient \
python3.13dist-python-masakariclient \
python313-masakariclient \
python3dist-python-masakariclient"

RDEPENDS:${PN} += "python-abi \
python313-openstacksdk \
python313-oslo.i18n \
python313-oslo.serialization \
python313-oslo.utils \
python313-pbr"

inherit rpm
