SUMMARY = "Microsoft Azure RDBMS Management Client Library"
DESCRIPTION = "This is the Microsoft Azure RDBMS Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.0b17"

RPM_NAME = "python314-azure-mgmt-rdbms-10.2.0b17-2.2.noarch.rpm"
RPM_HASH = "af1991c67e7bc612568b2640c6d926296dd6ae8bebb505fd417b395b6216b06edcc99a5245a128015a939e14dd2c53bc179f2aef1b2cd5a163e3cec2738f461b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-rdbms \
python314-azure-mgmt-rdbms \
python3dist-azure-mgmt-rdbms"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
