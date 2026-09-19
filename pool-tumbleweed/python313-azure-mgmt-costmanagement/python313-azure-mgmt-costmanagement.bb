SUMMARY = "Microsoft Azure Cost Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cost Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python313-azure-mgmt-costmanagement-5.0.0-1.1.noarch.rpm"
RPM_HASH = "9128d35577da126ad377484cb73086b0ab9da2a99da8cb2092a27714caab0c4141615085ea1338058689e054213af295c54f8587e25afb67178c0dc9265eb99c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-costmanagement \
python3.13dist-azure-mgmt-costmanagement \
python313-azure-mgmt-costmanagement \
python3dist-azure-mgmt-costmanagement"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
