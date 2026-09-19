SUMMARY = "Microsoft Azure Management Groups Client Library"
DESCRIPTION = "This is the Microsoft Azure Management Groups Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-azure-mgmt-managementgroups-2.0.0-1.1.noarch.rpm"
RPM_HASH = "a557fc97e5567a98b50fd3e6dc2875e86978dd77ea39b8b1eb8c436b0257cf0b6f8c6b40a2f23791edb1211d71a5b04c24e4987ab9c311bfcf67c297b86f6c52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-managementgroups \
python3.13dist-azure-mgmt-managementgroups \
python313-azure-mgmt-managementgroups \
python3dist-azure-mgmt-managementgroups"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
