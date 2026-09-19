SUMMARY = "Microsoft Azure Storage Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Storage Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "25.1.0"

RPM_NAME = "python314-azure-mgmt-storage-25.1.0-1.1.noarch.rpm"
RPM_HASH = "e004c0db9ffc91b8b1d92be9f65782216e0e41175b637335775d7ea200ebc4c1144efa962e60362de042eb82bd19f1fcc28b6e3efffaccb5ba21a91bb005f801"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-storage \
python314-azure-mgmt-storage \
python3dist-azure-mgmt-storage"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
