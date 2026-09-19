SUMMARY = "Generic Key Manager interface for OpenStack"
DESCRIPTION = "Generic Key Manager interface for OpenStack."
LICENSE = "Apache-2.0"

PV = "5.8.0"

RPM_NAME = "python313-castellan-5.8.0-1.1.noarch.rpm"
RPM_HASH = "9a12a9f4174b9e54ee4c9d3f1964d4422ebea38fb4f941a940e255caccf46cb1caf252eadda80f274a4bfca1feb4404ca1ad345d153230df62dab8f9ee7a6e50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-castellan \
python3.13dist-castellan \
python313-castellan \
python3dist-castellan"

RDEPENDS:${PN} += "python-abi \
python313-barbicanclient \
python313-cryptography \
python313-keystoneauth1 \
python313-oslo.config \
python313-oslo.context \
python313-oslo.i18n \
python313-oslo.log \
python313-oslo.utils \
python313-requests \
python313-stevedore"

inherit rpm
