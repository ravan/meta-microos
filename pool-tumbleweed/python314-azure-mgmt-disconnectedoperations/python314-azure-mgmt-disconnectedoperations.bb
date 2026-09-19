SUMMARY = "Microsoft Azure Disconnectedoperations Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Disconnectedoperations Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-disconnectedoperations-1.0.0-1.3.noarch.rpm"
RPM_HASH = "594ccf551f82e47214113d94e9ecc70a1005b65427451b4c35ec9459fd2b4b7b8723da9e57c090be23fb59b26b886bc28d7b733159420f765d629d70b4cd9a44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-disconnectedoperations \
python314-azure-mgmt-disconnectedoperations \
python3dist-azure-mgmt-disconnectedoperations"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
