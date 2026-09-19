SUMMARY = "Microsoft Azure ManagementPartner Management Client Library"
DESCRIPTION = "This is the Microsoft Azure ManagementPartner Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-azure-mgmt-managementpartner-1.0.1-1.2.noarch.rpm"
RPM_HASH = "836544751359893e3a1fcf5eaa7a0c8f873ccde78ffd8ee499bbf861501ff04158346458b4185c014d3f472e56ef6949f52aec93ce155936280da166e69c7163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-managementpartner \
python3.13dist-azure-mgmt-managementpartner \
python313-azure-mgmt-managementpartner \
python3dist-azure-mgmt-managementpartner"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
