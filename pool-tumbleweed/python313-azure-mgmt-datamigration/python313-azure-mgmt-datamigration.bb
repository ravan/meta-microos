SUMMARY = "Microsoft Azure Data Migration Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Migration Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.1.0"

RPM_NAME = "python313-azure-mgmt-datamigration-10.1.0-1.4.noarch.rpm"
RPM_HASH = "4751f240e9d54dae66f7644c69a46333676fc14cbcd048da0393d62bddd55010c1881b9b581a6dc452e866bb059ccca77298b8b8b6221c5caded2ed37e86f626"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-datamigration \
python3.13dist-azure-mgmt-datamigration \
python313-azure-mgmt-datamigration \
python3dist-azure-mgmt-datamigration"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
