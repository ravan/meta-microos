SUMMARY = "A simple implementation of the OWL2 RL Profile, as well as a basic RDFS inference"
DESCRIPTION = "A simple implementation of the OWL2 RL Profile, as well as a basic RDFS inference, \
on top of RDFLib. Based mechanical forward chaining."
LICENSE = "W3C"

PV = "7.1.3"

RPM_NAME = "python313-owlrl-7.1.3-1.2.noarch.rpm"
RPM_HASH = "279cffaa76fa9a1e314f9f810ff255150261155b8c37029b826e70991e0175c8c0a513dceaee3c9b715bbb89bd2ac6ea9a1ce3d9ca63dbc64865fc35a88b080f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-owlrl \
python3.13dist-owlrl \
python313-owlrl \
python3dist-owlrl"

RDEPENDS:${PN} += "python-abi \
update-alternatives"

inherit rpm
