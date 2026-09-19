SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-azure-mgmt-baremetalinfrastructure-1.0.1-1.2.noarch.rpm"
RPM_HASH = "5ffebc4fc4adf4fa0c5e9f7314314febd3cd38c1d984c03507dd598a9194fe136bad7355ab6851dc50dde30d26c9ff0036689b62dde0208a85a478df69859f41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-baremetalinfrastructure \
python314-azure-mgmt-baremetalinfrastructure \
python3dist-azure-mgmt-baremetalinfrastructure"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
