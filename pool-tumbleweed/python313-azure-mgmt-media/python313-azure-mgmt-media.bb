SUMMARY = "Microsoft Azure Media Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Media Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "10.2.1"

RPM_NAME = "python313-azure-mgmt-media-10.2.1-1.5.noarch.rpm"
RPM_HASH = "336bcbb8eafe698060cebff1d8bfbf57c99227934eb9bdf222fdcb06e77c2f8b69f4e680264c902b6e085b79a31dbe4ccc349636e93a77b8c693e3f48345001e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-media \
python3.13dist-azure-mgmt-media \
python313-azure-mgmt-media \
python3dist-azure-mgmt-media"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
