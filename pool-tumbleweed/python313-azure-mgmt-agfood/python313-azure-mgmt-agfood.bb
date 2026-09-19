SUMMARY = "Microsoft Azure Agfood Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Agfood Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python313-azure-mgmt-agfood-1.0.0b2-2.9.noarch.rpm"
RPM_HASH = "9b0212cdd673e6c73c5c04f48035cf5cd587d9235420abe2ceb922f1be60b1830b999283ebc45fce75e12e3772562d72f2d517806f012cb0bbd2f3fe9f8cd36a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-agfood \
python3.13dist-azure-mgmt-agfood \
python313-azure-mgmt-agfood \
python3dist-azure-mgmt-agfood"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
