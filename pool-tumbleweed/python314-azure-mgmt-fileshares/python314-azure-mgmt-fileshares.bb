SUMMARY = "Microsoft Azure FileShares Management Client Library"
DESCRIPTION = "This is the Microsoft Azure FileShares Management Client Library. \
 \
This package has been tested with Python 3.10+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-fileshares-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "0b7c4471d1fd07222060830b3d9abe5ac73d014ed4bf6b1e1f535447c9a09808f5f65f3cbc2b1b5681c25234570b8b4fa05bc64f0fb5d19e6505eb25e71a384a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-fileshares \
python314-azure-mgmt-fileshares \
python3dist-azure-mgmt-fileshares"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
