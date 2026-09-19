SUMMARY = "Microsoft Azure Kusto Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Kusto Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python313-azure-mgmt-kusto-4.0.0-1.2.noarch.rpm"
RPM_HASH = "6434f467897477e1b0144c049ceb00dc6177c2a70087533b787ce7b88ddb8c24638184d2164ba3a741a362b0e37aa98eeef1421843054deb91fd9093983e3629"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-kusto \
python3.13dist-azure-mgmt-kusto \
python313-azure-mgmt-kusto \
python3dist-azure-mgmt-kusto"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
