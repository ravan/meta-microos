SUMMARY = "Microsoft Azure Market Place Ordering Client Library"
DESCRIPTION = "This is the Microsoft Azure Market Place Ordering Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python314-azure-mgmt-marketplaceordering-1.1.1-1.2.noarch.rpm"
RPM_HASH = "a5622d4425902d30483dfb233b304dd3444b21e8f442e050506540b434f274c71efb9dfb43040499fc1d96d024600bb42a8626b591d7446472f165b808580df8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-marketplaceordering \
python314-azure-mgmt-marketplaceordering \
python3dist-azure-mgmt-marketplaceordering"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
