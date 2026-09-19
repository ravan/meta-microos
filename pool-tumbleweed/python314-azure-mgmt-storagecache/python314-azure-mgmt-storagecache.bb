SUMMARY = "Microsoft Azure Storagecache Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Storagecache Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python314-azure-mgmt-storagecache-4.0.0-1.1.noarch.rpm"
RPM_HASH = "edacbd31965daa72879e0148614022061eb17859614014d04ddee8e168937f859f73ea96bb5bcd94b195f22a39a589135b1a4b40741ac9ac60615ebf55a1b717"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-storagecache \
python314-azure-mgmt-storagecache \
python3dist-azure-mgmt-storagecache"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
