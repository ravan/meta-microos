SUMMARY = "Python API and CLI for OpenStack Freezer"
DESCRIPTION = "Client library for Freezer built on the Freezer API. It provides a Python API \
(the freezerclient module) and a command-line tool (freezer)."
LICENSE = "Apache-2.0"

PV = "6.5.0"

RPM_NAME = "python313-freezerclient-6.5.0-1.1.noarch.rpm"
RPM_HASH = "6b29ba5de7713e7b7e48619c04cf91f35e1c65082bb64bddbbf9cca2ed369e9c75b21cc97ee3655f73c276583255c8d4aede111fd93c5179eccd40debe9c98f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-freezerclient \
python3.13dist-python-freezerclient \
python313-freezerclient \
python3dist-python-freezerclient"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python313-cliff \
python313-keystoneauth1 \
python313-osc-lib \
python313-oslo.serialization \
python313-oslo.utils \
python313-pbr"

inherit rpm
