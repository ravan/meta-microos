SUMMARY = "Microsoft Azure Mixed Reality Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Mixed Reality Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python314-azure-mgmt-mixedreality-1.0.0b1-4.9.noarch.rpm"
RPM_HASH = "426fec925a04948c8a4a7a74ca16313782fcc551fc7bf2521b2f096a55f720803ff068169b9ed30999d8389ec9e8a480936b18ee71c992a7daff6b8c14fa22cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-mixedreality \
python314-azure-mgmt-mixedreality \
python3dist-azure-mgmt-mixedreality"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.2.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
