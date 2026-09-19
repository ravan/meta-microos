SUMMARY = "Microsoft Azure Carbonoptimization Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Carbonoptimization Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-carbonoptimization-1.0.0-1.5.noarch.rpm"
RPM_HASH = "060b77458dc201c0d6bae23f6086a27c89d8acecf48033a55630a6f4a32472320845c8a0b306a2eac871cf96c40daa445261d93b6b7236bec640bc4612210ff6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-carbonoptimization \
python314-azure-mgmt-carbonoptimization \
python3dist-azure-mgmt-carbonoptimization"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
