SUMMARY = "Microsoft Azure Dellstorage Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dellstorage Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-dellstorage-1.0.0-1.4.noarch.rpm"
RPM_HASH = "5c70a6f8bfa194378b6930b570a38acb3339d8b11e9c3dcbfabf804de095d5bff07cea639895fe018f75b84c90f4dc771d2f5a9497e4f28ad0910dd4ad32b3cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-dellstorage \
python3.13dist-azure-mgmt-dellstorage \
python313-azure-mgmt-dellstorage \
python3dist-azure-mgmt-dellstorage"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
