SUMMARY = "Microsoft Azure Quantum Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Quantum Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b5"

RPM_NAME = "python314-azure-mgmt-quantum-1.0.0b5-1.9.noarch.rpm"
RPM_HASH = "1055dd9c4a49d068f1c6dd2d59c748d954b30715787de4bb94879a48605ffe0ce853d662729caf8acab99e5ad0a8d9b82b9c31a1053a4800c8d0569e6262c8d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-quantum \
python314-azure-mgmt-quantum \
python3dist-azure-mgmt-quantum"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
