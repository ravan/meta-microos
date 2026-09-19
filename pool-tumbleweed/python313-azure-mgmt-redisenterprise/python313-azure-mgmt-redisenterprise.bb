SUMMARY = "Microsoft Azure Redis Enterprise Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Redis Enterprise Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python313-azure-mgmt-redisenterprise-3.1.0-1.4.noarch.rpm"
RPM_HASH = "d9ce9c56447bf7d205d3ec735baaec3030ed062339e053c6e7a85fb5aa199bef8a838fcf843279ccd9753c7c6c4c183ab769b4718e22e5a55d462f397c8ceb85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-redisenterprise \
python3.13dist-azure-mgmt-redisenterprise \
python313-azure-mgmt-redisenterprise \
python3dist-azure-mgmt-redisenterprise"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-core >= 1.6.0 with python313-azure-core < 2.0.0 \
-python313-msrest >= 0.7.1 with python313-msrest < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
