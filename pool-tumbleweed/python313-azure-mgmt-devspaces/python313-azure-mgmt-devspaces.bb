SUMMARY = "Microsoft Azure Dev Spaces Client Library"
DESCRIPTION = "This is the Microsoft Azure Dev Spaces Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python313-azure-mgmt-devspaces-1.0.0b3-2.9.noarch.rpm"
RPM_HASH = "250f60e84e98f84f2c831f73939db2d00c1564a0a4267581f165fc23359c9893ed13c595d6d3f6c3c639cace2ad65945c1a7a50d72edcdbf8f1ea8b30d9e00c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-devspaces \
python3.13dist-azure-mgmt-devspaces \
python313-azure-mgmt-devspaces \
python3dist-azure-mgmt-devspaces"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
