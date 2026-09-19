SUMMARY = "Python API and CLI for OpenStack Mistral"
DESCRIPTION = "Client library for Mistral built on the Mistral API. It provides a Python API \
(the mistralclient module) and a command-line tool (mistral)."
LICENSE = "Apache-2.0"

PV = "6.3.0"

RPM_NAME = "python313-mistralclient-6.3.0-1.1.noarch.rpm"
RPM_HASH = "4f31010dda539132a38220fa2dbe178d065f2582f1914a7f2ba626b935e430004cd9ef3cab22fc5b8a1427cc920592ca90abe3e26e81332be607b2260bd6d137"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mistralclient \
python3.13dist-python-mistralclient \
python313-mistralclient \
python3dist-python-mistralclient"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python313-PyYAML \
python313-cliff \
python313-keystoneclient \
python313-osc-lib \
python313-oslo.i18n \
python313-oslo.utils \
python313-osprofiler \
python313-requests \
python313-stevedore"

inherit rpm
