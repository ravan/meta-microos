SUMMARY = "Microsoft Azure Service Fabric Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Fabric Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python314-azure-mgmt-servicefabric-2.1.0-2.9.noarch.rpm"
RPM_HASH = "be5c4bd178124ec97a1978813d4aeef90def8012384d9fd47324efd861419779c511d434645be862e7df83c06a7c34029cdc8d2749eb143b18a4fa823c200aa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-servicefabric \
python314-azure-mgmt-servicefabric \
python3dist-azure-mgmt-servicefabric"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
