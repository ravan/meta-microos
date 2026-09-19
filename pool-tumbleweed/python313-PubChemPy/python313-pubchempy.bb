SUMMARY = "A simple Python wrapper around the PubChem PUG REST API"
DESCRIPTION = "PubChemPy provides a way to interact with PubChem in Python. It allows chemical \
searches by name, substructure and similarity, chemical standardization, \
conversion between chemical file formats, depiction and retrieval of chemical \
properties."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "python313-PubChemPy-1.0.5-1.4.noarch.rpm"
RPM_HASH = "9f1c91487a9bfb41cb37848d355b455c40f9b9635d38f12fd29e7fd39250513ff4e470a9dc85b81121bfe48467f9b17d9dc599075c6d5ac0fc74f501aa468728"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PubChemPy \
python3.13dist-pubchempy \
python313-PubChemPy \
python3dist-pubchempy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
