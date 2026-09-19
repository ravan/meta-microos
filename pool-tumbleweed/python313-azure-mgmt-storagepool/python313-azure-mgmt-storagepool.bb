SUMMARY = "Microsoft Azure Storagepool Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Storagepool Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-storagepool-1.0.0-3.9.noarch.rpm"
RPM_HASH = "96a2858df4fba2e27ae176ade82d50c06fcf752ce14c5bf6faa75c13948a725e25c2d8694c12799228f4f1ded41211e023e876adeee4653bdb88681f67280265"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-storagepool \
python3.13dist-azure-mgmt-storagepool \
python313-azure-mgmt-storagepool \
python3dist-azure-mgmt-storagepool"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.2.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
