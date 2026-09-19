SUMMARY = "Microsoft Azure Key Vault Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Key Vault Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "14.0.1"

RPM_NAME = "python313-azure-mgmt-keyvault-14.0.1-1.3.noarch.rpm"
RPM_HASH = "6a1380587fbe87309a3aab7ac3c2c05f8cc039965f37f0b4b20d5d392ba1b41a3f4a036ddf5e895afaeb46667d66e1dcf6897e658613894b25261f3603950f45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-keyvault \
python3.13dist-azure-mgmt-keyvault \
python313-azure-mgmt-keyvault \
python3dist-azure-mgmt-keyvault"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
