SUMMARY = "Microsoft Azure Graph RBAC Client Library"
DESCRIPTION = "This is the Microsoft Azure Graph RBAC Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.61.2"

RPM_NAME = "python313-azure-graphrbac-0.61.2-1.9.noarch.rpm"
RPM_HASH = "229c31b1f7390f3d1a77b8387ffb54b61e40df5427deca4286f1e506040130ed86f8f0bb0e9944f40be700f049cee306c35bc452a2a0d7821abd2c81ddeb05da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-graphrbac \
python3.13dist-azure-graphrbac \
python313-azure-graphrbac \
python3dist-azure-graphrbac"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-msrestazure >= 0.4.32 with python313-msrestazure < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-msrest"

inherit rpm
