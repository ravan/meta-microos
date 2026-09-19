SUMMARY = "A simple Python wrapper around the PubChem PUG REST API"
DESCRIPTION = "PubChemPy provides a way to interact with PubChem in Python. It allows chemical \
searches by name, substructure and similarity, chemical standardization, \
conversion between chemical file formats, depiction and retrieval of chemical \
properties."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "python314-PubChemPy-1.0.5-1.4.noarch.rpm"
RPM_HASH = "03ad46653f6b9de4486380d96c84be7e1c0a077465dacfbbdaf50aefa7ac384be82cb6248c8822b9b6b8ac9ec8d7f22d240326230693f333529b7d2565456926"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pubchempy \
python314-PubChemPy \
python3dist-pubchempy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
