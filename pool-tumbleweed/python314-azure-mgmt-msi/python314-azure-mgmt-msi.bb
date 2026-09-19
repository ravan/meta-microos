SUMMARY = "Microsoft Azure MSI Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MSI Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python314-azure-mgmt-msi-7.1.0-2.4.noarch.rpm"
RPM_HASH = "9c0a863102419cd1ceca745d1ca6d5b2cd33754350141ef6364279fbdd8159481429b48339ff740557bce7df7bfc38c117dd228492526490fba81be007909e15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-msi \
python314-azure-mgmt-msi \
python3dist-azure-mgmt-msi"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
