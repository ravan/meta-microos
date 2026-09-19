SUMMARY = "Microsoft Azure Fabric Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Fabric Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-fabric-1.0.0-1.5.noarch.rpm"
RPM_HASH = "c8f6ed95eb9833ea91cebdfaea88ecbbc424d65e1e5bec92ac9548e7e86d315531ee8c7b7e9011b594b9894253277ad215efb05e7b549c4fd151448eda1d386d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-fabric \
python314-azure-mgmt-fabric \
python3dist-azure-mgmt-fabric"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
