SUMMARY = "Microsoft Azure Azurearcdata Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Azurearcdata Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-azure-mgmt-azurearcdata-1.0.1-1.2.noarch.rpm"
RPM_HASH = "f5686955c157f728efaa0f63de8484d5f8f6ef9a832f84f8ea3ee0c6d209bbaa1572998dab6c51fbb6b80fda8a157e17b1e6cfc1fe34e02ed8ff07342ba782fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-azurearcdata \
python3.13dist-azure-mgmt-azurearcdata \
python313-azure-mgmt-azurearcdata \
python3dist-azure-mgmt-azurearcdata"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
