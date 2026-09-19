SUMMARY = "Microsoft Azure MSI Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MSI Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python313-azure-mgmt-msi-7.1.0-2.4.noarch.rpm"
RPM_HASH = "231659cb44572d2e9b6864b3bc68e2c595cbdd201d20f8f1f5f0b3583c7c6ac2504e35f1cbc41dd88a0f6192ab8970cac6f5bcdfb4927dffef60b47f9ea30969"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-msi \
python3.13dist-azure-mgmt-msi \
python313-azure-mgmt-msi \
python3dist-azure-mgmt-msi"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
