SUMMARY = "Client library for OpenStack Identity API"
DESCRIPTION = "Client library for interacting with Openstack Identity API."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "python313-keystoneclient-6.0.0-1.1.noarch.rpm"
RPM_HASH = "71fa94a91ca9df37ffcdf574740727725b2da953d5f42d953ca6962e8c1b3b813b6897d941f97263893eb908ef64fb9eabe5473c51f0f092d54c73636a1b105d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keystoneclient \
python3.13dist-python-keystoneclient \
python313-keystoneclient \
python3dist-python-keystoneclient"

RDEPENDS:${PN} += "python-abi \
python313-debtcollector \
python313-keystoneauth1 \
python313-openstacksdk \
python313-oslo.config \
python313-oslo.i18n \
python313-oslo.serialization \
python313-oslo.utils \
python313-packaging \
python313-requests \
python313-stevedore"

inherit rpm
