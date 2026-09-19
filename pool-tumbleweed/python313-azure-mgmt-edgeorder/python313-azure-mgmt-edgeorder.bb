SUMMARY = "Microsoft Azure Edgeorder Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Edgeorder Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python313-azure-mgmt-edgeorder-3.0.0-1.1.noarch.rpm"
RPM_HASH = "5ad111c8f764112e4be6717cd40154286b67b2d21ed02b3968741d6a93185bf09760c14b36891e8496fa59df592afd8e7dae19d9c99e088da36dbd36fa442fbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-edgeorder \
python3.13dist-azure-mgmt-edgeorder \
python313-azure-mgmt-edgeorder \
python3dist-azure-mgmt-edgeorder"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
