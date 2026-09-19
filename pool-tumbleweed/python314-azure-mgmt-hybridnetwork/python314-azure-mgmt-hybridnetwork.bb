SUMMARY = "Microsoft Azure Hybridnetwork Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Hybridnetwork Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-azure-mgmt-hybridnetwork-2.0.0-2.9.noarch.rpm"
RPM_HASH = "c7db308d129c68f8b10f0b01bb431065234b3cc712e585f7fc27e01e2f70ba24728a67df485aa1ac1fa51bdd8be08a3870d4ea869a71f76ae130bdec4e4fa9c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-hybridnetwork \
python314-azure-mgmt-hybridnetwork \
python3dist-azure-mgmt-hybridnetwork"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
