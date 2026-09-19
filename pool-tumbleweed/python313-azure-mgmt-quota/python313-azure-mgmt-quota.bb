SUMMARY = "Microsoft Azure Quota Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Quota Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python313-azure-mgmt-quota-3.0.1-1.4.noarch.rpm"
RPM_HASH = "1e1a1c9fd29722ed48d1b4eebec857a83ca73fcafcca22df9cd1227561a30bde49d9663e055f1e9a911e1eb480972064dfebef9c3e4a9a484d1696a14413d794"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-quota \
python3.13dist-azure-mgmt-quota \
python313-azure-mgmt-quota \
python3dist-azure-mgmt-quota"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
