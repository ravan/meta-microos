SUMMARY = "MS Azure Servicefabricmanagedclusters Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Servicefabricmanagedclusters Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python314-azure-mgmt-servicefabricmanagedclusters-3.0.0-1.2.noarch.rpm"
RPM_HASH = "e8486c9d062b438f677f10409ca102572b1f52ac0f6cd4add0236bf20b7e359af7086944c5918f42519419775ed592f60bae0857b113e038111972a1b1183d25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-servicefabricmanagedclusters \
python314-azure-mgmt-servicefabricmanagedclusters \
python3dist-azure-mgmt-servicefabricmanagedclusters"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
