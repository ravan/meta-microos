SUMMARY = "Microsoft Azure Hybridconnectivity Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Hybridconnectivity Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-hybridconnectivity-1.0.0-2.9.noarch.rpm"
RPM_HASH = "295df2bc2438cba348833d9c53fd06913ad41b9a395ef0ee73af04cfd97d45be2fabf01a15718813ae6860eda911afffedfe1dc1e2248584cd171a051f98cce8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-hybridconnectivity \
python314-azure-mgmt-hybridconnectivity \
python3dist-azure-mgmt-hybridconnectivity"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
