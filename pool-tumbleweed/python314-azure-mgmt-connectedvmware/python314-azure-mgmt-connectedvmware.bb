SUMMARY = "Microsoft Azure Connectedvmware Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Connectedvmware Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python314-azure-mgmt-connectedvmware-1.0.0.0-2.9.noarch.rpm"
RPM_HASH = "761b17e62d6a9ae94d239b75047cda5a683268b521886a07c0ddd7737f3a2a259461c22874863af1be2bda35196158a013026decf9341fafc7b4c3d7f8f7a849"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-connectedvmware \
python314-azure-mgmt-connectedvmware \
python3dist-azure-mgmt-connectedvmware"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
