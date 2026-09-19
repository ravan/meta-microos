SUMMARY = "Microsoft Azure Kusto Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Kusto Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python314-azure-mgmt-kusto-4.0.0-1.2.noarch.rpm"
RPM_HASH = "ee2c8de7260b65a303d0feddd6704e98e66d54ce59aa48a75051692e17cf1350b15192d59496513627e5f34eb98734247a2cfd1dc455d77fcd4ae21226d0de13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-kusto \
python314-azure-mgmt-kusto \
python3dist-azure-mgmt-kusto"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
