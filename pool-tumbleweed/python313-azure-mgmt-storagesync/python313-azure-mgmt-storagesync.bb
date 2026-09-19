SUMMARY = "Microsoft Azure Storage Sync Client Library"
DESCRIPTION = "This is the Microsoft Azure Storage Sync Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python313-azure-mgmt-storagesync-2.1.0-1.1.noarch.rpm"
RPM_HASH = "f857d78077c55afe1d098c036c8fe3eefba443102994084bc572e37e49064931f7c57f25dc5a5d5f82df193001b997f596dcf953f1a1fe6733cf952c5080a6bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-storagesync \
python3.13dist-azure-mgmt-storagesync \
python313-azure-mgmt-storagesync \
python3dist-azure-mgmt-storagesync"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
