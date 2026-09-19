SUMMARY = "Microsoft Azure Batch AI Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch AI Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "7.0.0.0"

RPM_NAME = "python314-azure-mgmt-batchai-7.0.0.0-1.9.noarch.rpm"
RPM_HASH = "b5a66b767e25e21710958a77aaac26a01e853f91ff76ed4661b5304764415925c2d51917e69e0ed50f5470c9b951cf877c89c0c1ebba646cbc9c11be08f51029"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-batchai \
python314-azure-mgmt-batchai \
python3dist-azure-mgmt-batchai"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
