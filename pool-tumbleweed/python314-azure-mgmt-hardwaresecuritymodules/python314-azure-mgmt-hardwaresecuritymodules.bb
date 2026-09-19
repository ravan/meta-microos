SUMMARY = "Microsoft Azure Hardwaresecuritymodules Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Hardwaresecuritymodules Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-hardwaresecuritymodules-1.0.0-1.1.noarch.rpm"
RPM_HASH = "8138f071868ce8bac4ec856e9b3d1a79c496eaa029a39f46c5fac90bfca879f39d8f7ec0365f0bed215b557306921438fcf7e59eb44d06a3af48fe66b94c7c34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-hardwaresecuritymodules \
python314-azure-mgmt-hardwaresecuritymodules \
python3dist-azure-mgmt-hardwaresecuritymodules"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
