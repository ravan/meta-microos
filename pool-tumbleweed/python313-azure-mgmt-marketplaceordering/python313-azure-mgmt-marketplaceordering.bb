SUMMARY = "Microsoft Azure Market Place Ordering Client Library"
DESCRIPTION = "This is the Microsoft Azure Market Place Ordering Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python313-azure-mgmt-marketplaceordering-1.1.1-1.2.noarch.rpm"
RPM_HASH = "b6869553580d2060b99cf970957e16df735adfd5c398544d4e4337b927a86bb80343d6ca0fef9de79028830d49bf80a1888b58732e4584afe69f61df499f35b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-marketplaceordering \
python3.13dist-azure-mgmt-marketplaceordering \
python313-azure-mgmt-marketplaceordering \
python3dist-azure-mgmt-marketplaceordering"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
