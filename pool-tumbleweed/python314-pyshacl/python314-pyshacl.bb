SUMMARY = "Python SHACL Validator"
DESCRIPTION = "This is a pure Python module which allows for the validation of RDF graphs against \
Shapes Constraint Language (SHACL) graphs. This module uses the rdflib Python \
library for working with RDF or is dependent on the OWL-RL Python \
module for OWL2 RL Profile based expansion of data graphs."
LICENSE = "Apache-2.0"

PV = "0.30.1"

RPM_NAME = "python314-pyshacl-0.30.1-1.2.noarch.rpm"
RPM_HASH = "5415924e11b8791edd2a8c7af77cfd9d3d67ef96b506f080b7594773e125d9e8faabe7b25f25f6d80a3de81319e34920d5395cef0242d3e3162cf28af7af874f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyshacl \
python314-pyshacl \
python3dist-pyshacl"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-owlrl \
python314-prettytable \
python314-pyduktape2 \
update-alternatives"

inherit rpm
