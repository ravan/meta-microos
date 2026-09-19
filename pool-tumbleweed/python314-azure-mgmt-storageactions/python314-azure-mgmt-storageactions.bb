SUMMARY = "Microsoft Azure Storageactions Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Storageactions Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-storageactions-1.0.0-1.5.noarch.rpm"
RPM_HASH = "bd2bb1e0c2ff291036963595979a29b70387c826f5bdd9f5183ac0b8450794dbda599831cbea3f8fe466635e270708941e762799fa4a6ea2aee60715964f64d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-storageactions \
python314-azure-mgmt-storageactions \
python3dist-azure-mgmt-storageactions"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
