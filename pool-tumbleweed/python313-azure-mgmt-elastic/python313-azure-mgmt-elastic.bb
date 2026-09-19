SUMMARY = "Microsoft Azure Elastic Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Elastic Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-azure-mgmt-elastic-2.0.0-1.4.noarch.rpm"
RPM_HASH = "9ecf4ba527db2e0110ae84cd661205c1aae923a90a9a631c1769706209e3d0d5a0dd105866bcd4f2ee2880ca573f4b00eae3e9322aa3bbf9fb799a26af99c8ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-elastic \
python3.13dist-azure-mgmt-elastic \
python313-azure-mgmt-elastic \
python3dist-azure-mgmt-elastic"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-msrest >= 0.7.1 with python313-msrest < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
