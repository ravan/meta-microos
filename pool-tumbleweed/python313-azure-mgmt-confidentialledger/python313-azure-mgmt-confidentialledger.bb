SUMMARY = "Microsoft Azure Confidential Ledger Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Confidential Ledger Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-azure-mgmt-confidentialledger-1.0.1-1.2.noarch.rpm"
RPM_HASH = "1dda4a4d19abe996519b8a6b56f7e8c08305a6bdd6141049a120d975ae5b82a39f6c69ebc562eec53b02e9cd75c097b90ca68d6c929ff887c4fd751b4bbce6a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-confidentialledger \
python3.13dist-azure-mgmt-confidentialledger \
python313-azure-mgmt-confidentialledger \
python3dist-azure-mgmt-confidentialledger"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
