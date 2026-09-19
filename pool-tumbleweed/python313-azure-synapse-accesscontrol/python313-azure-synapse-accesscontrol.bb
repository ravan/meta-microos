SUMMARY = "Microsoft Azure Synapse AccessControl Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Synapse AccessControl Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python313-azure-synapse-accesscontrol-0.7.0-3.9.noarch.rpm"
RPM_HASH = "915d90d864fef57f180ec5df63887dbf3de58f69f4680717d6070bc1e15b074f1e97b24fc8a33cc9b61d4247cabdf6f9365a963834c84af6eb68913904f30bd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-synapse-accesscontrol \
python3.13dist-azure-synapse-accesscontrol \
python313-azure-synapse-accesscontrol \
python3dist-azure-synapse-accesscontrol"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-core >= 1.6.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-azure-synapse-nspkg \
python313-msrest"

inherit rpm
