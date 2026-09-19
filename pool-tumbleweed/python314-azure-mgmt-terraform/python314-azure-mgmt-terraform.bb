SUMMARY = "Microsoft Azure Terraform Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Terraform Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-terraform-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "3d8949f828d9aebb3d4ffb68e551ca9e6ad5144c6daedb1bfa9ef7f4a6b27e98567b978fac65640d134df7f85b458e95ff2f2d95327dc199353e9c2f9d405895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-terraform \
python314-azure-mgmt-terraform \
python3dist-azure-mgmt-terraform"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
