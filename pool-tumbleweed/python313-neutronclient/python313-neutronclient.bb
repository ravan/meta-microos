SUMMARY = "Python API and CLI for OpenStack Neutron"
DESCRIPTION = "Client library and command line utility for interacting with OpenStack \
Neutron's API."
LICENSE = "Apache-2.0"

PV = "14.0.0"

RPM_NAME = "python313-neutronclient-14.0.0-1.1.noarch.rpm"
RPM_HASH = "bcb6dd128a8a960f66655848d3175df173c235e8437d59be4d50cfd33fbdd8cfeeaa40733b5ce8af7b4a74533b26824d7981ac492216fad1e0529c48e3bff174"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-neutronclient \
python3.13dist-python-neutronclient \
python313-neutronclient \
python3dist-python-neutronclient"

RDEPENDS:${PN} += "python-abi \
python313-Babel \
python313-cliff \
python313-debtcollector \
python313-keystoneauth1 \
python313-netaddr \
python313-osc-lib \
python313-oslo.i18n \
python313-oslo.serialization \
python313-oslo.utils \
python313-pbr \
python313-requests \
python313-simplejson"

inherit rpm
