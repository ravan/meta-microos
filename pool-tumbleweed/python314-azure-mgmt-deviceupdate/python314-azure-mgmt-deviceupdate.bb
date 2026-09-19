SUMMARY = "Microsoft Azure Deviceupdate Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Deviceupdate Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-azure-mgmt-deviceupdate-1.1.0-2.9.noarch.rpm"
RPM_HASH = "d11553133cc051e8aabcf1297aee5d904d16cdcd8d36f66f2e8a8425acada4108e8f26b75d8dbfe3180e7798e0697c0fd9569ecd5316535dcd05343aef1fb48e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-deviceupdate \
python314-azure-mgmt-deviceupdate \
python3dist-azure-mgmt-deviceupdate"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
