SUMMARY = "Microsoft Azure Managed Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Managed Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python313-azure-mgmt-managedservices-6.0.1-1.2.noarch.rpm"
RPM_HASH = "486c3c8d33ae95aea4e8b05ec752e50c0b37357af0c6bef03fd8d396c3f502a9e3cbc98fccdcff72856ecf44dabc65f64da0ec1cf7f3c46de60b7b4ed23f337e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-managedservices \
python3.13dist-azure-mgmt-managedservices \
python313-azure-mgmt-managedservices \
python3dist-azure-mgmt-managedservices"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
