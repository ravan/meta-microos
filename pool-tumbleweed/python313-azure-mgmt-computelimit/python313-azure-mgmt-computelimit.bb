SUMMARY = "Microsoft Azure Computelimit Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Computelimit Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python313-azure-mgmt-computelimit-1.3.0-1.1.noarch.rpm"
RPM_HASH = "b298f29af2f40fb719de1368408ed242d3db0ad2d6c4f3946554fd51e21c602f1e139c8558b07dc9405627553e1b800709fa17cb497b93f9a8b7edea9f347dd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-computelimit \
python3.13dist-azure-mgmt-computelimit \
python313-azure-mgmt-computelimit \
python3dist-azure-mgmt-computelimit"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
