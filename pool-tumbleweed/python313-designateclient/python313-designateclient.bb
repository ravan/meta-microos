SUMMARY = "OpenStack DNS as a Service - Client"
DESCRIPTION = "OpenStack DNS as a Service - Client"
LICENSE = "Apache-2.0"

PV = "7.0.0"

RPM_NAME = "python313-designateclient-7.0.0-1.1.noarch.rpm"
RPM_HASH = "c7a4d8ec7d3dde38a00582626b3ba4e4eb845ea822455b8346c0c6daf61f0e82e7f7e107c0b3f40135a4b82919054ec5bc15952f740d4d37d96d48944a89c26a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-designateclient \
python3.13dist-python-designateclient \
python313-designateclient \
python3dist-python-designateclient"

RDEPENDS:${PN} += "python-abi \
python313-debtcollector \
python313-jsonschema \
python313-keystoneauth1 \
python313-osc-lib \
python313-oslo.serialization \
python313-oslo.utils \
python313-requests"

inherit rpm
