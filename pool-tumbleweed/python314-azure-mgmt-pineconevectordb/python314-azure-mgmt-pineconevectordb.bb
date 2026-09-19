SUMMARY = "Microsoft Azure Pineconevectordb Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Pineconevectordb Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python314-azure-mgmt-pineconevectordb-1.0.0~b2-1.5.noarch.rpm"
RPM_HASH = "3762b9412a0cba13b049231fb5ec35fb55ce0e391d6354e531859273c842decabcce6f4f47e5edcafc2385c8e7d0a9f45e97a5d9c932eab4ac2de73c68d1572b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-pineconevectordb \
python314-azure-mgmt-pineconevectordb \
python3dist-azure-mgmt-pineconevectordb"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
