SUMMARY = "Microsoft Azure Peering Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Peering Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-azure-mgmt-peering-1.0.1-1.2.noarch.rpm"
RPM_HASH = "cd4a136330fe06f9dfc44132ebf57310bf47bc55d0a614af98c0a4f0e69880b6712d122595e01da50c39bc33bc6b91fac171c6be55807506544895eeb83861e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-peering \
python314-azure-mgmt-peering \
python3dist-azure-mgmt-peering"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
