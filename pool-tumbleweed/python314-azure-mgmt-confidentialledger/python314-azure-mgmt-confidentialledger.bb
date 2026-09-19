SUMMARY = "Microsoft Azure Confidential Ledger Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Confidential Ledger Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-azure-mgmt-confidentialledger-1.0.1-1.2.noarch.rpm"
RPM_HASH = "e9b9f4b510bc5e65fd6a8b67468a8520afd4e4894de81f8cec8951dd53d6693f68b8df24980a913ed77af6bcc56e20f3f1a0064be0d16a8bb7202b609d4f2639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-confidentialledger \
python314-azure-mgmt-confidentialledger \
python3dist-azure-mgmt-confidentialledger"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
