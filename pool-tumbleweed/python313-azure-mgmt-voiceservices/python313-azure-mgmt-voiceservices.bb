SUMMARY = "Microsoft Azure Voiceservices Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Voiceservices Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-voiceservices-1.0.0-2.9.noarch.rpm"
RPM_HASH = "7178ce3e847b8dcb755c3c1066b0903adb4347bab486913679c5ec8eb26612262815664209f778dd64ed43f71eb7804ba3dcc955db548961759e985502614495"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-voiceservices \
python3.13dist-azure-mgmt-voiceservices \
python313-azure-mgmt-voiceservices \
python3dist-azure-mgmt-voiceservices"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
