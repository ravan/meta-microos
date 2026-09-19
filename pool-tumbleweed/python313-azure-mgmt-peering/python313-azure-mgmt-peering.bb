SUMMARY = "Microsoft Azure Peering Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Peering Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-azure-mgmt-peering-1.0.1-1.2.noarch.rpm"
RPM_HASH = "fd10eff710b4a71c4a04b57fe9bb21386896f2e51ff4515466b2cf928adcb4f3a17c79c783bf1d33cb9c252c7f4bdc2cf5a8a003ddffd28cdc88e01a6a1c1419"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-peering \
python3.13dist-azure-mgmt-peering \
python313-azure-mgmt-peering \
python3dist-azure-mgmt-peering"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
