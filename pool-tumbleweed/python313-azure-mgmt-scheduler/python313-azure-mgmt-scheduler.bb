SUMMARY = "Microsoft Azure Scheduler Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Scheduler Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python313-azure-mgmt-scheduler-7.0.0-1.5.noarch.rpm"
RPM_HASH = "b6598aa9278729f22b1446e4756884895851d6ac3230a667bf52d93cec9a96912c88ac86876d1aad37863190c33c10964e0ba0d8a59f3090f2acac5b6b5936fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-scheduler \
python3.13dist-azure-mgmt-scheduler \
python313-azure-mgmt-scheduler \
python3dist-azure-mgmt-scheduler"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-msrest >= 0.7.1 with python313-msrest < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
