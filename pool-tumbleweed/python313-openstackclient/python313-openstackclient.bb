SUMMARY = "OpenStack Command-line Client"
DESCRIPTION = "python-openstackclient is a unified command-line client for the OpenStack APIs. \
It is a thin wrapper to the stock python-*client modules that implement the \
actual REST API client actions."
LICENSE = "Apache-2.0"

PV = "10.3.0"

RPM_NAME = "python313-openstackclient-10.3.0-1.1.noarch.rpm"
RPM_HASH = "7fb7f3032512ac9d52f75bda506c7d68496b0eccdf7f8f910f912938186fe0c51c5580be54c47106d419a7a1a1e1257560226ead80dc213c4ae16fb645c3d88f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openstackclient \
python3.13dist-python-openstackclient \
python313-openstackclient \
python3dist-python-openstackclient"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python313-Babel \
python313-cinderclient \
python313-cliff \
python313-cryptography \
python313-iso8601 \
python313-keystoneclient \
python313-manilaclient \
python313-openstacksdk \
python313-osc-lib \
python313-oslo.i18n \
python313-oslo.utils \
python313-requests \
python313-stevedore"

inherit rpm
