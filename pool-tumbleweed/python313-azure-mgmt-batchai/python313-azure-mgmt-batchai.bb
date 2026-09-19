SUMMARY = "Microsoft Azure Batch AI Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch AI Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "7.0.0.0"

RPM_NAME = "python313-azure-mgmt-batchai-7.0.0.0-1.9.noarch.rpm"
RPM_HASH = "c55d4602bc2c85a5aa98e0090df440cb079cc5687032e22d23be66acb7b0097cf299003b9cf51fdbf1b32d18372270606954691ee78dd135af7e8e515d21fdf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-batchai \
python3.13dist-azure-mgmt-batchai \
python313-azure-mgmt-batchai \
python3dist-azure-mgmt-batchai"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
