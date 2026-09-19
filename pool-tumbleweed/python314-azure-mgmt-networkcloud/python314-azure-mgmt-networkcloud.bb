SUMMARY = "Microsoft Azure Networkcloud Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Networkcloud Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python314-azure-mgmt-networkcloud-2.2.0-1.4.noarch.rpm"
RPM_HASH = "151018c36fa9343a9dc071e431f3807a7ec073830694273edebda0c110a8a87223a3a4d47b421face91a10b28fab8c6c7f5e98deef0755a6ebe15214360b54a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-networkcloud \
python314-azure-mgmt-networkcloud \
python3dist-azure-mgmt-networkcloud"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
