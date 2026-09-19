SUMMARY = "Microsoft Azure Alerts Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Alerts Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-azure-mgmt-alertsmanagement-1.0.1-1.2.noarch.rpm"
RPM_HASH = "8b3ea71cad93c6310d215f8be44369c98cd702f5612dda58125c0f92d3810c35ec5a2c49df9bfc0210793ff5348a65f691780aec36cd202b52c97e6f0ab63490"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-alertsmanagement \
python3.13dist-azure-mgmt-alertsmanagement \
python313-azure-mgmt-alertsmanagement \
python3dist-azure-mgmt-alertsmanagement"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
