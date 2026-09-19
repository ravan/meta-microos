SUMMARY = "Microsoft Azure Devcenter Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Devcenter Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-azure-mgmt-devcenter-1.1.0-1.9.noarch.rpm"
RPM_HASH = "5e48e13901fa6176b7b89a5f4d07e1ac1b0022cfcac7c509d3aae30b9e0d4c4196588ad9b6ded849507966b9d539cb1eb2a9f6467ec5d8817db5c0019ccf48d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-devcenter \
python3.13dist-azure-mgmt-devcenter \
python313-azure-mgmt-devcenter \
python3dist-azure-mgmt-devcenter"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
