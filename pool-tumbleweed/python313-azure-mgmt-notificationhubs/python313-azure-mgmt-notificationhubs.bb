SUMMARY = "Microsoft Azure Notification Hubs Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Notification Hubs Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python313-azure-mgmt-notificationhubs-8.0.0-3.9.noarch.rpm"
RPM_HASH = "08a512e5fa2f8120830414380560d9ae25d3d54deb7e821ce7d45219a289f88aedf28a975a8174dda8e527e6c352430c07ea08422afff654d97edd4771790ed4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-notificationhubs \
python3.13dist-azure-mgmt-notificationhubs \
python313-azure-mgmt-notificationhubs \
python3dist-azure-mgmt-notificationhubs"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
