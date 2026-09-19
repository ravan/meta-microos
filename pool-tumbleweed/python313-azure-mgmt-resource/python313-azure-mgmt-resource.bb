SUMMARY = "Microsoft Azure Resource Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Resource Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "24.0.0"

RPM_NAME = "python313-azure-mgmt-resource-24.0.0-1.5.noarch.rpm"
RPM_HASH = "f8aa986a08aaeab3019bd830f09356d171dd490e0891938c6acf644429c725130e9c7841078eef17e89b81fe9d49c7e4f0e2c75ba396ca82450c2000de0044ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-resource \
python3.13dist-azure-mgmt-resource \
python313-azure-mgmt-resource \
python3dist-azure-mgmt-resource"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
