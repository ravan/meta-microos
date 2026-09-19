SUMMARY = "Microsoft Azure Migrationdiscoverysap Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Migrationdiscoverysap Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-migrationdiscoverysap-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "d11a90cf6d63a1d6960e0ffe6327d5a54ca74394d6a2f68271801563170c1eeceea416a3fa4d5c02dcc878aba03fc8ac6ddc3ea53f0050bffaf59924df7207d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-migrationdiscoverysap \
python314-azure-mgmt-migrationdiscoverysap \
python3dist-azure-mgmt-migrationdiscoverysap"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
