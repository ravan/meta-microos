SUMMARY = "Microsoft Azure Edgeorder Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Edgeorder Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python314-azure-mgmt-edgeorder-3.0.0-1.1.noarch.rpm"
RPM_HASH = "45b3510cea28c05fe4b8a708f70360db709aad9d6cda9f1330e6c82ed49792e2aea853fdc15798399a3d07148968a35865765eefa7998c79e0720e9b3c4ecf46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-edgeorder \
python314-azure-mgmt-edgeorder \
python3dist-azure-mgmt-edgeorder"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
