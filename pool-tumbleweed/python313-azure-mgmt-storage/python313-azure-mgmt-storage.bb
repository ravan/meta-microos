SUMMARY = "Microsoft Azure Storage Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Storage Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "25.1.0"

RPM_NAME = "python313-azure-mgmt-storage-25.1.0-1.1.noarch.rpm"
RPM_HASH = "30c6127fe9477e96179333756dbf80d1edf548d1d7bf4f91feca20e04fd76b9a01b45fe75edc4fcbed649b5e6795b9579c3baa2e6b215b6a9d56e9eb2ea12844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-storage \
python3.13dist-azure-mgmt-storage \
python313-azure-mgmt-storage \
python3dist-azure-mgmt-storage"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
