SUMMARY = "Microsoft Azure Pineconevectordb Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Pineconevectordb Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python313-azure-mgmt-pineconevectordb-1.0.0~b2-1.5.noarch.rpm"
RPM_HASH = "bc7ba4693e1e2ca9385347de4abbf3c49c17e44609c6d9930bf08629ba01e628e7dee2a1fb33fef99d56f72758dd9c979dc711e583dd8ffca1134d8060f4b206"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-pineconevectordb \
python3.13dist-azure-mgmt-pineconevectordb \
python313-azure-mgmt-pineconevectordb \
python3dist-azure-mgmt-pineconevectordb"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
