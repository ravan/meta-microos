SUMMARY = "Microsoft Azure Resource Mover Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resource Mover Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0.0"

RPM_NAME = "python314-azure-mgmt-resourcemover-1.1.0.0-2.9.noarch.rpm"
RPM_HASH = "eae6b0ef92d6fdb9907fec15863e93600ae55aaa2e054c8e4ba0d4064221f44ecd86d0929f3b3c8fafa8aaddc9f62a149c83a11af8f867461465d5366986f9df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-resourcemover \
python314-azure-mgmt-resourcemover \
python3dist-azure-mgmt-resourcemover"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
