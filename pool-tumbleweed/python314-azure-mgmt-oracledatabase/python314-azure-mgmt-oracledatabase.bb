SUMMARY = "Microsoft Azure Oracledatabase Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Oracledatabase Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python314-azure-mgmt-oracledatabase-3.0.0-1.4.noarch.rpm"
RPM_HASH = "b21e7753332a8286827e048f2a0dbe0b2af928960d742194355dd6e630be4820ddd4e106dc03147a4492e237e515727a87d6ed0a59e7fdc5efc0a0b02ec39938"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-oracledatabase \
python314-azure-mgmt-oracledatabase \
python3dist-azure-mgmt-oracledatabase"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
