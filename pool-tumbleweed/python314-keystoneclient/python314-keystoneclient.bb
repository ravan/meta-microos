SUMMARY = "Client library for OpenStack Identity API"
DESCRIPTION = "Client library for interacting with Openstack Identity API."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "python314-keystoneclient-6.0.0-1.1.noarch.rpm"
RPM_HASH = "cf555254f0dcf1ac8e45e3b27aca45eedfaaf89cd04320da2bf4daf4c9bd05c0c2de5aee53d65012a2fe1b463e8de5d90033680bd36789463bb5112e64533055"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-keystoneclient \
python314-keystoneclient \
python3dist-python-keystoneclient"

RDEPENDS:${PN} += "python-abi \
python314-debtcollector \
python314-keystoneauth1 \
python314-openstacksdk \
python314-oslo.config \
python314-oslo.i18n \
python314-oslo.serialization \
python314-oslo.utils \
python314-packaging \
python314-requests \
python314-stevedore"

inherit rpm
