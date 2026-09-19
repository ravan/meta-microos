SUMMARY = "Client Library for OpenStack Share API"
DESCRIPTION = "Client library and command line utility for interacting with Openstack \
Share API."
LICENSE = "Apache-2.0"

PV = "6.3.0"

RPM_NAME = "python313-manilaclient-6.3.0-1.1.noarch.rpm"
RPM_HASH = "1a6d32decfe63cae3438814559fd2d32fc83c85366dd319e3753bd882cc4a46644db71a257176a8f534e741b641fa918de81e6a93bfa96c5139c2a37742ac23d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-manilaclient \
python3.13dist-python-manilaclient \
python313-manilaclient \
python3dist-python-manilaclient"

RDEPENDS:${PN} += "python-abi \
python313-Babel \
python313-PrettyTable \
python313-debtcollector \
python313-keystoneclient \
python313-osc-lib \
python313-oslo.config \
python313-oslo.log \
python313-oslo.serialization \
python313-oslo.utils \
python313-requests \
python313-simplejson"

inherit rpm
