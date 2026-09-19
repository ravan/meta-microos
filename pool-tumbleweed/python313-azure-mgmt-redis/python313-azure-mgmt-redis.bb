SUMMARY = "Microsoft Azure Redis Cache Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Redis Cache Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "14.5.0"

RPM_NAME = "python313-azure-mgmt-redis-14.5.0-1.7.noarch.rpm"
RPM_HASH = "d131def498755cd0cbe39d5038e31ccb5831e2d517b7fa73d8f47e892b3c6500618746deb6657284ebda6d3d4b7c649843c3f9c20f5b34fe266698e57f8a7334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-redis \
python3.13dist-azure-mgmt-redis \
python313-azure-mgmt-redis \
python3dist-azure-mgmt-redis"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
