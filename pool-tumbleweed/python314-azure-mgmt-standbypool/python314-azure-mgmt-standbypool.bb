SUMMARY = "Microsoft Azure Standbypool Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Standbypool Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python314-azure-mgmt-standbypool-2.1.0-1.2.noarch.rpm"
RPM_HASH = "9a392e67b1815a7dcbeba6e1d38b083f47a1786ab07952f431a94989463d28993f12dce89a652d0ce20c7673c30b26c782fe6c6ef45bb6b3dc1b397e68fa5389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-standbypool \
python314-azure-mgmt-standbypool \
python3dist-azure-mgmt-standbypool"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
