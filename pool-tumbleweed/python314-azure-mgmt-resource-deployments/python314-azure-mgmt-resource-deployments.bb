SUMMARY = "Microsoft Azure Resource Resource-Deploymentstacks Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resource Resource-Deploymentstacks Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-resource-deployments-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "69b8da5b9b17ebe84cc1fdd864fcf509c8224529c5303e728c5f36caeb70a55ab35bfb7885c070f6a9b090365150d8b3fb11f7b59c630917c46c6d6ffd9522db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-resource-deployments \
python314-azure-mgmt-resource-deployments \
python3dist-azure-mgmt-resource-deployments"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-mgmt-resource \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
