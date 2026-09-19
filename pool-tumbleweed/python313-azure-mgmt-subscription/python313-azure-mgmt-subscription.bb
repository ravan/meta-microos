SUMMARY = "Microsoft Azure Subscription Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Subscription Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "python313-azure-mgmt-subscription-3.1.1-2.9.noarch.rpm"
RPM_HASH = "2598bc3443aa27292914a42e28828e8b04fea1ff32ed42dad365f68bacebccd960771769b2337da1464d09c0f028b1369916ab46a7d1c9cb8caeec37cc8d65f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-subscription \
python3.13dist-azure-mgmt-subscription \
python313-azure-mgmt-subscription \
python3dist-azure-mgmt-subscription"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
