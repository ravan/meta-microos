SUMMARY = "Microsoft Azure Dellstorage Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dellstorage Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-dellstorage-1.0.0-1.4.noarch.rpm"
RPM_HASH = "df48f68251fed842ce46fb35b2fbcd41c7ac7051ee9cd3ecf6d9c9a272de03bedf6e8335d2b8850c883c9a4d98094ed56acdda056f5d478fbf8ee8905982a0a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-dellstorage \
python314-azure-mgmt-dellstorage \
python3dist-azure-mgmt-dellstorage"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
