SUMMARY = "Python SHACL Validator"
DESCRIPTION = "This is a pure Python module which allows for the validation of RDF graphs against \
Shapes Constraint Language (SHACL) graphs. This module uses the rdflib Python \
library for working with RDF or is dependent on the OWL-RL Python \
module for OWL2 RL Profile based expansion of data graphs."
LICENSE = "Apache-2.0"

PV = "0.30.1"

RPM_NAME = "python313-pyshacl-0.30.1-1.2.noarch.rpm"
RPM_HASH = "f03936869711f502980b64e863f1a342e7a1bfe7f3c0696cd34c58e3dcc7699cba2be9d2a447ea7b69b4cd49920c982320d535f38d1fc8272fdf5fdc3ff9d669"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyshacl \
python3.13dist-pyshacl \
python313-pyshacl \
python3dist-pyshacl"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-owlrl \
python313-prettytable \
python313-pyduktape2 \
update-alternatives"

inherit rpm
