SUMMARY = "Microsoft Azure Web Apps Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Web Apps Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "11.0.1"

RPM_NAME = "python313-azure-mgmt-web-11.0.1-1.1.noarch.rpm"
RPM_HASH = "170ea4ae3c442b8f299af1a3cf74ffb9f2f6ef92a3aef5185779874620510766ba16f6891cdc82d2f67cab10219c9a152a1ff1dc8ec2343c003c3ccecb532554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-web \
python3.13dist-azure-mgmt-web \
python313-azure-mgmt-web \
python3dist-azure-mgmt-web"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
