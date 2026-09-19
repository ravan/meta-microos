SUMMARY = "Microsoft Azure Trustedsigning Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Trustedsigning Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-azure-mgmt-trustedsigning-1.0.1-1.2.noarch.rpm"
RPM_HASH = "7db27feb70251740b89828d80e7d8cc40d81f9ae29662ad62eef37d5702b52d7eb8907df894b7ec30dafd82b5151fbba53be4c5c6dfa8ee8604e9d1349d9cc7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-trustedsigning \
python314-azure-mgmt-trustedsigning \
python3dist-azure-mgmt-trustedsigning"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
