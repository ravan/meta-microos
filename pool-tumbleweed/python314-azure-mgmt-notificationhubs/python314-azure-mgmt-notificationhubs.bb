SUMMARY = "Microsoft Azure Notification Hubs Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Notification Hubs Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python314-azure-mgmt-notificationhubs-8.0.0-3.9.noarch.rpm"
RPM_HASH = "56fbc76877beffe294160840bee206453f5766ee8ac83d281eda60d666609773681e68f1adea705188da652b28879eef6a0b610c7666267363ec9d005124ec0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-notificationhubs \
python314-azure-mgmt-notificationhubs \
python3dist-azure-mgmt-notificationhubs"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
