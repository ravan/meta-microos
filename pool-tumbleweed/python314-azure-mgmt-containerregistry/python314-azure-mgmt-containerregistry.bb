SUMMARY = "Microsoft Azure Container Registry Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Registry Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "15.1.0~b2"

RPM_NAME = "python314-azure-mgmt-containerregistry-15.1.0~b2-1.1.noarch.rpm"
RPM_HASH = "e7dd7c68eaeb2cfec2fc13c6404af0e44c01c270c51c3572ca7614e85f76146f254172e04aa87a1a5f05ad3f90e58fc861b828ac5e0730382b4bcdf9602dba4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-containerregistry \
python314-azure-mgmt-containerregistry \
python3dist-azure-mgmt-containerregistry"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
