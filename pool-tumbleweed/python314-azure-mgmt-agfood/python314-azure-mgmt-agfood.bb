SUMMARY = "Microsoft Azure Agfood Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Agfood Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python314-azure-mgmt-agfood-1.0.0b2-2.9.noarch.rpm"
RPM_HASH = "e480c5e6f01763816e1636f5fafb678248828a0ef25b9a7bcad9fea2c1344164dcc252dcb6fd328099701e27cf1b475fb8cb86d858c855cda699f64f16ad53fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-agfood \
python314-azure-mgmt-agfood \
python3dist-azure-mgmt-agfood"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
