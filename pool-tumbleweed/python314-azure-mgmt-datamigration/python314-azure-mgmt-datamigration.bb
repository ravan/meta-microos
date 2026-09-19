SUMMARY = "Microsoft Azure Data Migration Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Migration Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.1.0"

RPM_NAME = "python314-azure-mgmt-datamigration-10.1.0-1.4.noarch.rpm"
RPM_HASH = "38bb3eae05755629371f826131bdb6e4f7ef0ccd0d9c8f528815be4baaedb53704624b98ec7a80859ffaa10df2968f472e09b108be51fc69d5a01096deefc31a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-datamigration \
python314-azure-mgmt-datamigration \
python3dist-azure-mgmt-datamigration"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
