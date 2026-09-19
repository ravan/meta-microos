SUMMARY = "Simplified packaging of Python modules"
DESCRIPTION = "Simplified packaging of Python modules"
LICENSE = "BSD-3-Clause"

PV = "3.12.0"

RPM_NAME = "python313-flit-3.12.0-3.5.noarch.rpm"
RPM_HASH = "1653fb3fe9cb7646bc802600d80cc9d3fb22e9619535998f1f471d59e1980d32912a9788731c191d8f5fcd0b23a75b4c323ec3785eab4ce5d5e96c2c79942f6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flit \
python3.13dist-flit \
python313-flit \
python3dist-flit"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-docutils \
python313-flit-core \
python313-pip \
python313-requests \
python313-tomli-w"

inherit rpm
