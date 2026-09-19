SUMMARY = "Microsoft Azure Relay Client Library"
DESCRIPTION = "This is the Microsoft Azure Relay Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-azure-mgmt-relay-2.0.0-1.1.noarch.rpm"
RPM_HASH = "81db54e959b87f591dc6454d2160ed1342c3ab016af6fa00bce4339446b3c7db3788b55505ccf964850d9089c52afece6f729cac818400cfcec800bb4ca66707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-relay \
python3.13dist-azure-mgmt-relay \
python313-azure-mgmt-relay \
python3dist-azure-mgmt-relay"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
