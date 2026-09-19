SUMMARY = "Microsoft Azure DigitalTwins Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Digitaltwins Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python314-azure-mgmt-digitaltwins-7.0.0-1.9.noarch.rpm"
RPM_HASH = "bbfaa1b7a953f404c3afe68df723307c8c9bdd7281fa2ea71e172de60a0d49cdc84f7f1249007b83a913c368c6d99e00e697720cad86c3e03550d7db9653b8d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-digitaltwins \
python314-azure-mgmt-digitaltwins \
python3dist-azure-mgmt-digitaltwins"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
