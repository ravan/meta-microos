SUMMARY = "Microsoft Azure Azurearcdata Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Azurearcdata Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-azure-mgmt-azurearcdata-1.0.1-1.2.noarch.rpm"
RPM_HASH = "caa77a04dc56f37fdaa64acae3a386cdce4b212cd1bd257f9111125b5a9c14afc560a30334d500038b0ecd5dc97b905626ad286e5ceddfca4b632f4f123c38b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-azurearcdata \
python314-azure-mgmt-azurearcdata \
python3dist-azure-mgmt-azurearcdata"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
