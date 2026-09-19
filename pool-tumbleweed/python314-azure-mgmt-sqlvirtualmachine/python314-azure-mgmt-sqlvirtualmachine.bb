SUMMARY = "Microsoft Azure SQL Virtual Machine Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SQL Virtual Machine Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0b7"

RPM_NAME = "python314-azure-mgmt-sqlvirtualmachine-1.0.0b7-1.1.noarch.rpm"
RPM_HASH = "991e4eba1e6d8116a75afec337ca1fe20db62190bd95389640f04b1922fa05b925e525b5b1575dc2004009753365480124713b9c40870b729e68293b8cb63b52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-sqlvirtualmachine \
python314-azure-mgmt-sqlvirtualmachine \
python3dist-azure-mgmt-sqlvirtualmachine"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
