SUMMARY = "Microsoft Azure Changeanalysis Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Changeanalysis Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-azure-mgmt-changeanalysis-1.0.1-1.2.noarch.rpm"
RPM_HASH = "6799e2006978bf9db3a04b1f3e8cea1e374cb14da3a0ea90cf9a51c19fee79a29473f03e7351fc46a24bc3e14930fb72219c1fe2b3cb2ec6b43662d220b4cb8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-changeanalysis \
python314-azure-mgmt-changeanalysis \
python3dist-azure-mgmt-changeanalysis"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
